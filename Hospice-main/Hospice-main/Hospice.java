/* Mater Hospice is a small NGO taking care of expectant mothers. Write 
a program to assist its management calculate its Bills */

//Maternity bill 
import javax.swing.JOptionPane;

class Hospice{
    public static void main(String[] args){
        //define variables
        String patientName;
        int admitRate = 500, deliveryFee = 2000, cardFee = 100, medicalFee = 1000;
        int daysAdmitted, adminFee, total;
        String days;

        //prompt user to input
        patientName = JOptionPane.showInputDialog("Enter patients name");
        days = JOptionPane.showInputDialog("Enter number of days");

        //convert days to integer
        daysAdmitted = Integer.parseInt(days);

        //compute
        adminFee = daysAdmitted * admitRate;
        total = adminFee + deliveryFee + cardFee + medicalFee;

        //output
        JOptionPane.showMessageDialog(null, "Patient Name: " + patientName + "\n" + "Admission Fee: "+ adminFee +
        "\n" + "Delivery Fee: " + deliveryFee + "\n" + "Card Fee: " + cardFee + "\n" + "Medical Fee: " + medicalFee 
        + "\n" + "TotalBill: " + total, "Patient Bill",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}