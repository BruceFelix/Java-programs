//Program using the if else statement

import javax.swing.JOptionPane;
public class RaffleGame {
    public static void main(String[] args){
        int choice;
        String input;

        //input
        input = JOptionPane.showInputDialog("Enter number to represent colour of the card as follows\n 1=yellow\n 2= blue\n 3= white\n 4=other ");

        //convert
        choice = Integer.parseInt(input);
        if(choice ==1){
            JOptionPane.showMessageDialog(null,"You win a DVD", "Yellow Card",JOptionPane.PLAIN_MESSAGE);
        }
        else if (choice == 2){
            JOptionPane.showMessageDialog(null,"You win a MOBILE PHONE","Blue card",JOptionPane.PLAIN_MESSAGE);
        }
        else if (choice == 3){
            JOptionPane.showMessageDialog(null,"You win a Pen","White card",JOptionPane.PLAIN_MESSAGE);
        }
        else if (choice == 4){
            JOptionPane.showMessageDialog(null,"You loose .Please try again","Other card", JOptionPane.PLAIN_MESSAGE);
        }
        System.exit(0);
    }
    
}
