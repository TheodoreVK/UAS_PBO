package uas_pbo;

public class Teknisi extends Pegawai {
    private final double lemburPerJam;

    public Teknisi() {
        super("TKN");
        this.lemburPerJam = 5000;
        gajiPokok = 3000000;
        transport = 500000;
        tunjanganIstri = 200000;
        tunjanganAnak = 75000;
    }
    @Override
    public double hitungGaji(int jamPresensiMasuk, int jamPresensiKeluar) {
        int jamLembur = Math.max(0, jamPresensiKeluar - 16);
        // Kurangi Gaji Terlambat
        gajiPokok -= (jamPresensiMasuk - 7) * 100000;
        // Kurangi Gaji Pulang Awal
        gajiPokok -= (16 - jamPresensiKeluar) * 100000;

        return gajiPokok + transport + (lemburPerJam * jamLembur) + tunjanganIstri + tunjanganAnak;
    }
}
