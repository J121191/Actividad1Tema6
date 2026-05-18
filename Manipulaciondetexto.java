import java.util.Scanner;
public class Manipulaciondetexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un texto largo (escribe FIN para terminar):");
        StringBuilder textocompleto = new StringBuilder();
        String linea;
//Leer varias lineas
        while (true) {
            linea = entrada.nextLine();
            //Finaliza la lectura si el usuario escribe "FIN"
            if (linea.trim().equalsIgnoreCase("FIN")) {
                break;
        }
            textocompleto.append(linea).append("\n");
        }
        //Convertir a String y minusculas
        String texto = textocompleto.toString().toLowerCase();
        //Eliminar signos de puntuacion
        texto = texto.replaceAll("[.,!?;:]", "");
        // Palabras a buscar
        String palabra = "ingenieria";
        //Separar palabras
        String[] palabras = texto.split("\\s+");
        int contador = 0;
        //Contar coincidencias
        for (String p : palabras) {
            if (p.equals(palabra)) {
                contador++;
            }
        }
        System.out.println("La palabra\"ingenieria\"  aparece " + contador + " veces.");
        entrada.close();
    }
}

    

