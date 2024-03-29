class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}

public class Circle {
    private Point center;
    private double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter(){
        return this.center;
    }
    public double getRadius(){
        return this.radius;
    }
    public int PIC(Point p){
        int a = getCenter().getX();
        int b = getCenter().getY();
        int c = p.getX();
        int d = p.getY();
        double distance = Math.sqrt(((a - c) * (a - c)) + ((b - d) * (b - d)));
        if(distance > getRadius()) return 0;
        return 1;
    }

    public static void main(String args[]){
        Point center = new Point(1, 1);
        double radius = 5;
        Circle C = new Circle(center, radius);
        Point p = new Point(4, 4);
        System.out.println(C.PIC(p));
    }
}