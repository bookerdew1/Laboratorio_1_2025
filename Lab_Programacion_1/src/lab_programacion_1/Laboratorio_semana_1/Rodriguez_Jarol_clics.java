/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_programacion_1.Laboratorio_semana_1;

/**
 *
 * @author Booker
 */
public class Rodriguez_Jarol_clics {
    public static void main(String[] args) {
        
        double total = (60 * 0.30) + (100 * 0.25) + (20 * 0.80);
        int totalClics = 60 + 100 + 20;
        
        double costo = total / totalClics;
        double isv = total * 0.16;
        double totalConISV = total + isv;
        
        System.out.println("Costo promedio por clic: $" + String.format("%.2f", costo) 
        + " \nTotal sin ISV:  $"+ String.format("%.2f",total)
        +"\nISV (16%): $"+ String.format("%.2f", isv)
        +"\nTotal con ISV: $"+ String.format("%.2f", totalConISV));
       
    
    }
}
