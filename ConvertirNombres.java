import java.util.Scanner;
public class ConvertirNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
String nombre;
//Ciclo repetitivo
while (true) {
    System.out.println("Ingrese un nombre completo en minusculas (escribe salir para terminar):");
    nombre = entrada.nextLine();
    //Verificar si el usuario desea salir
    if (nombre.trim().equalsIgnoreCase("salir")) {
        System.out.println("Programa terminado.");
        break;
}
//Convertir a mayusculas
String nombreMayusculas = nombre.toUpperCase();
System.out.println("Nombre en mayusculas: " + nombreMayusculas);

       
    
}
entrada.close();
    }
}
