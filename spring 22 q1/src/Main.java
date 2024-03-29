class Marks{
    String id;
    double quizMark, midMark, finalMark;

    public Marks(String id, double quizMark, double midMark, double finalMark){
        this.id=id;
        this.quizMark=quizMark;
        this.midMark=midMark;
        this.finalMark=finalMark;
    }
    public void passedOrNot(){
        double mark;
        mark=quizMark+midMark+finalMark;
        if(mark>=55){
            System.out.println("id: "+id+" total mark: "+mark+" passed");
        }else System.out.println("id: "+id+" total mark: "+mark+" failed");
    }
}

public class Main {
    public static void main(String[] args) {
        Marks m= new Marks("01", 9,29,35);
        m.passedOrNot();
    }
}