class Ball{
    int x, y;
    public Ball(int a, int b){
        this.x=a;
        this.y=b;
    }
    void right(){
        x-=1;
    }
    void left(){
        x+=1;
    }
    void up(){
        y+=1;
    }
    void down(){
        y-=1;
    }
}
class Point{
    int x, y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point p){
        double a= this.x -p.x;
        double b= this.y -p.y;
        double dist=Math.sqrt(a*a+b*b);
        return dist;
    }
}
public class Test{
    public static void main(String[] args) {
    Point p1=new Point(0,0);
    Point p2= new Point(5,6);
    double distance= p2.distance(p1);
        System.out.println(distance);

        Ball b1 = new Ball(5,6);
        b1.up();
        Ball b2= new Ball(3,4);
        b1.down();
        b2.left();
        b2.up();
        System.out.println("b1's position --> "+ b1.x+" "+b1.y);
        System.out.println("b2's position --> "+ b2.x+" "+b2.y);

    }
}