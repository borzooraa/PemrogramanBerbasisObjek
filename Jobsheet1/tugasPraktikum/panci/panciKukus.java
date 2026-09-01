package tugasPraktikum.panci;

public class panciKukus extends panci {
    private int jumlahTingkat;
    private String bahanSaringan;

    public void setJumlahTingkat(int tingkat) {
        this.jumlahTingkat = tingkat;
    }

    public void setBahanSaringan(String bahan) {
        this.bahanSaringan = bahan;
    }

    public void isiAirKukusan() {
        System.out.println("Air diisi ke bagian bawah panci kukus " + getBrand() + ".");
    }

    public void pasangSaringan() {
        System.out.println("Saringan berbahan " + bahanSaringan + " berhasil dipasang.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Tingkat : " + jumlahTingkat + " susun");
        System.out.println("Bahan Saringan : " + bahanSaringan);
        System.out.println("Jenis          : Panci Kukus");
    }
}

