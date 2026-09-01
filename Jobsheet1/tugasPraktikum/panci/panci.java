package tugasPraktikum.panci;

public class panci {
   private String brand;
    private double kapasitasLiter;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setKapasitasLiter(double kapasitasLiter) {
        this.kapasitasLiter = kapasitasLiter;
    }

    public double getKapasitasLiter() {
        return kapasitasLiter;
    }

    public void pakaiMemasak() {
        System.out.println("Panci " + brand + " sedang digunakan untuk memasak.");
    }

    public void cuciPanci() {
        System.out.println("Panci " + brand + " sedang dicuci hingga bersih.");
    }

    public void printInfo() {
        System.out.println("Brand Panci    : " + brand);
        System.out.println("Kapasitas      : " + kapasitasLiter + " Liter");
    } 
}
