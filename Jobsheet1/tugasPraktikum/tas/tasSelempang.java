package tugasPraktikum.tas;

public class tasSelempang extends tas{
    private int panjangTaliCm;
    private String bahanTali;

    public void setPanjangTaliCm(int panjang) {
        this.panjangTaliCm = panjang;
    }

    public void setBahanTali(String bahan) {
        this.bahanTali = bahan;
    }

    public void sesuaikanTali(int panjangBaru) {
        this.panjangTaliCm = panjangBaru;
        System.out.println("Panjang tali selempang diubah menjadi " + panjangTaliCm + " cm.");
    }

    public void pasangKaitTali() {
        System.out.println("Tali selempang berbahan " + bahanTali + " berhasil dikaitkan.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Panjang Tali   : " + panjangTaliCm + " cm");
        System.out.println("Bahan Tali     : " + bahanTali);
        System.out.println("Jenis          : Tas Selempang");
    }
}
