
package entity;

import dao.ListaDAO;
import dao.TarefaDAO;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class NovoMain {

    
    public static void main(String[] args) {
        ListaDAO listaDAO = new ListaDAO();
        Lista lista= new Lista();
        
        TarefaDAO tarefaDAO =new TarefaDAO();
        Tarefa tarefa = new Tarefa();
        
        
        lista.setNome("Jaime vai");
        listaDAO.salvar(lista);
        
        
        listaDAO.listarTodos();
        tarefa.setDescricao("Comprar ovo");
        Date umaData = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.set(2016, 1, 1);
        tarefa.setPrazo(umaData);
        tarefa.setFeito(false);
        tarefa.setIdLista(5);
         
        tarefaDAO.salvar(tarefa,1);
        
        
        System.out.println(listaDAO.listarTodos());
        System.out.println(listaDAO.listaTarefas(5));
    }
    
}
