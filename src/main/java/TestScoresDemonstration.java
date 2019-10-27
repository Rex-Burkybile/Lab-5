

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
public class TestScoresDemonstration {
    public static void main(String[] args) throws Exception {
       ArrayList<Double> testGrade = new ArrayList<>();
       testGrade.add(70.5);
       testGrade.add(80.5);
       testGrade.add(90.5);
       testGrade.add(95.5);
      
      
      try{
      TestScores obj = new TestScores(testGrade);
      
      double average = TestScores.Average(testGrade);
      System.out.println("The average of the tests is: " + average); 
      }
      catch (InvalidTestScoreException ex) {
          System.out.println("A test score in " + testGrade + " is invaild.");
          System.out.println("Test scores cannot be below 0 or above 100.");
      }
      
    }
}
