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
public class Client {
    /** class Client hanya menambahkan attribut idClient dan saldo
     untuk nama, alamat, dan telepon mewariskan dari claas Person */
    private final int idClient;
    private double saldo;

    public Client(int idClient, String nama, String alamat, String telepon, double saldo) {
        super(nama, alamat, telepon); /** pemanggilan constructor Person */
        this.idClient = idClient;
        this.saldo = saldo;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idClient"
     * @return  */
    public int getIdClient() {
        return idClient;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "saldo"
     * @return  */
    public double getSaldo() {
        return saldo;
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
    
    /** method untuk menguragi saldo dari client
     * @param jumlah */
    public void kurangiSaldo(double jumlah){
        this.saldo -= jumlah;
    }
}
