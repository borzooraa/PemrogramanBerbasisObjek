package tugasPraktikum.tas;

public class tas {
    private String brand;
    private String warna;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void bukaResleting() {
        System.out.println("Resleting tas " + brand + " dibuka.");
    }

    public void tutupResleting() {
        System.out.println("Resleting tas " + brand + " ditutup.");
    }

    public void printInfo() {
        System.out.println("Brand Tas      : " + brand);
        System.out.println("Warna          : " + warna);
    }
}
