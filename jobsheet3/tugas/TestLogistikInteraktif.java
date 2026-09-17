package tugas;

import java.util.Scanner;

public class TestLogistikInteraktif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        kontainer kontainerAlfa = new kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== SISTEM MANAJEMEN KONTAINER ===");
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal    : " + kontainerAlfa.getKapasitasMaksimal() + " kg\n");

        System.out.print("Masukkan berat muatan yang ingin ditambahkan (kg): ");
        double muatanTambah = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(muatanTambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");

        System.out.print("Masukkan berat muatan yang ingin diturunkan (kg): ");
        double muatanTurun = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(muatanTurun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        scanner.close();
    }
}
