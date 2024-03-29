

class Movie{
    private String name;
    protected String origin;
   public String genre;
   public float rating;
    public Movie(String name,String origin, String genre, float rating){
        this.name=name;
        this.origin=origin;
        this.genre=genre;
        this.rating=rating;
    }
    public Movie(String name, String genre){
        this.name=name;
        this.genre=genre;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
public void details() {
    System.out.println("You are watching: "+name);
    System.out.println("\nOrigin: "+origin);
    System.out.println("\nGenre: "+genre);
    System.out.println("\nRating: "+rating);
    }
}


public class Main{
    public static void main(String[] args) {
        Movie m=new Movie("Shutter island", "US","Thriller", 8.3F);
        m.details();
    }
}