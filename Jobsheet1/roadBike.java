public class roadBike extends bike {
    private int tireWidth;

    public void setTireWidth(int width){
        tireWidth = width;
    }
    @Override //jika ada method bawaan parent yang ditimpa pada kelas turunnya. 
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width : " +tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
