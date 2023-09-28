/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section4_Latihan4;

/**
 *
 * @author hp
 */
public class Cell4 {
    private String cellName;  // Name of the cell
    private boolean isOpen;   // Boolean to describe whether the door is open or not
    private int securityCode; // Private 4-digit security code

    // Constructor to initialize cellName, isOpen, and securityCode
    public Cell4(String cellName, boolean isOpen, int securityCode) {
        this.cellName = cellName;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }

    // Getter for cellName
    public String getCellName() {
        return cellName;
    }

    // Getter for isOpen
    public boolean isOpen() {
        return isOpen;
    }

    // Setter to open or close the door based on the provided security code
    public void setDoorState(int enteredSecurityCode) {
        if (enteredSecurityCode != securityCode) {
            System.out.println("Incorrect security code. Door state cannot be changed.");
        } else {
            if (isOpen) {
                isOpen = false;
                System.out.println("Door is closed.");
            } else {
                isOpen = true;
                System.out.println("Door is opened.");
            }
        }
    }
    
}

