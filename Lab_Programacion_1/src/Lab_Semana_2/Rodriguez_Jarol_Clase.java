/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Semana_2;

import java.util.Scanner;

/**
 *
 * @author Booker
 */
public class Rodriguez_Jarol_Clase {
    public static void main(String[] args) {
        
   
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Ingrese la fecha en el formado dia/DD/MM: ");
        String fecha = lea.nextLine();
        
        int primerSlash = fecha.indexOf("/");
        int segundoSlash = fecha.indexOf("/", primerSlash +1);
        
        if (primerSlash == -1 || segundoSlash == -1){
            System.out.println("Error: Formato de fecha invaldio");
            return;
        }
        String dia = fecha.substring(0, primerSlash);
        int DD = Integer.parseInt(fecha.substring(primerSlash +1, segundoSlash));
        int MM= Integer.parseInt(fecha.substring(segundoSlash +1));
        
        if(DD < 1 || DD > 31 || MM < 1 || MM > 12){
            System.out.println("Error: dia o mes fuera del rango");
            return;
        }
        switch (dia){
            case "Lunes":
            procesarExamen (lea, "Inicial");
            break;
            
            case "Martes":
                procesarExamen (lea, "Medio");
                break;
                
            case "Miercoles":
                procesarExamen (lea, "Avanzado");
                break;
                
            case "Jueves":
                procesarPractica(lea);
                break;
                
            case "Viernes":
                procesarViajeros(lea, DD, MM);
                break;
            default:
                System.out.println("Error: dia se la semana no valido");
                
                
        }
        lea.close();
        
        }
    
    
    public static void procesarExamen(Scanner lea, String nivel) {
        System.out.println("Clase de nivel " + nivel + ". ¿Hubo exámenes? (sí/no): ");
        String huboExamen = lea.nextLine().toLowerCase();

        if (huboExamen.equals("sí") || huboExamen.equals("si")) {
            System.out.print("¿Cuántos alumnos aprobaron? ");
            int aprobados = lea.nextInt();
            System.out.print("¿Cuántos alumnos no aprobaron? ");
            int noAprobados = lea.nextInt();
            int total = aprobados + noAprobados;

            if (total == 0) {
                System.out.println("No hubo alumnos en el examen.");
                return;
            }

            double porcentaje = (aprobados * 100.0) / total;
            System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentaje);
        } else {
            System.out.println("No hubo exámenes.");
        }
    }

    
    public static void procesarPractica(Scanner scanner) {
        System.out.print("Ingresa el porcentaje de asistencia: ");
        double asistencia = scanner.nextDouble();
        if (asistencia > 50) {
            System.out.println("Asistió la mayoría.");
        } else {
            System.out.println("No asistió la mayoría.");
        }
    }

    
    public static void procesarViajeros(Scanner scanner, int dia, int mes) {
        if (dia == 1 && (mes == 1 || mes == 7)) {
            System.out.println("Comienzo de nuevo ciclo.");
            System.out.print("Cantidad de alumnos: ");
            int alumnos = scanner.nextInt();
            System.out.print("Precio por alumno ($): ");
            double precio = scanner.nextDouble();
            double ingreso = alumnos * precio;
            System.out.printf("Ingreso total: $%.2f\n", ingreso);
        } else {
            System.out.println("Clase de inglés para viajeros. Día normal.");
        }
    }
}
        

        
    
    

