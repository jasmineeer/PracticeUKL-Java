/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan21;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jasmine
 */
public class Transaksi {
    private final ArrayList<Integer> idJenisLaundry = new ArrayList<>();
    private final ArrayList<Integer> banyak = new ArrayList<>();
    private final ArrayList<Integer> idClient = new ArrayList<>();

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan Laundry");
        System.out.print("Masukkan ID Client : ");
        int idclient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idclient));

        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode jenis laundry (masukkan kode 99 untuk berhenti):");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println();//jarak
        System.out.println("Transaksi belanja " + client.getNama(idclient) + " sebagai berikut");
        System.out.println("Nama Barang \t \tBanyak(kg) \tHarga \tJumlah \t");

        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(j)) + "\t"
                    + banyak.get(j) + "\t" + "\t" 
                    + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t"
                    + jumlah);
            transaksi.setTransaksi(jenisLaundry, idclient, idJenisLaundry.get(j),
                    banyak.get(j));
        }

        System.out.println("Total Laundry : " + total);
        client.editSaldo(idclient, client.getSaldo(idclient) - total);
        System.out.println("Sisa Saldo " +  client.getNama(idclient) + " = "+  client.getSaldo(idclient));
    }
    

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }

    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }


    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}
