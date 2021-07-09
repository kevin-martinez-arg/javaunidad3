package actividad.obligatoria;
import java.util.Scanner;
public class ActividadObligatoria {
    
    public static void main(String[] args) {
Scanner sc=new Scanner (System.in);        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String ide;
        String so;
       System.out.println("Ingrese su nombre:");
        nombre=sc.next();
        System.out.println("Ingrese su apellido:");
        apellido=sc.next();
        System.out.println("Ingrese su edad:");
        edad=sc.nextInt();
        System.out.println("Ingrese un hobbie:");
        hobbie=sc.next();
        System.out.println("¿Cual es su IDE favorito?");
        ide=sc.next();
        System.out.println("¿Que SO uitliza?");
        so=sc.next();
        System.out.println("Sus datos son:");
        System.out.println("Nombre:" +nombre);
        System.out.println("Apellido:" +apellido);
        System.out.println("Edad:" +edad);
        System.out.println("Hobbie:" +hobbie);
        System.out.println("Editor de codigo favorito:" +ide);
        System.out.println("Sistema operativo que usa:" +so);
    }
    
}
