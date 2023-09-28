/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2matrikulasioop;

/**
 *
 * @author hp
 */
public class ClassCustomer {
   public String name;
   public String address;
   public int age;
   public String orderNumber;
   public String customerNumber;
    private String Address;

public void shop(){
    
}

public void setAddress(String address){
this.Address=address;
}

public void AddItemToChart(){

}

String askDiscount(){
    return "";
}

public void DisplayCustomerDetail(){
    System.out.println("nama:"+ this.name+
                "alamat:"+ this.address+
                "usia"+ this.age + "tahun" +
                "kode cusmtomer"+ this.customerNumber+
                "kode order" + this.orderNumber);
  
}

}
