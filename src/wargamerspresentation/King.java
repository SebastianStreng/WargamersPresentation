/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamerspresentation;
import java.util.Scanner; 

/**
 *
 * @author sebas
 */
public class King {
    
    //Eigenschaften 
    String name; 
    private int warriors;
    
    //Konstruktor
    King(String name, int warriors){
        this.name = name; 
        this.warriors = warriors; 
    }
    
    
    
    
    @Override
    public String toString() {
        String s = name+ "\n" + "Warriors: " + warriors + "\n";
        return s;
    }
    
    //Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWarriors() {
        return warriors;
    }

    public void setWarriors(int warriors) {
        this.warriors = warriors;
    }
    
    
    
    
    
     public void selectInteraction(King king, int damageStrength) {
        System.out.println("Please select one of the following interactions: ");
        System.out.println("1. attack");
        System.out.println("2. run over");    
        
        Scanner myScanner = new Scanner(System.in);
        int decision = myScanner.nextInt();
        
         switch (decision) {
            case 1:
                this.attack(king, damageStrength);
                break;
            case 2:
                this.run_over_King(king);
                break;
            default:
                System.out.println("please type the right number of your prefered attack. ");
                break;
        }
     }
     
      public void attack(King king, int damageStrength){
         
         king.setWarriors((int) (king.getWarriors() * 0.7)); 
         System.out.println(this.name + " has attacked " + king.getName() + "´s armee. " +
                 king.getName() + " has now " + king.getWarriors() + " warriors left.");
    }
      
      public void run_over_King(King king){
        int run_over_indicator = wargamerspresentation.RandomGenerator.generateRandom(1, (int) king.getWarriors());
        king.setWarriors(king.getWarriors() - run_over_indicator); 
        this.warriors = this.warriors + run_over_indicator; 
        System.out.println(run_over_indicator + " warriors leave " +  king.getName() + "´s army and change sites."); 
    }
     
     
     
}
