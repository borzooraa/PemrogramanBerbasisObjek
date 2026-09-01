package tugasPraktikum.botolMinum;

public class botolDemo{
    public static void main(String[] args) {
        botolMinum botol1 = new botolMinum();
    botol1.setBrand("Tupperware");
    botol1.setKapasitasMl(750);

    botol1.isiAir();
    botol1.minum();
    botol1.printInfo();
    }
}
