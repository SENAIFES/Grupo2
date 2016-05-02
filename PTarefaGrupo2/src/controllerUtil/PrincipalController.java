/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerUtil;

import entity.Tarefa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import view.Principal;
import view.TarefaTableModel;

/**
 *
 * @author renann_schutz
 */
public class PrincipalController {
    
    
    private Principal view;

    public PrincipalController(Principal view) {
        this.view = view;
    }
    public void iniciar(){
        atualizarTabela();
        
        view.setVisible(true);
        
        
    }

    private void atualizarTabela() {
        List <Tarefa> lista = new ArrayList();
       
        
        TarefaTableModel ttm = new TarefaTableModel();
        ttm.setLista(lista);
        
        view.getTblTarefa().setModel(ttm);
    }
}
