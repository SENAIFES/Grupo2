
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
    public void iniciar(int id){
        atualizarTabela(id);
        
        view.setVisible(true);
       
    }

    private void atualizarTabela(int idLista) {
        
        TarefaDAO tarefaDao = new TarefaDAO();
        List <Tarefa> lista = new ArrayList();
        Tarefa tarefa = new Tarefa();
        
        TarefaTableModel ttm = new TarefaTableModel();
        ttm.setLista(lista);
        
        view.getTblTarefa().setModel(ttm);
        tarefaDao.listarTodos(idLista);
        for
            
        }
        
    }
}
