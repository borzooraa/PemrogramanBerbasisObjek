package tugasPraktikum.kipasAngin;

public class kipasAngin {
    private String brand;
    private int kecepatan;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void nyalakan() {
        System.out.println("Kipas angin " + brand + " dinyalakan pada level " + kecepatan + ".");
    }

    public void matikan() {
        System.out.println("Kipas angin " + brand + " dimatikan.");
    }

    public void printInfo() {
        System.out.println("Brand Kipas    : " + brand);
        System.out.println("Kecepatan      : Level " + kecepatan);
    }
}
