/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan21;

import java.util.ArrayList;
/**
 *
 * @author Jasmi
 */
public final class Client implements User{
    private final ArrayList<String> namaClient = new ArrayList<>();
    private final ArrayList<String> alamat = new ArrayList<>();
    private final ArrayList<String> telepon = new ArrayList<>();
    private final ArrayList<Integer> saldo = new ArrayList<>();

 public Client() {
    setNama("Seta");
    setAlamat("Jalan jalan");
    setTelepon("08123456666");
    setSaldo(100000);

    setNama("Pak Jo");
    setAlamat("bululawang");
    setAlamat("081222233344");
    setSaldo(200000);
 }
 public void setSaldo(int saldo){
    this.saldo.add(saldo);
 }
 public int getSaldo(int idClient){
    return this.saldo.get(idClient);
 }
 public void editSaldo(int idClient, int saldo){
    this.saldo.set(idClient, saldo);
 }
 public int getJmlClient(){
    return this.saldo.size();
 }
 @Override
 public void setNama(String namaClient ){
    this.namaClient.add(namaClient);
 }

 @Override
 public void setAlamat(String alamat ){
    this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
    this.telepon.add(telepon);
 }

 @Override
 public String getNama(int idClient){
    return this.namaClient.get(idClient);
 }

 @Override
 public String getAlamat(int idClient){
    return this.alamat.get(idClient);
 }

 @Override
 public String getTelepon(int idClient){
    return this.telepon.get(idClient);
 } 
}
