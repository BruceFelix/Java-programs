import javax.swing.JFrame;
public class GDemo3 extends JFrame{
    public GDemo3(){
        super("Form Demo");
        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String[]args){
        new GDemo3();
    }
}