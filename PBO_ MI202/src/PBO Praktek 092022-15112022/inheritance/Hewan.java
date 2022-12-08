/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hp
 */
public class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan bersuara");
    }
}

class Tikus extends Hewan { 
    public void suaraHewan() {
        System.out.println("Tikus bersuara : cit cit");
    }
}

class Kucing extends Hewan {
    public void suaraHewan() {
        System.out.println("Kucing bersuara : weong");
    }
}

class Main {
     public static void main(String[] args) {
         Hewan hewanSaya = new Hewan();  // membuat object hewan
         Hewan tikusSaya = new Tikus();  // membuat object tikus
         Hewan kucingSaya = new Kucing(); // membuat object kucing
         hewanSaya.suaraHewan();
         tikusSaya.suaraHewan();
         kucingSaya.suaraHewan();
     }
}
