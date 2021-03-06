package view;

import entity.Tarefa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TarefaTableModel extends AbstractTableModel {

    private List<Tarefa> lista;

    //Getters and Setters
    public List<Tarefa> getLista() {
        return lista;
    }

    public void setLista(List<Tarefa> lista) {
        this.lista = lista;
    }

    @Override

    public String getColumnName(int columnIndex) {

        if (columnIndex == 0) {

            return "Descrição";
        } else if (columnIndex == 1) {
            return "Prazo";
        } else if (columnIndex == 2) {
            return "Feito";
        } else {
            return "";
        }
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tarefa umaTarefa = lista.get(rowIndex);
        if (columnIndex == 0) {

            return umaTarefa.getDescricao();
        } else if (columnIndex == 1) {
            return umaTarefa.getPrazo();
        } else if (columnIndex == 2) {
            return umaTarefa.getFeito();
        } else {
            return "";

        }
    }

}
