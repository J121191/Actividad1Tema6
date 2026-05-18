import java.time.LocalDate;
import java.util.Scanner;
public class Conversiondefechas{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        //Solicitar al usuario que ingrese una fecha en formato "yyyy-MM-dd"
        System.out.println("ingrese una fecha en formato (yyyy-MM-dd)");
        String fechaTexto = entrada.nextLine();
        //Convertir la cadena de texto a un objeto LocalDate
        LocalDate fecha = LocalDate.parse(fechaTexto);
        //Operaciones con la fecha
        LocalDate UnaSemanaDespues = fecha.plusWeeks(1);
        LocalDate UnMesAntes = fecha.minusMonths(1);
        //Mostrar los resultados
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Una semana después: " + UnaSemanaDespues);
        System.out.println("Un mes antes: " + UnMesAntes);
        entrada.close();
        
    }
}
