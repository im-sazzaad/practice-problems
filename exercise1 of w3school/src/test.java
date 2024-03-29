class Dog {
    private String name, breed;
    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
}
public class test{
    public static void main(String[] args) {
        Dog d1= new Dog("daisy","qwe");

        System.out.println("name: "+d1.getName()+"\nbreed: "+d1.getBreed());

        d1.setName("bunny");
        d1.setBreed("asdf");
        System.out.println("name: "+d1.getName()+"\nbreed: "+d1.getBreed());
    }
}