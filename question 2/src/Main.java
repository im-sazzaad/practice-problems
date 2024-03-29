import javax.swing.*;
import java.io.PrintStream;

abstract class Notifications{
    String sender, timestamp;
    public Notifications(String sender, String timestamp){
        this.sender=sender;
        this.timestamp=timestamp;
    }
    public abstract void display();
    public String getDetails(){
        return "sender: "+sender +"\nTimestamp: "+timestamp;
    }
}
interface Displayable {
    void prepareDisplay();
    void showDisplay();
}

class TextNotification extends Notifications implements Displayable{
    private String content;
    public TextNotification(String sender, String timestamp, String content){
        super(sender,timestamp);
        this.content=content;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+"\nContent "+ content;
    }
    @Override
    public void prepareDisplay(){
        System.out.println("Preparing text notification for display");
    }
    @Override
    public void showDisplay(){
        System.out.println("Display text notification on screen");
    }
    public void display(){
        prepareDisplay();
        System.out.println(getDetails());
        showDisplay();
    }
}
class imageNotification extends Notifications implements Displayable{
    private String image_url;
    public imageNotification(String sender, String timestamp, String image_url){
        super(sender,timestamp);
        this.image_url=image_url;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+"\n "+image_url;
    }
    @Override
    public void prepareDisplay(){
        System.out.println("Preparing image notification for display");
    }
    @Override
    public void showDisplay(){
        System.out.println("Display image notification on screen");
    }
    public void display(){
        prepareDisplay();
        System.out.println(getDetails());
        showDisplay();
    }
}
class videoNotification extends Notifications implements Displayable{
    private String video_url;
    public videoNotification(String sender, String timestamp, String video_url){
        super(sender,timestamp);
        this.video_url=video_url;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+"\n "+video_url;
    }
    @Override
    public void prepareDisplay(){
        System.out.println("Preparing video notification for display");
    }
    @Override
    public void showDisplay(){
        System.out.println("Display video notification on screen");
    }
    @Override
    public void display(){
        prepareDisplay();
        System.out.println(getDetails());
        showDisplay();
    }
}


public class Main {
    public static void main(String[] args) {
        TextNotification tn= new TextNotification("bolaka","10:00", "hello");
        imageNotification in= new imageNotification("bolaka","10:20","asdf");
        videoNotification vn= new videoNotification("bolaka","10:30","qwer");
        tn.display();
        in.display();
        vn.display();
    }
}
