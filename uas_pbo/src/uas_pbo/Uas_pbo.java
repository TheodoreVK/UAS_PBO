package uas_pbo;

public class Uas_pbo {
    public static void main(String[] args) {
        Pegawai supervisor = new Supervisor();
        Pegawai hrd;
        hrd = new HRD();
        Pegawai teknisi = new Teknisi();
        Pegawai karyawan = new Karyawan();
        // Absensi
        int jamMasuk = 7; 
        int jamKeluar = 18;

        System.out.println("Total gaji Supervisor : " + supervisor.hitungGaji(jamMasuk, jamKeluar) + " Rupiah");
        System.out.println("Total gaji HRD : " + hrd.hitungGaji(jamMasuk, jamKeluar) + " Rupiah");
        System.out.println("Total gaji Teknisi : " + teknisi.hitungGaji(jamMasuk, jamKeluar) + " Rupiah");
        System.out.println("Total gaji Karyawan : " + karyawan.hitungGaji(jamMasuk, jamKeluar) + " Rupiah");
    }
}
