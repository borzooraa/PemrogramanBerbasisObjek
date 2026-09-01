package tugasPraktikum.botolMinum;

public class botolMinum {
    private String brand;
    private int kapasitasMl;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKapasitasMl(int kapasitasMl) {
        this.kapasitasMl = kapasitasMl;
    }

    public void isiAir() {
        System.out.println("Botol minum " + brand + " diisi air sampai " + kapasitasMl + " ml.");
    }

    public void minum() {
        System.out.println("Meminum air dari botol " + brand + ".");
    }

    public void printInfo() {
        System.out.println("Brand Botol    : " + brand);
        System.out.println("Kapasitas      : " + kapasitasMl + " ml");
    }
}
