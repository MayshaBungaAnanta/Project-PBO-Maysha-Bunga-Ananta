/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MayshaBungaAnanta081222;

/**
 *
 * @author hp
 */
public class DoWhile {
    public static void main(String[]args)
    {
        String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        int i=0;
        do
            {
                System.out.println(hari[i]);
                i++;
            }while(i<hari.length);
    }
}
