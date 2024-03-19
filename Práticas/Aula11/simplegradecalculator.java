package Aula11;

import java.util.List;

public class simplegradecalculator implements IGradeCalculator {

    @Override
    public double calculate(List<Double> grades) {
        double media=0;
        for(int i=0;i<grades.size();i++){
            media+=grades.get(i);
        }
        return media/grades.size();
    }
    
}
