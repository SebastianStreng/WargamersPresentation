/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamerspresentation;
import java.util.Random; 

/**
 *
 * @author sebas
 */
public class RandomGenerator {
     public static int generateRandom(int min, int max ) {
         
        Random cube = new Random();
        int counter =min + cube.nextInt(max);
        //System.out.println(counter);
        
        return counter;
    }
}
