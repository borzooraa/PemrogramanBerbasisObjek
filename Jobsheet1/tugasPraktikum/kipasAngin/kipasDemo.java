package tugasPraktikum.kipasAngin;

public class kipasDemo {
    public static void main(String[] args) {
        kipasAngin kipas1 = new kipasAngin();
        kipas1.setBrand("Miyako");
        kipas1.setKecepatan(2);

        kipas1.nyalakan();
        kipas1.matikan();
        kipas1.printInfo();
    }
}
