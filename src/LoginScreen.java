 import java.awt.*;
import java.awt.event.*;
public class LoginScreen extends Frame implements ActionListener
{
	Button ok,can;
	TextField txt_user,txt_pwd;
	Label lbl_user,lbl_pwd,l2;
	
	public LoginScreen()
	{
		super("Login Screen");
		setFont(new Font("Courier New",Font.BOLD,14));
 	
		Label l1; 
 	
 		l1=new Label("   LOGIN FORM     ");
 		l1.setFont(new Font("Courier New",Font.BOLD,30));
 	    
		setLayout(new FlowLayout());
		lbl_user=new Label("USER NAME");
		
		lbl_pwd=new Label("PASSWORD");
		txt_user=new TextField(20);
		txt_pwd=new TextField(20);
		txt_pwd.setEchoChar('*');
		ok=new Button("OK");
		can=new Button("CANCEL");
		
		add(l1);
		add(lbl_user);
		add(txt_user);
		add(lbl_pwd);
		add(txt_pwd);
		add(ok);
		add(can);
		

		ok.addActionListener(this);
		can.addActionListener(this);
		setBackground(Color.orange);
		//setLayout(new GridLayout(4,2,5,5));
		setLocation(50,50);
		//ok.setLocation(300,350);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ok)
		{
			if((txt_user.getText().equals("bus"))&&(txt_pwd.getText().equals("bus")))
			{
				setVisible(false);
				Options o=new Options();
			}
			 else 
			{
				 //System.out.println("Please Enter UserName & Password");
                l2=new Label("Invalid Password");
				setLocation(100,100);
                  add(l2);
				  setVisible(true);

			}
		}
		if(ae.getSource()==can)
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		
		LoginScreen ls=new LoginScreen();
		ls.addWindowListener(new winExit());
	}
};
	class winExit extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	};
