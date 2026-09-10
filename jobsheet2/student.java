// package jobsheet2;

public class student {
    private String name, studentId;
    private double gpa;

    student(String nm, String nim, double ipk){
        name=nm;
        studentId=nim;
        gpa=ipk;
    }
    public String describe(){
        return name + " (" + studentId + ", GPA: "+gpa+")"; //ini kalau namanya diganto kaya parameter di konstruktor bakalan merah
    }
    
}
