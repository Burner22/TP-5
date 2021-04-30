
package trabajo.practico.pkg5;


public class TrabajoPractico5 {


    public static void main(String[] args) {
        
        int b [] = {9,5,6,4,8,7,2};  
        int [][] c = {{6,7,5,0,4}, {3, 8, 4}, {1,0,2,7}, {9,5}};
        String d = "Ezequiel";

        Arreglo a = new Arreglo();
        
        a.sumaEntero(b);
        a.numMayor(c);
        a.cuentaVocal(d);
        a.cuentaCaracter(d,'e');
    
    }
    
}
