// package jobsheet2;

public class Main {
    public static void main(String[] args) {
        // rectangle r = new rectangle(); //--> ini di bagian yang awal, ga ada
        // konstruktor berparameter
        // r.width = 6;
        // r.height = 4;

        // rectangle r = new rectangle(6, 4); // --> ini bagian yang dikasih kontruktor
        // berparameter
        // // System.out.println("Rectangle "+r.width + "x"+r.height);
        // System.out.println("Area: "+r.area());
        // System.out.println("Perimeter: "+ r.perimeter());

        // rectangle original = new rectangle(6, 4);
        // System.out.println("Area: "+original.area());
        // rectangle copy = original; //ini maksudnya copy itu merefer objek yang sama
        // kaya original
        // copy.width = 10;
        // System.out.println("Via original: "+original.area());
        // System.out.println("Via copy: "+copy.area());

        // rectangle empty = null; --> di hapus biar ga ada nullPointerExeption
        // System.out.println(empty.area());

        // student s = new student("Nadia", "S001" , 3.8);
        // System.out.println(s.describe());

        // rectangle[] shapes = new rectangle[3];
        // shapes[0] = new rectangle(6, 4);
        // shapes[1] = new rectangle(3, 3);
        // shapes[2] = new rectangle(8, 2);

        // for (rectangle r : shapes) {
        //     System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        // }
        // // figure 13
        // student s = new student("Nadia", "S001", 3.08);
        // System.out.println(s.describe());

        Circle c = new Circle(5);
        System.out.println("Luas Circle: " + c.area());
        System.out.println("Keliling Circle: " + c.circumference());
    }
}
