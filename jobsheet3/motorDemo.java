public class motorDemo {
    public static void main(String[] args) {
        motor m = new motor();
        m.printStatus();
        m.tambahKecepatan();

        m.nyalakanMesin();
        m.printStatus();

        m.tambahKecepatan();
        m.printStatus();

        m.tambahKecepatan();
        m.printStatus();

        m.tambahKecepatan();
        m.printStatus();

        m.matikanMesin();
        m.printStatus();
    }
}
