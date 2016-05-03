package dao;

import entity.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TarefaDAO {

    public boolean salvar(Tarefa tarefa, int idLista) {
        if (tarefa.getId() == 0) {
            return insert(tarefa, idLista);
        } else {
            return update(tarefa);
        }
    }

    private boolean insert(Tarefa tarefa, int idLista) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("INSERT INTO Tarefa "
                            + "(descricao, prazo, feito, idLista)  "
                            + "VALUES ( ?, ?, ?, ?)");
            ps.setString(1, tarefa.getDescricao());
            ps.setDate(2, new java.sql.Date(tarefa.getPrazo().getTime()));
            ps.setBoolean(3, tarefa.getFeito());
            ps.setInt(4, tarefa.getIdLista());

            ps.execute();
            ps.close();
            conn.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean update(Tarefa tarefa) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Tarefa "
                    + "SET nome = ?, feito = ?, prazo = ?"
                    + " WHERE idLista = ?");
            ps.setString(1, tarefa.getDescricao());
            ps.setBoolean(2, tarefa.getFeito());
            ps.setDate(3, new java.sql.Date(tarefa.getPrazo().getTime()));
            ps.setInt(4, tarefa.getIdLista());
            

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
                    = conn.prepareStatement("DELETE FROM Tarefa "
                            + "WHERE idTarefa = ?");
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

    public boolean deleteLista(int id) {
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("DELETE FROM Tarefa "
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

    public List<Tarefa> listarTodos() {
        List<Tarefa> listaTarefa = new ArrayList<Tarefa>();
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps
                    = conn.prepareStatement("SELECT descricao, prazo, feito, idTarefa, idLista "
                            + " FROM Tarefa");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("idTarefa"));
                tarefa.setDescricao(rs.getString("descricao"));
                tarefa.setPrazo(rs.getDate("prazo"));
                tarefa.setFeito(rs.getBoolean("feito"));
                tarefa.setIdLista(rs.getInt("idLista"));

                listaTarefa.add(tarefa);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaTarefa;
    }

}
