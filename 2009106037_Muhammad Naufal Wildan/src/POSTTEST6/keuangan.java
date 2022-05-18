package POSTTEST6;

import POSTTEST4.*;


public class keuangan {
    protected String nama_instansi;
    protected int anggaran_masuk;
    protected int anggaran_keluar;
    protected int anggaran_perbulan;
    protected int anggaran_pertahun;
    
    
    public keuangan(String nama_instansi,int anggaran_masuk,int anggaran_keluar,int anggaran_perbulan,int anggaran_pertahun){
        this.nama_instansi = nama_instansi;
        this.anggaran_masuk = anggaran_masuk;
        this.anggaran_keluar = anggaran_keluar;
        this.anggaran_perbulan = anggaran_perbulan;
        this.anggaran_pertahun = anggaran_pertahun;
    }
    
    void diterima(){
        System.out.println("Anggaran Diterima");
    }
    
    void ditolak(){
        System.out.println("Anggaran Ditolak");
    }

    protected String getnama_instansi() {
        return nama_instansi;
    }

    protected void setnama_instansi(String nama_instansi) {
        this.nama_instansi = nama_instansi;
    }

    protected int getanggaran_masuk() {
        return anggaran_masuk;
    }

    protected void setanggaran_masuk(int anggaran_masuk) {
        this.anggaran_masuk = anggaran_masuk;
    }

    protected int getanggaran_keluar() {
        return anggaran_keluar;
    }

    protected void setanggaran_keluar(int anggaran_keluar) {
        this.anggaran_keluar = anggaran_keluar;
    }

    protected int getanggaran_perbulan() {
        return anggaran_perbulan;
    }

    protected void setanggaran_perbulan(int anggaran_perbulan) {
        this.anggaran_perbulan = anggaran_perbulan;
    }

    protected int getanggaran_pertahun() {
        return anggaran_pertahun;
    }

    protected void setanggaran_pertahun(int anggaran_pertahun) {
        this.anggaran_pertahun = anggaran_pertahun;
    }
    
    
    public void tampil(){
        System.out.println("Nama Instansi     : " + getnama_instansi());
        System.out.println("Anggaran Masuk    : " + getanggaran_masuk());
        System.out.println("Anggaran Keluar   : " + getanggaran_keluar());
        System.out.println("Anggaran Perbulan : " + getanggaran_perbulan());
        System.out.println("Anggaran Pertahun : " + getanggaran_pertahun());
    }
    
    
}
