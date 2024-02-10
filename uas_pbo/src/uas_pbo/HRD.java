package uas_pbo;

public class HRD extends Pegawai {
    private final double lemburPerJam;

    public HRD() {
        super("HRD");
        this.lemburPerJam = 7500;
        gajiPokok = 5000000;
        transport = 750000;
        tunjanganIstri = 250000;
        tunjanganAnak = 90000;
    }
    @Override
    public double hitungGaji(int jamPresensiMasuk, int jamPresensiKeluar) {
        int jamLembur = Math.max(0, jamPresensiKeluar - 16);
        // Kurang Gaji Terlambat
        gajiPokok -= (jamPresensiMasuk - 7) * 100000;
        // Kurangi Gaji Pulang Awal
        gajiPokok -= (16 - jamPresensiKeluar) * 100000;

        return gajiPokok + transport + (lemburPerJam * jamLembur) + tunjanganIstri + tunjanganAnak;
    }
}
