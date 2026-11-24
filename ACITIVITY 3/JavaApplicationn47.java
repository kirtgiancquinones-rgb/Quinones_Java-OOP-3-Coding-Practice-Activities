/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

/**
 *
 * @author QUINONES_CPE113
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CampusWalletTransfer3  aly = new CampusWalletTransfer3 ("Aly", 100);
        CampusWalletTransfer3  ben = new CampusWalletTransfer3 ("Ben");
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        boolean step2 = aly.transferTo(ben, 35);
        System.out.println(step2 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        boolean step3 = aly.transferTo(ben, 70);
        System.out.println(step3 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        boolean step4 = aly.transferTo(aly, 10);
        System.out.println(step4 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        boolean step5 = ben.deposit(15);
        System.out.println(step5 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        boolean step6 = aly.transferTo(ben, 65);
        System.out.println(step6 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        
        boolean step7 = ben.transferTo(aly, 0);
        System.out.println(step7 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        boolean step8 = ben.transferTo(null, 20);
        System.out.println(step8 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}

