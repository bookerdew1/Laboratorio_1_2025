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
public class Rodriguez_Jarol_cuotas {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Ingrese el monto total: ");
        double monto = lea.nextDouble();
        
        System.out.println("Ingrese la tasa de intereses: ");
        double interes = lea.nextDouble() / 100;
        
        System.out.println("Ingrese la cantidad de meses a pagar la cuota: ");
        int meses = lea.nextInt();
        
        double couta = calcularcuota(monto, interes, meses);
        
        double total = couta * meses;
        
        System.out.printf("**** Couta Mensual****\n");
        System.out.printf("La couta por meses es:HNL %.2f%n", couta);
        System.out.printf("EL total a pagar es de:Lps %.2f", total);
              
        
        
    }
    
    public static double calcularcuota(double monto, double interes, int meses){
     double factor = Math.pow(1 + interes, meses);
     return monto * (interes * factor)/(factor-1);
    }
    
}
