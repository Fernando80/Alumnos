/*
 * <T> inidica que la clase es generica
 * (un tipo de dato no especificado)
 */
package genericacalif;

public class GenericaCalif <T>{
    private int clave;
    private String nombre;
    private T calificacion;
    
    public GenericaCalif(){
        
    }
    public GenericaCalif(String nom,int cla, T cal){//ingresan los valores
        clave=cla;
        nombre=nom;
        calificacion=cal;
    }
    @Override
    public String toString() {
        return "\nClave: "+clave+" \nNombre: "+ nombre+" \nCalificacion: "+calificacion+"\n";
    }
    
    
}
