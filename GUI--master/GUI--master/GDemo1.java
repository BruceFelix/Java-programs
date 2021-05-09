// imports the JOptionPane class
import javax.swing.JOptionPane;
//creation of the main class
public class GDemo1{
    //this is a constructor that is used to intialize the objects in that class
    public GDemo1(){

        String name= JOptionPane.showInputDialog(null,"Enter your name");
        String byear=JOptionPane.showInputDialog(name + " when were you born?");
        //the above 2 lines request input from the user
        int yob = Integer.parseInt(byear);//the user is prompted to input their year of birth
        int cyear = Integer.parseInt(JOptionPane.showInputDialog("Enter current year"));
        /*
        the above line accepts input from the user and converts the input which is inform of a string to an integer
         */
        int age = cyear - yob;
        JOptionPane.showMessageDialog(null,name + " you are "+ age + " years old");//the class used in this line is used to display the concantenated strings and integers    

    }
    public static void main(String[] args) {
        new GDemo1();// a new constructor is initialized 
        /*
        the code below iterates the previous codes but the user has to choose if they want to
        */
        int x = JOptionPane.showConfirmDialog(null, "Run again?");
        if(x==0)
        new GDemo1();
    }
}
