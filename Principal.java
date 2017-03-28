
package genericacalif;
import java.util.*;
public class Principal <T>{
     Scanner z=new Scanner(System.in);
     
    public static void main(String []args){
        
       Principal obj=new Principal();
       obj.Ingrese();
       
    }
    
    public void Ingrese(){
        String nom;
        int clave;
        T calif;
        System.out.print("Ingrese su nombre -> ");
        nom=z.next();
        System.out.print("Ingrese su Clave -> ");
        clave=z.nextInt();
        System.out.print("Ingrese su Calificacion -> ");//valor generico
        calif=(T) z.next();
        GenericaCalif obj=new GenericaCalif(nom,clave,calif);
        System.out.println(obj.toString());//se imprime el metodo toString
    }
}
