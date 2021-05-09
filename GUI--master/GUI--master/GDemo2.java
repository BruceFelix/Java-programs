
import javax.swing.JFrame;
public class GDemo2{
    public GDemo2(){
        JFrame frame= new JFrame("My main form");
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        new GDemo2();
    }
}