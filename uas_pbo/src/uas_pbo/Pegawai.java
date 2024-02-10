package uas_pbo;

public abstract class Pegawai implements HitungGaji {
    protected String kode;
    protected double gajiPokok;
    protected double transport;
    protected double tunjanganIstri;
    protected double tunjanganAnak;

    public Pegawai(String kode) {
        this.kode = kode;
    }
}
