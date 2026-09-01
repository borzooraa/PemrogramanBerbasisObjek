package tugasPraktikum.panci;

public class panciListrik extends panci {
    private int dayaWatt;
    private int panjangKabelCm;

    public void setDayaWatt(int watt) {
        this.dayaWatt = watt;
    }

    public void setPanjangKabelCm(int panjang) {
        this.panjangKabelCm = panjang;
    }

    public void hubungkanListrik() {
        System.out.println("Panci listrik " + getBrand() + " dihubungkan ke stopkontak (" + dayaWatt + " Watt).");
    }

    public void aturSuhu() {
        System.out.println("Suhu pemanas panci listrik " + getBrand() + " berhasil diatur.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Daya Listrik   : " + dayaWatt + " Watt");
        System.out.println("Panjang Kabel  : " + panjangKabelCm + " cm");
        System.out.println("Jenis          : Panci Listrik");
    }
}
