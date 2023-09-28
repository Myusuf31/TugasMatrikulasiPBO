/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section4_latihan3;

/**
 *
 * @author hp
 */
public class PrisonTest_Student {
     public static void main(String[] args) {
            Cell3 cell = new Cell3("Cell A", false, 1234); // 4-digit security code: 1234

       // Display cell information
        System.out.println("Cell Information:");
        System.out.println("Cell Name: " + cell.getCellName());
        System.out.println("Is Open: " + cell.isOpen());

        // Try to open the cell with correct and incorrect security codes
        System.out.println("\nTrying to change door state with security codes:");
        cell.setDoorState(1234); // Correct security code, should open the door
        cell.setDoorState(5678); // Incorrect security code, should print error
        cell.setDoorState(1234); // Correct security code, should close the door

        // Display updated cell information
        System.out.println("\nUpdated Cell Information:");
        System.out.println("Cell Name: " + cell.getCellName());
        System.out.println("Is Open: " + cell.isOpen());
    }
}
