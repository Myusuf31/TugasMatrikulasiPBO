/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section4_Latihan4;

/**
 *
 * @author hp
 */
public class Prisoner4 {
 public void setName(String name) {
        this.name = name;
    }

    /**
     * @param prisonerID the prisonerID to set
     */
    public void setPrisonerID(int prisonerID) {
        this.prisonerID = prisonerID;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(Cell4 cell) {
        this.cell = cell;
    }

    private String name;
    private int prisonerID;
    private Cell4 cell;

    public Prisoner4(String name, int prisonerID, Cell4 cell) {
        this.name = name;
        this.prisonerID = prisonerID;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public int getPrisonerID() {
        return prisonerID;
    }

    public Cell4 getCell() {
        return cell;
    }

    public void display() {
        System.out.println("Prisoner Information:");
        System.out.println("Name: " + getName());
        System.out.println("Prisoner ID: " + getPrisonerID());
        System.out.println("Cell Name: " + getCell().getCellName());  // Print the cell's name
    }    
}
