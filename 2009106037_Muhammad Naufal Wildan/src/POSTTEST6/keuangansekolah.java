package POSTTEST6;

import POSTTEST4.*;

public class keuangansekolah extends keuangan {
    
    public keuangansekolah(String nama_instansi, int anggaran_masuk, int anggaran_keluar, int anggaran_perbulan, int anggaran_pertahun) {
        super(nama_instansi, anggaran_masuk, anggaran_keluar, anggaran_perbulan, anggaran_pertahun);
    }
    
    @Override
    public void tampil(){
        System.out.println("Nama sekolah                   : " + getnama_instansi());
        System.out.println("Anggaran Masuk dana sekolah    : " + getanggaran_masuk());
        System.out.println("Anggaran Keluar dana sekolah   : " + getanggaran_keluar());
        System.out.println("Anggaran Perbulan dana sekolah : " + getanggaran_perbulan());
        System.out.println("Anggaran Pertahun dana sekolah : " + getanggaran_pertahun());
    }
    
    public void tampil(String ket){
        System.out.println("Nama sekolah                   : " + getnama_instansi());
        System.out.println("Anggaran Masuk dana sekolah    : " + getanggaran_masuk());
        System.out.println("Anggaran Keluar dana sekolah   : " + getanggaran_keluar());
        System.out.println("Anggaran Perbulan dana sekolah : " + getanggaran_perbulan());
        System.out.println("Anggaran Pertahun dana sekolah : " + getanggaran_pertahun());
        System.out.println("Anggaran saat ini = "+ket);
    }
    
}
