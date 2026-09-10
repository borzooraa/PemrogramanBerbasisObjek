package jobsheet2;

public class main {
    public static void main(String[] args) {
        // rectangle r = new rectangle(); //--> ini di bagian yang awal, ga ada konstruktor berparameter
        // r.width = 6;
        // r.height = 4;

        // rectangle r = new rectangle(6, 4);                     // --> ini bagian yang dikasih kontruktor berparameter
        // // System.out.println("Rectangle "+r.width + "x"+r.height);
        // System.out.println("Area: "+r.area());
        // System.out.println("Perimeter: "+ r.perimeter());

        rectangle original = new rectangle(6, 4);
        System.out.println("Area: "+original.area());
        rectangle copy = original; //ini maksudnya copy itu merefer objek yang sama kaya original
        copy.width = 10;
        System.out.println("Via original: "+original.area());
        System.out.println("Via copy: "+copy.area());

        // rectangle empty = null; --> di hapus biar ga ada nullPointerExeption
        // System.out.println(empty.area());

        // student s = new student("Nadia", "S001" , 3.8);
        // System.out.println(s.describe());
  }
}
