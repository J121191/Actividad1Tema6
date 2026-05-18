import java.util.Scanner;
public class Comparaciondecadenas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Solicitar al usuario que ingrese dos cadenas de texto

        System.out.println("Ingrese la primera cadena:");
        String cadena1 = entrada.nextLine();
        System.out.println("Ingrese la segunda cadena:");
        String cadena2 = entrada.nextLine();
        //comparar longitud de las cadenas
        if (cadena1.length() > cadena2.length()) {
            System.out.println("La primera cadena es más larga que la segunda.");
        } else if (cadena1.length() < cadena2.length()) {
            System.out.println("La segunda cadena es más larga que la primera.");
        } else {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        }
        //comparar el contenido de las cadenas
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
        entrada.close();
    }
}
