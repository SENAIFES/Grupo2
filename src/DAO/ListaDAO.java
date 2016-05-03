package dao;

import entity.Lista;
import entity.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaDAO {

    public boolean salvar(Lista lista) {
        if (lista.getId() == 0) {
            return inserir(lista);
        } else {
            return update(lista);
        }
    }

    private boolean inserir(Lista lista) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("INSERT INTO Lista "
                            + "(nome) "
                            + "VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lista.getNome());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean update(Lista lista) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Lista "
                    + "SET nome = ?"
                    + " WHERE idLista = ?");
            ps.setString(1, lista.getNome());
            ps.setInt(2, lista.getId());

            ps.execute();

            ps.close();
            conn.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean delete(int id) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("DELETE FROM Lista "
                            + "WHERE idLista = ?");
            ps.setInt(1, id);

            ps.execute();

            ps.close();
            conn.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public List<Lista> listarTodos() {
        List<Lista> listaDeListas = new ArrayList<Lista>();
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("SELECT *"
                            + " FROM Lista");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Lista lista = new Lista();
                lista.setId(rs.getInt("idLista"));
                lista.setNome(rs.getString("Nome"));

                listaDeListas.add(lista);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaDeListas;
    }

    public List<Tarefa> listaTarefas(int id) {
        List<Tarefa> listaTarefas = new ArrayList<>();
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("SELECT *"
                            + "FROM Tarefa WHERE idlista = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("idTarefa"));
                tarefa.setDescricao(rs.getString("Descricao"));
                tarefa.setPrazo(rs.getDate("Prazo"));
                tarefa.setFeito(rs.getBoolean("Feito"));
                

                listaTarefas.add(tarefa);
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaTarefas;

    }

}
