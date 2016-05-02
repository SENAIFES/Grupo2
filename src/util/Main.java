
package util;

import controllerUtil.PrincipalController;
import view.Principal;

public class Main {

   
    public static void main(String[] args) {
        Principal view = new Principal();
        PrincipalController controller = new PrincipalController(view);
        controller.iniciar();

    }
}
