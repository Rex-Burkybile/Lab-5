
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rex Burkybile
 */
public class Test {
    public static void main(String[] args) {
       ArrayList<Integer> testGrades = new ArrayList<>();
       testGrades.add(70);
       testGrades.add(80);
       testGrades.add(90);
       testGrades.add(95);
       
       int total = getTotal(testGrades);
       int average = getAverage(testGrades);
       int highest = getHighest(testGrades);
       int lowest = getLowest(testGrades);
       
       System.out.println("The total of the tests is: " + total);
       System.out.println("The average of the tests is: " + average);
       System.out.println("The highest test score is: " + highest);
       System.out.println("The lowest test score is: " + lowest);
    }
    
    public static int getTotal(ArrayList<Integer> testGrades){
        int total = 0;
        
        for (int i: testGrades) {
            total = i +total;
        }
        return total;
    }
    public static int getAverage(ArrayList<Integer> testGrades){
        int total = 0;
        int average = 0;
        
        for (int i: testGrades) {
            total = i +total;
        }
        average = total / testGrades.size();
        return average;
    }
    
    public static int getHighest(ArrayList<Integer> testGrades){
        int highest = 0;
        for (int i: testGrades) {
            if (i > highest){
                highest = i;
            }
                
        }
        return highest;
    }
    
    public static int getLowest(ArrayList<Integer> testGrades){
        int Lowest = 100;
        for (int i: testGrades) {
            if (i < Lowest){
                Lowest = i;
            }
                
        }
        return Lowest;
    }
}
