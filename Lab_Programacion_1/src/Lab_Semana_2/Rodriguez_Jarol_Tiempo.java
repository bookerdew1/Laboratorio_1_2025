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
public class Rodriguez_Jarol_Tiempo {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de segundos: ");
        int totalSegundos = lea.nextInt();
        
        String mensaje = (totalSegundos <= 0) ? "No se permite este valor " : "";
        
        if (totalSegundos <= 0){
            System.out.println(mensaje);
            return;
        }
        
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600)/60;
        int segundos = (totalSegundos % 60);
        
        System.out.println("Equivalente\n"
                + horas + " Horas, "+ minutos + " Minutos, " + segundos + " Segundos "
        );
    }
    
}
