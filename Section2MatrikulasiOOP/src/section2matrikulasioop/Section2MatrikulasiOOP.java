/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section2matrikulasioop;

/**
 *
 * @author hp
 */
public class Section2MatrikulasiOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Guys!");
        
        ClassCustomer cust1 = new ClassCustomer();
        cust1.name = "Bella";
        cust1.age=25;
        cust1.customerNumber= "C00123";
        cust1.orderNumber = "00212";
        
        String address = "SBY JAYA";
        cust1.setAddress(address);
        
        cust1.DisplayCustomerDetail();
       
        }
    }
 

