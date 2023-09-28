/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4matrikulasi;

/**
 *
 * @author hp
 */
class Cell {
private String name;
    private boolean isOpen;
    private int securityCode;
    
    public Cell (String name, boolean isOpen, int securityCode){
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }
    
    public String getName(){
        return name;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    
    public void setIsOpen(int code){
        if(code != securityCode){
            System.out.println("Incorrect code");
        }
        else{
            if(isOpen == true){
                isOpen = false;
                System.out.println("Cell " +name +" Closed");
            }
            else{
                isOpen = true;
                System.out.println("Cell " +name +" Open");
            }
        }
    }
}

