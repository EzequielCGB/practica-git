import java.util.Scanner;
public class Proyecto{
    
    public static void main(String[] args){
        
        String nombre;

        
        Scanner teclado = new Scanner(System.in);




        System.out.println("Ingrese un nombre");
        nombre = teclado.next();
        System.out.println("Nombre: " + nombre);
        teclado.close();
    }
}
