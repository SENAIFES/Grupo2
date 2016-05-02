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

    public int salvar(Lista lista) {
        if (lista.getId() == 0) {
            return inserir(lista);
        } else {
            return update(lista);
        }
    }

    private int inserir(Lista lista) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("INSERT INTO Lista "
                            + "(nome) "
                            + "VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lista.getNome());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                lista.setId(rs.getInt(1));
            }

            TarefaDAO tarefaDAO = new TarefaDAO();
            for (Tarefa tarefa : lista.getListatarefa()) {
                tarefaDAO.salvar(tarefa, lista.getId());
            }

            ps.close();
            conn.close();
            return lista.getId();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    private int update(Lista lista) {
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
            return lista.getId();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int delete(Lista lista) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("DELETE FROM Lista "
                            + "WHERE idLista = ?");
            ps.setInt(1, lista.getId());

            ps.execute();

            ps.close();
            conn.close();
            return lista.getId();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public List<Lista> listarTodos() {
        List<Lista> lista = new ArrayList<Lista>();
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("SELECT idLista, nome"
                            + " FROM Lista");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Lista listaDeListas = new Lista();
                listaDeListas.setId(rs.getInt("idLista"));
                listaDeListas.setNome(rs.getString("nome"));
                

                TarefaDAO tarefaDAO = new TarefaDAO();
               

                listaDeListas.add(lista);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    

    
}
