/* Single Selection Control Statement(IF) computing the commission of Salespeople in ABC Company if their sales value exceds 10000.*/

//import GUI Library
import javax.swing.JOptionPane;

//Declare class
public class Commission {
    public static void main (String [] args){

        //Declare variables
        double salesValue, commission = 0;
        String sales;

        //Request for sales value
        sales = JOptionPane.showInputDialog("Enter Sales Value");

        //Compute the commission
        salesValue = Double.parseDouble(sales);
        if (salesValue > 10000){
            commission = salesValue * 10/100;
        } 

        //Capture the output
        JOptionPane.showMessageDialog(null, "Commission =" + commission, "Sales Commission", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}

