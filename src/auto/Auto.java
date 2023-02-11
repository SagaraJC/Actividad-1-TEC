/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author WM Miramontes
 */
public class Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        automovil coche1 = new automovil("Volkswagen", "Beetle", 1990, "Manual", 1000);
        automovil coche2 = new automovil("Ford", "Fiesta", 2010, "Manual", 25000);
        
        System.out.println(coche1);
        System.out.println(coche2);
        coche1.avanzar();
        coche2.avanzar();
        coche1.frenar();
    }
    
}
