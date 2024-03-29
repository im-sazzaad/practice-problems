public class Point{
    int x, y;
    static int count =0;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        System.out.println("instance created");
        System.out.println("no parameter");
        this.x=10;
        this.y=25;
        count++;
    }
}
class Test{
    public static void main(String[] args) {
        new Point(5,6);
        new Point();
        new Point();
        new Point();
        System.out.println(Point.count);

       // System.out.println(p2.x);
    }
}