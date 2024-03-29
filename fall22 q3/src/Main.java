class Fifa{
    int noOfGoals;
    String venue;
    public Fifa(){
        System.out.println("who'll be the winner?");
    }
    public Fifa(int noOfGoals,String venue){
        this();
        this.noOfGoals=noOfGoals;
        this.venue=venue;
    }

    @Override
    public String toString(){
        return "Number of Goals: "+noOfGoals+"venue: "+venue;
    }
}

class BrazilFans extends Fifa{
    int havingWorldCups;
    public BrazilFans(int noOfGoals, String venue,int havingWorldCups){
        super(noOfGoals,venue);
        this.havingWorldCups=havingWorldCups;
    }
    public void incrementWorldCups(){
        havingWorldCups++;
    }
    @Override
    public String toString(){
        return super.toString() + ", Brazil Fans: " + havingWorldCups + " World Cups";
    }
}

class ArgentinaFans extends Fifa{
    int havingWorldCups;
    public ArgentinaFans(int noOfGoals, String venue, int havingWorldCups){
        super(noOfGoals,venue);
        this.havingWorldCups=havingWorldCups;
    }
    public void incrementWorldCups(){
        havingWorldCups++;
    }
    @Override
    public String toString(){
        return super.toString() + ", Brazil Fans: " + havingWorldCups + " World Cups";    }
}
public class Main{
    public static void main(String[] args) {
        BrazilFans b= new BrazilFans(10,"Qatar",2);
        ArgentinaFans a= new ArgentinaFans(7,"Qatar",5);
        if(a.noOfGoals>b.noOfGoals){
            a.incrementWorldCups();
            System.out.println("Argentina won");
        }else
            b.incrementWorldCups();
        System.out.println("Brazil won");
    }
}