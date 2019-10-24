
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0800490
 */
public class GreaterThanArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 25;
        
        int[] array = new int[6];
        
        for (int i = 1; i < 6; i++) {
            array[i] = rand.nextInt();
        }
        
        greaterThanMethod(array,n);
       
    }
    
    
    public static void greaterThanMethod(int array[], int n) {
       for (int i = 1; i < array.length; i++){
           if (array[i] > n){
               System.out.println(array[i] + " is greater than: " + n);
           }
           else {
           System.out.println(array[i] + " is smaller than: " + n);
       }
       }
           
   }
}
