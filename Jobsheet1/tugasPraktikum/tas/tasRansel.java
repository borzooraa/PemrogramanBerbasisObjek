package tugasPraktikum.tas;

public class tasRansel extends tas {
    private int jumlahKompartemen;
    private boolean adaSlotLaptop;

    public void setJumlahKompartemen(int jumlah) {
        this.jumlahKompartemen = jumlah;
    }

    public void setAdaSlotLaptop(boolean ada) {
        this.adaSlotLaptop = ada;
    }

    public void simpanLaptop() {
        if (adaSlotLaptop) {
            System.out.println("Laptop berhasil dimasukkan ke slot khusus ransel.");
        } else {
            System.out.println("Tas ransel ini tidak memiliki slot laptop!");
        }
    }

    public void aturTaliPunggung() {
        System.out.println("Tali punggung tas ransel " + getBrand() + " berhasil disesuaikan.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kompartemen    : " + jumlahKompartemen + " kantong");
        System.out.println("Slot Laptop    : " + (adaSlotLaptop ? "Ada" : "Tidak Ada"));
        System.out.println("Jenis          : Tas Ransel");
    }
}
