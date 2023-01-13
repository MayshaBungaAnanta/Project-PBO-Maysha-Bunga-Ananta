/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunga.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */
public class AnggotaDaoImpl implements AnggotaDao{
    List<Anggota> data = new ArrayList<>();

    public AnggotaDaoImpl() {
        data.add(new Anggota("2032", "bunga", "Padang"));
        data.add(new Anggota("2031", "budi", "Padang Panjang"));
        data.add(new Anggota("2033", "beni", "Solok"));
    }
    
    public void save (Anggota anggota){
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAll(){
        return data;
    }
}
