/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_programacion_1.Laboratorio_semana_1;

import java.util.Scanner;

/**
 *
 * @author Booker
 */
public class Rodriguez_Jarol_PlantillaDeTrabajo {
    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = lea.nextLine();
        
        System.out.println("Ingrese las hora trabajdas mensualmente: ");
        int Htrabajadas = lea.nextInt();
        
        System.out.println("Ingrese la tarifa por hora de trabajo: ");
        double tarifa = lea.nextDouble();
        
        double salario = (Htrabajadas * tarifa)/4;
        
        System.out.println("**** Boleta De Trabajo **** "
                + "\nNombre del Empleado: "+ nombre
                + "\nHoras Trabajas mensualmente: " + Htrabajadas
                + "\nTarifa por hora de trabajo: Lps"+ tarifa 
                + " \nSalario del empleado semanalmente: Lps" + salario);
    }
    
}
