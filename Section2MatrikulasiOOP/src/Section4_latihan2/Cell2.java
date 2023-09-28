/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section4_latihan2;

/**
 *
 * @author hp
 */
public class Cell2 {
   private String cellName;   // Name of the cell
    private boolean isDoorOpen; // Boolean to describe whether the door is open or not

    // Two-argument constructor
    public Cell2(String cellName, boolean isDoorOpen) {
        this.cellName = cellName;
        this.isDoorOpen = isDoorOpen;
    }

    // Getter for cellName
    public String getCellName() {
        return cellName;
    }

    // Setter for cellName
    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    // Getter for isDoorOpen
    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    // Setter for isDoorOpen
    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellName='" + cellName + '\'' +
                ", isDoorOpen=" + isDoorOpen +
                '}';
    }
    
}
