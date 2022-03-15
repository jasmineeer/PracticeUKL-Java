/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import java.util.Random;
/**
 *
 * @author Jasmi
 */
public class Bot {
    public int generateHarga(int hargaSebelum){
        Random rand = new Random();
        int lelang = rand.nextInt(2);
        if(lelang != 1){
            int hargaBot = rand.nextInt(hargaSebelum) + hargaSebelum;
            return hargaBot;
        }else{
            return 0;
        }
    }
}
