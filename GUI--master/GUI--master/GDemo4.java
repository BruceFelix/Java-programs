import java.awt.FlowLayout;
import javax.swing.*;
public class GDemo4 extends JFrame{
    private JLabel lbluser, lblpassword;
    private JButton btnlogin, btnCancel;
    private JTextField txtuser=new JTextField(15);
    private JPasswordField pwdpass= new JPasswordField(15);

    public GDemo4(){
        lbluser = new JLabel("User Name");
        lblpassword = new JLabel("password");
        btnlogin = new JButton("Login");
        btnCancel= new JButton("cancel");
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lbluser);
        add(txtuser);
        add(lblpassword);
        add(pwdpass);
        add(btnlogin);
        add(btnCancel);
    }
    public static void main(String[]args){
        new GDemo4();
    }
} 
