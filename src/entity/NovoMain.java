
package entity;

import dao.ListaDAO;
import dao.TarefaDAO;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class NovoMain {

    
    public static void main(String[] args) {
        ListaDAO l = new ListaDAO();
        Lista ll= new Lista();
        
        TarefaDAO t =new TarefaDAO();
        Tarefa tt = new Tarefa();
        
        
        ll.setNome("Venda");
        l.salvar(ll);
        
        
        
        tt.setDescricao("Comprar ovo");
        Date umaData = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.set(2016, 1, 1);
        tt.setPrazo(new Date());
         tt.setFeito(Boolean.FALSE);
         
         t.salvar(tt,1);
        
    }
    
}
