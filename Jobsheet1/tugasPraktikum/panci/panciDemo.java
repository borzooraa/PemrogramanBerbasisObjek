package tugasPraktikum.panci;

public class panciDemo {
    public static void main(String[] args) {
        panci panciUmum = new panci();
        panciUmum.setBrand("Maspion");
        panciUmum.setKapasitasLiter(2.5);

        panciListrik panciAdvance = new panciListrik();
        panciAdvance.setBrand("Advance");
        panciAdvance.setKapasitasLiter(1.5);
        panciAdvance.setDayaWatt(600);
        panciAdvance.setPanjangKabelCm(100);

        panciKukus panciKukusMaxim = new panciKukus();
        panciKukusMaxim.setBrand("Maxim");
        panciKukusMaxim.setKapasitasLiter(3.0);
        panciKukusMaxim.setJumlahTingkat(2);
        panciKukusMaxim.setBahanSaringan("Stainless Steel");

        System.out.println("=== OBJEK 1: PANCI UMUM ===");
        panciUmum.pakaiMemasak();
        panciUmum.cuciPanci();
        panciUmum.printInfo();
        System.out.println("---------------------------------");

        System.out.println("=== OBJEK 2: PANCI LISTRIK ===");
        panciAdvance.hubungkanListrik();
        panciAdvance.aturSuhu();
        panciAdvance.printInfo();
        System.out.println("---------------------------------");

        System.out.println("=== OBJEK 3: PANCI KUKUS ===");
        panciKukusMaxim.isiAirKukusan();
        panciKukusMaxim.pasangSaringan();
        panciKukusMaxim.printInfo();
        System.out.println("=================================");
    }
}
