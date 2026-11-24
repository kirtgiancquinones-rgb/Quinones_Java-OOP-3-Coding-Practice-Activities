/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printaccount;

/**
 *
 * @author QUINONES_CPE113
 */
public class Printaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    main mia;
        mia = new main("Mia", 10);
        var luis = new main("Luis", -4);

        System.out.println("Create accounts (Mia 10 credits, Luis -4 credits)");
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(luis.getStudentName() + ": " + luis.getCredits());
        System.out.println();

        System.out.println("Mia prints 4 pages: " + mia.printPages(4));
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println();

        System.out.println("Mia tries to print 7 pages: " + mia.printPages(7));
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println();

        System.out.println("Mia tries to add -3 credits: " + mia.addCredits(-3));
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println();

        System.out.println("Mia adds 4 credits: " + mia.addCredits(4));
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(luis.getStudentName() + ": " + luis.getCredits());
    }
}