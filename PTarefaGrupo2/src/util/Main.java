
package util;

import controllerUtil.PrincipalController;
import entity.Lista;
import view.Principal;

public class Main {

   
    public static void main(String[] args) {
        Principal view = new Principal();
        PrincipalController controller = new PrincipalController(view);
        Lista lista = (Lista) view.getCbLista().getSelectedItem();
        controller.iniciar(lista.getId());
        

    }
}
