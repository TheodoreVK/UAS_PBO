package uas_pbo;

public class Supervisor extends Pegawai {
    private final double lemburPerJam;

    public Supervisor() {
        super("SPV");
        this.lemburPerJam = 10000;
        gajiPokok = 10000000;
        transport = 1000000;
        tunjanganIstri = 300000;
        tunjanganAnak = 100000;
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
