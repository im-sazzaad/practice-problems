class Base{
    public int a;
    private double b;
    public Base(int a, double b){
    this.a=a;
    this.b=b;
    }
    Base(Base ob){
        a=ob.a;
        b=ob.b;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b=b;
    }

    void show(){
        System.out.println("Sum of variables"+"in the base class"+a+b);
    }
}

class Override extends Base{
    int c;

    //code for b
    public Override(int a, double b, int c){
        super(a,b);
        this.c=c;
    }

    //code for c
   void show(){

       System.out.println("sum: "+(a+getB()+c));
    }
}

class Override2 extends Base{
    Override2(int a, double b){
        super(a,b);
    }
    //code for d
    public Override2(Base ob){
        super(ob);
    }

    //code for e
    void show(){
        System.out.println("sum: "+(a+getB()));
    }
}

public class Main {
    public static void main(String[] args) {
        Override obj = new Override(10,20.5,12);
        obj.show();
        Override2 obj2 = new Override2(6,10);
        obj2.show();
        Override2 obj3 = new Override2(obj2);
        obj3.show();
    }
}