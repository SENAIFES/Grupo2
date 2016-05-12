package controllerUtil;

import dao.TarefaDAO;
import entity.Tarefa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import view.Principal;
import view.TarefaTableModel;

public class PrincipalController {

    private Principal view;

    public PrincipalController(Principal view) {
        this.view = view;
    }

    public void iniciar(int idLista) {
        atualizarTabela(idLista);

        view.setVisible(true);

    }

    public void atualizarTabela(int idLista) {

        TarefaDAO tarefaDao = new TarefaDAO();

        Tarefa tarefa = new Tarefa();

        TarefaTableModel ttm = new TarefaTableModel();
        ttm.setLista(tarefaDao.listarTodos(idLista));

        view.getTblTarefa().setModel(ttm);
        
        
        ;

    }

}
