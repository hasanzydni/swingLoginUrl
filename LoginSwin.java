package notesBook;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//public class LoginSwin {


public class LoginSwin extends JFrame implements ActionListener 
{

    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    LoginSwin() 
    {
        
        // User Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        
        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        // Submit

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(5, 5));

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(500, 200);
        setVisible(true);

    }

    public static void main(String[] args) 
    {
        new LoginSwin();
    }

    public void actionPerformed(ActionEvent ae)
    {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("Hasan") && password.trim().equals("2001")) 
        {
            message.setText(" Hello " + userName+ "");
            try 
  		  {
  		   
  		     URI uri= new URI("https://www.irctc.co.in/nget/train-search");  
  		     java.awt.Desktop.getDesktop().browse(uri);
  		     System.out.println("Web page opened in browser");
  		     System.out.println();
  		  } 
  		  catch (Exception e) 
  		  {
  		   
  		   e.printStackTrace();
  		  }
        } 
        else 
        {
            message.setText(" Invalid user.. ");
        }

    }



	}


