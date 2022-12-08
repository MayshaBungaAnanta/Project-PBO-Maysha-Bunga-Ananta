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
public class Main {
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 12;
        persegiPanjang.lebar = 8;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
    }
}
