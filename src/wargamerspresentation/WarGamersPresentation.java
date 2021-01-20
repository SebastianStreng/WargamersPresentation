/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamerspresentation;
import wargamerspresentation.King; 

/**
 *
 * @author sebas
 */
public class WarGamersPresentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int minCubeValue = 1; 
        int maxCubeValue = 6; 
        int randomResult = wargamerspresentation.RandomGenerator.generateRandom(minCubeValue, maxCubeValue);
        
        
        King Arthur = new King ("Arthur", 1000); 
        King Ludwig = new King ("Ludwig", 1000); 
        
        int damageStrength = 200; 
        
        
         do {
            System.out.println(Arthur.toString());
            System.out.println(Ludwig.toString());

            System.out.println("It´s "+Arthur.getName()+" turn:");
            Arthur.selectInteraction(Ludwig, damageStrength);
            System.out.println("\nIt´s "+Ludwig.getName()+" turn:");
            //getRandomAttack(Ludwig, Arthur, damageStrength); 
            Ludwig.selectInteraction(Arthur, damageStrength);
            System.out.println("\n\n");
        }while (Arthur.getWarriors() > 0 && Ludwig.getWarriors() > 0); 

        if (Arthur.getWarriors() <= 0) System.out.println(Ludwig.getName()+" has won!");
        else System.out.println(Arthur.getName()+" has won!");
        
        System.out.println(Arthur.toString());
        System.out.println(Ludwig.toString());
        
    }
    
}
