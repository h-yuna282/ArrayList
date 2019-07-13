
package hyuna;
import java.util.*;
import java.util.Scanner;
public class Hyuna {


    public static void main(String[] args) {
        double x = 100, v = 0, p = 0, t = 0,g=0;
        boolean fin = true;
        int r;
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nombre = new ArrayList();
        ArrayList <Double> velocidad = new ArrayList();
        ArrayList <Double> tiempo = new ArrayList(); 
        while(fin){
            System.out.println("introdusca el nombre del estudiante" );
            nombre.add(sc.next());
            System.out.println("ingrese la velocidad del estudiante ");
            velocidad.add(sc.nextDouble());
            System.out.println("desea agregar a alguien mas? 1(Si) 2(No)");
            r = sc.nextInt();
            if (  r==2  ){
                fin = false;
            }
        } 
       double prom=0 ;
        int mp = 0;
        for( int xx=0;xx<velocidad.size();xx++){
             t = x/velocidad.get(xx);
             tiempo.add(t);
             prom = (p/velocidad.get(xx));
             }
           
        for (int i = 0 ; i < velocidad.size(); i++){
            if (velocidad.get(i) > g){
                g = velocidad.get(i);
            }
        }
        for (int u = 0;u>velocidad.size();u++){
        for (int j = 0 ; j < velocidad.size() ; j++){
            if (velocidad.get(j) == g){
               
                System.out.println("el estudiante "+nombre.get(j)+"Este es el mas rapido");
            }
            if (velocidad.get(j)>prom){
                mp++; 
            }
            System.out.println((j+1)+"  "+nombre.get(j)+" velocidad: "+velocidad.get(j)+" tiempo: "+tiempo.get(j));
        }
              
    }
        System.out.println("este es el promedio : "+prom);
        System.out.println("los  estudiantes encima del promedio son: "+mp);
        
        }
    
}
    

