/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_.mi202;

/**
 *
 * @author hp
 */
public class ll {
    class Komputer {
  String processor = "Intel Core i9"; 
  String merk = "Asus"; 
  String memory = "16 GB";
   
  String cekKomputer() { 
    return "Ini berasal dari class Komputer"; 
  }
}
 
class Laptop extends Komputer {
  String storage = "SSD 1TB";
 
  String cekLaptop() { 
    return "Ini berasal dari class Laptop"; 
  }
}
 
class Netbook extends Laptop {
  String lihatSpec() { 
    return "Merk: " + merk + ", processor: "+ processor + 
           ", jumlah memory: " + memory + 
           ", storage: "+ storage; 
  } 
  String cekNetbook() { 
    return "Ini berasal dari class Netbook"; 
  }
}
 
class BelajarJava {
  public static void main(String args[]){
     
    Netbook netbookAndi = new Netbook();
     
    System.out.println(netbookAndi.lihatSpec());
    System.out.println(netbookAndi.cekKomputer());
    System.out.println(netbookAndi.cekLaptop());
    System.out.println(netbookAndi.cekNetbook());
   
  }
}
}
