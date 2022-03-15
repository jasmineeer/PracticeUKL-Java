/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Jasmi
 */
public class Jenislaundry {
    private final int idJenisLaundry;
    private final int durasi;
    private final String jenisLaundry;
    private final double harga;

    public Jenislaundry(int idJenisLaundry, String jenisLaundry, double harga, int durasi) {
        this.idJenisLaundry = idJenisLaundry;
        this.durasi = durasi;
        this.jenisLaundry = jenisLaundry;
        this.harga = harga;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idJenisLaundry"
     * @return  */
    public int getIdJenisLaundry() {
        return idJenisLaundry;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "durasi"
     * @return  */
    public int getDurasi() {
        return durasi;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "jenisLaundry"
     * @return  */
    public String getJenisLaundry() {
        return jenisLaundry;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "harga"
     * @return  */
    public double getHarga() {
        return harga;
    }
}
