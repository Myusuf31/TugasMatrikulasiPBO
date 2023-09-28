/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section3matrikulasi;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Section3 {
   public static void main(String[] args) {
    //String alamat = "Jl. Diponorogo no. 16, Kel. Kemerah";
      //      System.out.println ("alamat: " + alamat);
            
            //casting:
            int x = (int)6.7;
            int a = 6;
            double y = a;
            int b = Integer.parseInt("7");  //string to int
            String atoi = Integer.toString(x);    //int to string
            
            System.out.println(b);
            
            
            boolean c = true;
            int Var1 = 1;
            int Var2 = 2;
            int Var3 = 3;
            double Var4 = 4.1;
            
            //modulus
            System.out.println(10%4);
            
            final int maxScore = 100;

            String alamat = "Jl. Diponorogo no. 16, Kel. Kemerah";
            System.out.println("alamat: " + alamat.replaceAll("o", "a") + " The cat said \"Meow!\" to me.");
            
            Var1 = 5;
            Var2 = 2;
            Var3 = 8;
            Var4 = 2.5;
            
            double PCIscore = ((double)Var1/Var2 + Var3)/Var4;
            System.out.println(PCIscore);
            
            //Getting Input with a Scanner
       
            Scanner sc = new Scanner(System.in);
                        
            System.out.print("Masukkan int: ");
            int xx = sc.nextInt();

            System.out.print("Masukkan double: ");
            double yy = sc.nextDouble();
            
            sc.nextLine();
            System.out.print("Masukkan string: ");
            String zz = sc.nextLine();

            
            System.out.println(xx + " - " + yy + " - " + zz);
            sc.close();
}
}
