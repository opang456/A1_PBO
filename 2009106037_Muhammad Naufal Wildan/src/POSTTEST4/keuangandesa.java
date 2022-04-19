package POSTTEST4;

public class keuangandesa extends keuangan {
    
    public keuangandesa(String nama_instansi, int anggaran_masuk, int anggaran_keluar, int anggaran_perbulan, int anggaran_pertahun) {
        super(nama_instansi, anggaran_masuk, anggaran_keluar, anggaran_perbulan, anggaran_pertahun);
    }

    @Override
    public void tampil(){
        System.out.println("Nama desa              : " + getnama_instansi());
        System.out.println("Anggaran Masuk desa    : " + getanggaran_masuk());
        System.out.println("Anggaran Keluar desa   : " + getanggaran_keluar());
        System.out.println("Anggaran Perbulan desa : " + getanggaran_perbulan());
        System.out.println("Anggaran Pertahun desa : " + getanggaran_pertahun());
    }
    
}
