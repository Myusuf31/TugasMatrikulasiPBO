/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section4_latihan2;

/**
 *
 * @author hp
 */
public class PrisonTest_Student {
public static void main(String[] args){
        Cell2 cell = new Cell2("Cell A", true);
        
        Prisioner_Student prisioner = new Prisioner_Student("John", 321, cell);
        
        //Display prisoner information
        prisioner.display();
        
        //Open or close the door
        prisioner.openDoor();
            
    }
    
}