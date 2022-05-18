
package POSTTEST6;

public class keuangan_PT_ZOOM implements Status{
    static String nama_instansi = "PT ZOOM";
    int anggaran_masuk;
    int anggaran_keluar;
    int anggaran_perbulan;
    int anggaran_pertahun;
    String waktu;
    
    
    public keuangan_PT_ZOOM(int anggaran_masuk,int anggaran_keluar,int anggaran_perbulan,int anggaran_pertahun,String waktu){
        this.anggaran_masuk = anggaran_masuk;
        this.anggaran_keluar = anggaran_keluar;
        this.anggaran_perbulan = anggaran_perbulan;
        this.anggaran_pertahun = anggaran_pertahun;
        this.waktu = waktu;
    }
    @Override
    public void dana() {
        System.out.println("Nama Instansi              : " + nama_instansi);
        System.out.println("Anggaran Masuk desa    : " + this.anggaran_masuk);
        System.out.println("Anggaran Keluar desa   : " + this.anggaran_keluar);
        System.out.println("Anggaran Perbulan desa : " + this.anggaran_perbulan);
        System.out.println("Anggaran Pertahun desa : " + this.anggaran_pertahun);
    }

    @Override
    public void estimasi() {
        System.out.println("Nama Instansi              : " + nama_instansi);
        System.out.println("Anggaran Masuk desa    : " + this.anggaran_masuk);
        System.out.println("Anggaran Perbulan desa : " + this.anggaran_perbulan);
        System.out.println("Anggaran Pertahun desa : " + this.anggaran_pertahun);
        System.out.println("Estimasi Cair          : " + this.waktu);
    }
    
}
