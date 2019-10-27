
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
public class TestScores {
 

    public TestScores(ArrayList<Double> testGrades) {
       
    }
    
    public static double Average(ArrayList<Double> testGrade) throws Exception{
        double total = 0;
        double average = 0;
        
        
        
        for (double i: testGrade){
            if (i < 0 || i > 100){
                throw new InvalidTestScoreException("A Test Score is Invaild!");
            }
            {
            total = i +total;
        }}
        average = total / testGrade.size();
        return average;
    }
    
}
