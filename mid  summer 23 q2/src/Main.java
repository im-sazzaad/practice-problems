class Myobject{
    final double Pi=3.1416;
    private double r;
    public double findVolume(){
        return -1;
    }

    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r=r;
    }
}

class Sphere extends Myobject{
    double v;

    @Override
    public double findVolume(){
        v = (4/3) * (Pi * Math.pow(getR(), 3));
            return v;
    }
}
class Cylinder extends Myobject{
    private double h;
    double v;

    public Cylinder(double h,double v){
        this.h=h;
        this.v=v;
    }
    @Override
    public double findVolume(){
        v= Pi*Math.pow(getR(),2)*h;
        return v;
    }
}
class Cone extends Cylinder{

    double h1;
    public Cone(double r, double h,double h1){
        super(r,h);
        this.h1=h1;
    }
    @Override
    public double findVolume(){
        v=(1/3)*(Pi*Math.pow(getR(),2)*h1);
        return v;
    }
}

public class Main {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        s1.setR(2.5); // Setting the radius of the sphere
        System.out.println("Volume of Sphere: " + s1.findVolume());

        Cylinder c1 = new Cylinder(3, 4); // Radius: 3, Height: 4
        System.out.println("Volume of Cylinder: " + c1.findVolume());

        Cone cone1 = new Cone(1.9, 8.9, 1); // Radius: 2, Height: 4, Slant height: 5
        System.out.println("Volume of Cone: " + cone1.findVolume());
    }
}