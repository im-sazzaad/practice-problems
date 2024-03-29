public class Person{
    String name;
    private int age;
    private double height, weight;
    public Person(String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void canVote(){
        if(this.age>=18) System.out.printf("can vote");
        else System.out.println("can't vote");
    }
    public double bmi(){
        return this.weight / (this.height * this.weight);
    }
}
class Test{
    public static void main(String[] args) {
        Person p = new Person("p", 17,5.5, 60);
        p.canVote();
        p.setAge(p.getAge()+1);
        p.canVote();
        System.out.println(p.bmi());
    }
}