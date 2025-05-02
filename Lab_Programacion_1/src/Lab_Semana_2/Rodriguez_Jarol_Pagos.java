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
public class Rodriguez_Jarol_Pagos {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        System.out.println("Ingrese el Codigo del Empleado: ");
        String codigo = lea.nextLine();
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = lea.nextLine();
        
        System.out.println("Ingrese el Apellido del empleado: ");
        String apellido = lea.nextLine();
        
        System.out.println("Ingrese las horas Trabajadas: ");
        int HorasTrabajadas = lea.nextInt();
        
        System.out.println("Ingrese la categoria (1 o 4): ");
        int categoria = lea.nextInt();
        
        double PagoHoraNormal = 35.99;
        
       int HorasNormales;
        if(HorasTrabajadas <= 40){
           HorasNormales = HorasTrabajadas; 
        }else {
            HorasNormales = 40;
        }
        int HorasExtras;
        if(HorasTrabajadas > 40){
            HorasExtras = (HorasTrabajadas - 40);
        } else {
            HorasExtras = 0;
        }
        
        if (HorasExtras > 15){
            HorasExtras = 15;
        }
        
        double pagoextra = 0;
        
        switch (categoria){
            case 1: 
                pagoextra = HorasExtras * 40.00;
                break;
            
            case 2:
                pagoextra = HorasExtras * 50.00;
                break;
            
            case 3:
                pagoextra = HorasExtras * 85.00;
                break;
                
            case 4:
                pagoextra = 0;
                HorasExtras = 0;
                break;
            default:
                System.out.println("La categoria es invladida");
                return;
        }
        
        double pagototal = (HorasTrabajadas * PagoHoraNormal)+ pagoextra;
        
        // Mostrar resultados
        System.out.println("\n--- Resumen de pago ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Categoría: " + categoria);
        System.out.println("Horas normales: " + HorasNormales);
        System.out.println("Horas extra pagadas: " + HorasExtras);
        System.out.printf("Pago total: $%.2f\n", pagototal);
        
        
    }
}
