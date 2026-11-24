/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author QUINONES_CPE113
 */
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LabGradeRecord2 ana = new LabGradeRecord2("Ana", 80, 90);
        System.out.println(ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "out of passing"));

        LabGradeRecord2 ben = new LabGradeRecord2("Ben", 101, 85);
        System.out.println(ben.getFinalGrade() + "; " + (ben.isPassing() ? "passing" : "out of passing"));

        boolean step3 = ana.updateScores(95, 101);
        System.out.println(step3 + "; grade stays " + ana.getFinalGrade());

        boolean step4 = ana.updateScores(74, 75);
        System.out.println(step4 + "; " + ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "out of passing"));

        boolean step5 = ana.updateScores(75, 75);
        System.out.println(step5 + "; " + ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "out of passing"));

        System.out.println("Still " + ben.getFinalGrade() + "; " + (ben.isPassing() ? "passing" : "out of passing"));
    }
}

////If you assign the QuizScore before validating the LabScore, a valid quiz score could overwrite the student's old score 
//even if the lab score is invalid. Validating both scores first ensures an atomic update: either both scores are saved 
//successfully, or neither is changed.
