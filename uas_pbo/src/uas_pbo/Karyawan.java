package uas_pbo;

public class Karyawan extends Pegawai {
    private final double lemburPerJam;

    public Karyawan() {
        super("KRY");
        this.lemburPerJam = 5000;
        gajiPokok = 1500000;
        transport = 250000;
        tunjanganIstri = 200000;
        tunjanganAnak = 60000;
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
