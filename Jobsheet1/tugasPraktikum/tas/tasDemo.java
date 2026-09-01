package tugasPraktikum.tas;

public class tasDemo {
    public static void main(String[] args) {
        tas tasUmum = new tas();
        tasUmum.setBrand("Polo");
        tasUmum.setWarna("Cokelat");

        tasRansel ranselEiger = new tasRansel();
        ranselEiger.setBrand("Eiger");
        ranselEiger.setWarna("Hitam");
        ranselEiger.setJumlahKompartemen(4);
        ranselEiger.setAdaSlotLaptop(true);

        tasSelempang selempangConsina = new tasSelempang();
        selempangConsina.setBrand("Consina");
        selempangConsina.setWarna("Abu-abu");
        selempangConsina.setPanjangTaliCm(110);
        selempangConsina.setBahanTali("Nilon");

        System.out.println("=== OBJEK 1: TAS UMUM ===");
        tasUmum.bukaResleting();
        tasUmum.tutupResleting();
        tasUmum.printInfo();
        System.out.println("---------------------------------");

        System.out.println("=== OBJEK 2: TAS RANSEL ===");
        ranselEiger.bukaResleting();
        ranselEiger.aturTaliPunggung();
        ranselEiger.simpanLaptop();
        ranselEiger.printInfo();
        System.out.println("---------------------------------");

        System.out.println("=== OBJEK 3: TAS SELEMPANG ===");
        selempangConsina.pasangKaitTali();
        selempangConsina.sesuaikanTali(120);
        selempangConsina.printInfo();
        System.out.println("=================================");
    }
}
