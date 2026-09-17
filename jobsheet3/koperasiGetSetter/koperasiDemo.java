package koperasiGetSetter;

public class koperasiDemo {
    public static void main(String[] args) {
        anggota agt1=new anggota();
        agt1.setNama("Nurfakiyah Raahmadhani");
        agt1.setAlamat("Jalan Sukarno Hatta no 10");
        agt1.setor(100000);
        System.out.println("Simpanan "+agt1.getNama()+" : Rp "+agt1.getSimpanan());
        agt1.pinjam(5000);
        System.out.println("Simpanan "+agt1.getNama()+" : Rp "+agt1.getSimpanan());

    }
}
