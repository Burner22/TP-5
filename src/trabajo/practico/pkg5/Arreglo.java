
package trabajo.practico.pkg5;

public class Arreglo {
    static int aux;
    
    public static void sumaEntero (int a []){
        for (int i : a) {
           aux += i;
        }
        System.out.println(aux);
        aux=0;
    } 
    
    public static void numMayor (int b [][]){
        for(int x = 0 ; x < b.length ; x++){
          for(int y = 0 ; y < b[x].length ; y++){
            if(b[x][y] >= aux){
                aux = b[x][y];
            }   
          }
      }            
        System.out.println(aux);
        aux=0;
    }
    
    public static void cuentaVocal (String c){
        for (int i = 0 ; i < c.length() ; i++){
            if((c.charAt(i)=='a') || (c.charAt(i)=='e') || (c.charAt(i)=='i') || (c.charAt(i)=='o') || (c.charAt(i)=='u')|| (c.charAt(i)=='A') || (c.charAt(i)=='E') || (c.charAt(i)=='I') || (c.charAt(i)=='O') || (c.charAt(i)=='U')){
                aux += 1;
            }
        }
        System.out.println(aux);
        aux=0;
    }
    
    public static void cuentaCaracter (String d, char e){
        String au = String.valueOf(e);
        for (int i = 0 ; i < d.length() ; i++){   
            if (d.charAt(i) == Character.toUpperCase(e) || d.charAt(i) == Character.toLowerCase(e)){
                aux += 1;
            }            
        }
        System.out.println(aux);
        //aux=0;
    }

}
