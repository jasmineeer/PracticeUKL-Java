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
public class Petugas {
    /** class Petugas hanya menambahkan attribut idPetugas dan jabatan
     untuk nama, alamat, dan telepon mewariskan dari claas Person */
    private final int idPetugas;
    private final String jabatan;

    public Petugas(int idPetugas, String nama, String alamat, String telepon, String jabatan) {
        super( nama, alamat, telepon); /** pemanggilan constructor Person */
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas"
     * @return  */
    public int getIdPetugas() {
        return idPetugas;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "jabatan"
     * @return  */
    public String getJabatan() {
        return jabatan;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama"
     * @return  */
    public String getNama() {
        return nama;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
     * @return  */
    public String getAlamat() {
        return alamat;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
     * @return  */
    public String getTelepon() {
        return telepon;
    }
}
