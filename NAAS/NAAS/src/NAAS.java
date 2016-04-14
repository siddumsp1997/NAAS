import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.GroupLayout.Alignment;


public class NAAS implements Serializable{
	
	private JFrame frame;
	private JPanel PanelHomeScreen;
	private JPanel PanelManagerLoggedIn;
	private JPanel PanelSeePayRoll;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel PanelCreateDeliveryPerson;
	private JPanel PanelUpdateDetails;
	private JPanel PanelCustomerSection;
	private JLabel lblNewPassword;
	private JPanel PanelCustomerSection_1;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_2;
	private JPanel PanelCreateCustomer;
	private JButton button;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblUserid_2;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel lblCustomerSection;
	private JButton btnAssignDeliveryBoy;
	private JButton btnSeeBill;
	private JButton btnDone_2;
	private JPanel PanelModifySubscription;
	private JButton btnAddSubscription;
	private JButton btnRemoveSubscription;
	private JButton btnDone_3;
	JPanel PanelAssignDeliveryBoy;
	private JButton btnAssign;
	private JButton btnDone_4;
	private JPanel PanelDeliveryPersonSection;
	private JButton btnSelect;
	private JPanel PanelAssignDeliveryPerson;
	private JPanel PanelSeeMonthlyReport;
	private JPanel PanelBillReminder;
	private JPanel PanelLogIn;
	private JPanel PanelSignup;
	public   ArrayList<Customer> ListCustomers; //Customer list	
	public   ArrayList<DeliveryPerson> ListDeliveryPerson; //Delivery person list
	public   ArrayList<Magazine> ListMagazine; //Magazine list
	public   Manager manager = null;
	private JPanel PanelLogin ;
	private JPanel PanelChangePasswordDeliveryPerson;
	public JRadioButton rdbtnManager;
	public JRadioButton rdbtnDeliveryPerson;
	public String name,pass;
	public ButtonGroup grp;
	int index;
	private JPanel login;
	public int index1;
	public JPanel dp;
	public JPanel x;
	int t = 0;
	int t1 = 0 ;
	public JPanel y;
	public int fex;
	private int dex;
	public JPanel z;
	private JButton btnBack;
	private JButton btnBackToMain;
	private int wex;
	private JPanel z1;
	private JLabel lblPeopleWhoHavent;
	private JList CustomerNameList_1;
	private JScrollPane CustomerNameList_1ScrollPane;
	private JButton btnDone_6;
	private JButton btnPayBill;
	DeliveryDatabase deliveryDatabase;
	private JPanel PanelCreateMagazine;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblBillReminder;
	
	  /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NAAS window = new NAAS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NAAS() {
deliveryDatabase = null;
        
        File file = new File("anik.dat");
        if (file.exists()) {
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(
                        new FileInputStream("anik.dat"));
            } catch (IOException ex) {
              //  Logger.getLogger(Assignment2a.class.getName()).log(Level.SEVERE, null, ex);
            }
                try {
                	deliveryDatabase = (DeliveryDatabase) objectInputStream.readObject();
                    System.out.println("Reading from the file.. now myList : ");
                } catch (IOException | ClassNotFoundException ex) {
                 //   Logger.getLogger(Assignment1a.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    //Logger.getLogger(Assignment1a.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
        else{
        	deliveryDatabase = new DeliveryDatabase();
                    System.out.println("File does not exist ..Creating new myList : ");
        }

		initialize();
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, 10, 900, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		PanelHomeScreen = new JPanel();
		frame.getContentPane().add(PanelHomeScreen, "name_92414236098273");
		PanelHomeScreen.setLayout(null);
		

		
		PanelHomeScreen.setVisible(false);
	 
		Login();
	}
	 void SaveEverything(){
         System.out.println("Saving...");

	    	FileOutputStream fout = null;
	        try {
	                
	            fout = new FileOutputStream("anik.dat");
	        } catch (FileNotFoundException ex) {
	            //Logger.getLogger(Assignment1a.class.getName()).log(Level.SEVERE, null, ex);
	        }
	                         try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
	                             oos.writeObject(deliveryDatabase);
	                             System.out.println("Saving...");
	                             oos.flush();
	                             oos.close();
	                         } catch (IOException ex) {
	         //   Logger.getLogger(Assignment1a.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    	
	    }
	    
	public void alloted_address_subscription(int i) {
		
		System.out.println("0");
		z1=new JPanel();
		z1.setLayout(null);
		frame.getContentPane().add(z1);
		//System.out.println("1");
		
		
		wex=i;
		
		JLabel lblDeliveryListAlloted = new JLabel("Delivery list alloted for:");
		lblDeliveryListAlloted.setBounds(151, 30, 249, 50);
		z1.add(lblDeliveryListAlloted);
		lblDeliveryListAlloted.setFont(new Font("Serif", Font.ITALIC,25));
		
		JLabel lblUserId = new JLabel(deliveryDatabase.ListDeliveryPerson.get(i).getUserID());
		lblUserId.setBounds(409, 30, 184, 50);
		z1.add(lblUserId);
		lblUserId.setFont(new Font("Serif", Font.ITALIC,25));
		//System.out.println("2");

		
		
		
		btnBack = new JButton("BACK TO MAIN MENU");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				z1.setVisible(false);
				frame.getContentPane().remove(z1);			      
				Deliverypersonloggedin(wex);
				
			}
		});
		btnBack.setFont(new Font("Serif", Font.ITALIC, 19));
		btnBack.setBounds(600, 21, 238, 50);
		z1.add(btnBack);
//		System.out.println("3");

		
		JTextArea display = new JTextArea();
		display.setFont(new Font("Serif", Font.PLAIN,22));
		JScrollPane scrollPane = new JScrollPane(display);
		scrollPane.setBounds(12, 85, 667, 727);
		z1.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		System.out.println("4");


	    int p,f;
	    p=1;
	    display.append("\n");
	    
	    for( Customer c : deliveryDatabase.ListCustomers)
	    {if(c.GetSubscriptions().getDeliveryBoyAssignedID()!=null && c.GetSubscriptions().getDeliveryBoyAssignedID().equals(deliveryDatabase.ListDeliveryPerson.get(wex).getUserID())){
	         
	    	display.append(p+") Customer Name : "+c.GetName()+"\n");
	    	display.append("    CustomerID    : "+c.GetCustomerID()+"\n");
	    	display.append("    Address       : "+c.GetAddress()+"\n\n");
	         
	    	f=1;
	    	display.append(" List of publications to be delivered :\n");
	    	
	    	if(c.GetSubscriptions().getListSubscription().size()==0)
	    	{
	    	  display.append("-Nil-\n");	
	    	}
	    	
	    	for(Magazine m : c.GetSubscriptions().getListSubscription())
	    	{
	    		display.append(f+") "+m.GetTitle()+" (Code: "+m.GetCode()+")\n");
	    		display.append("Publisher :"+m.GetPublisher()+"\n");
	    		f++;
	    	}
	         
	    	display.append("\n\n");
	    	p++;
	    }
	    }
	    
	    z1.setVisible(true);
	    
	    
	}

public void all_address_subscription(int r) 
{
	/*
	super("DAILY LIST");
	getContentPane().setLayout(null);
	setResizable(false);
	getContentPane().setBackground(Color.LIGHT_GRAY);*/
	
	
	 z=new JPanel();
	z.setLayout(null);
	frame.getContentPane().add(z);
	

    dex=r;
    
	JLabel lblDeliveryListAlloted = new JLabel("Delivery list of all the customers ");
	lblDeliveryListAlloted.setBounds(128, 21, 559, 50);
	z.add(lblDeliveryListAlloted);
	lblDeliveryListAlloted.setFont(new Font("Serif", Font.ITALIC,25));
	
	
	
	btnBack = new JButton("BACK TO MAIN MENU");
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			z.setVisible(false);
			frame.getContentPane().remove(z);			      
			Deliverypersonloggedin(dex);
			
		}
	});
	btnBack.setFont(new Font("Serif", Font.ITALIC, 20));
	btnBack.setBounds(600, 21, 238, 50);
	z.add(btnBack);

	JTextArea display = new JTextArea();
	display.setFont(new Font("Serif", Font.PLAIN,22));
	
	JScrollPane scrollPane = new JScrollPane(display);
	scrollPane.setBounds(25, 74, 667, 733);
	z.add(scrollPane);
	scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	
	
	
    int p,f;
    p=1;
    
    display.append("\n");
    
    for( Customer c : deliveryDatabase.ListCustomers)
    {
    	

    	display.append(p+") Customer Name : "+c.GetName()+"\n");
    	display.append("    CustomerID    : "+c.GetCustomerID()+"\n");
    	display.append("    Address       : "+c.GetAddress()+"\n");
    	display.append("    Delivery boy ID : "+c.GetSubscriptions().getDeliveryBoyAssignedID()+"\n\n");
         
    	f=1;
    	display.append(" List of publications to be delivered :\n");
    	
    	if(c.GetSubscriptions().getListSubscription().size()==0)
    	{
    	  display.append("-Nil-\n");	
    	}
    	
    	for(Magazine m : c.GetSubscriptions().getListSubscription())
    	{
    		display.append(f+") "+m.GetTitle()+" (Code: "+m.GetCode()+")\n");
    		display.append("Publisher :"+m.GetPublisher()+"\n");
    		f++;
    	}
         
    	display.append("\n\n");
    	p++;
    }
    
    z.setVisible(true);
}
public void Monthly_payroll(int i) {

    y=new JPanel();
	y.setLayout(null);
	frame.getContentPane().add(y);
	
	fex=i;
	
	JLabel lblUserId = new JLabel("User ID :");
	lblUserId.setBounds(137, 51, 132, 50);
	y.add(lblUserId);
	lblUserId.setFont(new Font("Serif", Font.ITALIC,25));
	
	JLabel label = new JLabel(deliveryDatabase.ListDeliveryPerson.get(i).getUserID());
	label.setBounds(298, 51, 408, 50);
	y.add(label);
	label.setFont(new Font("Serif", Font.ITALIC,25));
	
	JLabel lblAmountToBe = new JLabel("Your Payroll for this month : ");
	lblAmountToBe.setBounds(27, 158, 263, 50);
	y.add(lblAmountToBe);
	lblAmountToBe.setFont(new Font("Serif", Font.ITALIC,21));
	
	textField = new JTextField("Rs "+deliveryDatabase.ListDeliveryPerson.get(i).getmonthlyPayroll());
	textField.setBounds(298, 158, 220, 50);
	y.add(textField);
	textField.setColumns(10);
	textField.setEditable(false);
	textField.setFont(new Font("Serif", Font.PLAIN,28));
	
	JButton btnPrintPayroll = new JButton("PRINT PAYROLL");
	btnPrintPayroll.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null,"Printed successfully !!");
			
			y.setVisible(false);
			frame.getContentPane().remove(y);			      
			Deliverypersonloggedin(fex);
			
		}
	});
	btnPrintPayroll.setBounds(375, 266, 331, 50);
	y.add(btnPrintPayroll);
	btnPrintPayroll.setFont(new Font("Serif", Font.ITALIC,20));
	
	JButton btnNewButton = new JButton("<< BACK");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			/* GO TO DELIVERYPERSONLOGGEDIN */
	
			y.setVisible(false);
			frame.getContentPane().remove(y);			      
			Deliverypersonloggedin(fex);
			
			
		}
	});
	btnNewButton.setBounds(10, 266, 331, 50);
	y.add(btnNewButton);
	btnNewButton.setFont(new Font("Serif", Font.ITALIC,20));
	
	
	
	
	y.setVisible(true);
	
}



public void manager_already_exists() {
	 final JTextField textField;
	 final JPasswordField textField_1;
  
    x=new JPanel();
	x.setVisible(true);
	x.setLayout(null);
	frame.getContentPane().add(x);
    
    JLabel lblManagerAlreadyExists = new JLabel("Manager already exists !!");
    lblManagerAlreadyExists.setBounds(98, 51, 377, 50);
    x.add(lblManagerAlreadyExists);
    lblManagerAlreadyExists.setFont(new Font("Serif", Font.PLAIN, 26));
    
    JLabel lblInOrderTo = new JLabel("In order to replace the existing manager, enter the following :");
    lblInOrderTo.setBounds(12, 122, 572, 50);
    x.add(lblInOrderTo);
    lblInOrderTo.setFont(new Font("Serif", Font.ITALIC, 22));
    
    JLabel lblOldUsername = new JLabel("Old Username :");
    lblOldUsername.setBounds(12, 214, 241, 50);
    x.add(lblOldUsername);
    lblOldUsername.setFont(new Font("Serif", Font.ITALIC, 19));
    
    JLabel lblOldPassword = new JLabel("Old Password :");
    lblOldPassword.setBounds(12, 300, 241, 50);
    x.add(lblOldPassword);
    lblOldPassword.setFont(new Font("Serif", Font.ITALIC, 19));
    
    textField = new JTextField("");
    textField.setBounds(161, 214, 371, 50);
    x.add(textField);
    textField.setColumns(10);
    textField.setFont(new Font("Serif", Font.PLAIN,22));
    
    textField_1 = new JPasswordField("");
    textField_1.setBounds(161, 300, 371, 50);
    x.add(textField_1);
    textField_1.setColumns(10);
    textField_1.setFont(new Font("Serif", Font.PLAIN,22));
    
    JButton button = new JButton("<< BACK ");
    button.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		
    		/* LOGIN */ 
    		x.setVisible(false);
			
			frame.getContentPane().remove(x);
			Login();
    		
    		
    	}
    });
    button.setBounds(12, 397, 268, 61);
    x.add(button);
    button.setFont(new Font("Serif", Font.ITALIC, 16));
    
    JButton btnConfirmReplace = new JButton("CONFIRM REPLACE >> ");
    btnConfirmReplace.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		
    		String user;
    		
    		if(!textField.getText().equals(""))
			{  
				user= textField.getText();
				
	//			textField_1=(JPasswordField)e.getSource();
				char[] k=textField_1.getPassword();
				String pass1=new String(k);
				
				if(pass1=="")
				{
					JOptionPane.showMessageDialog(null,"Password field empty.");

				}
				
				else
				{
				   if(deliveryDatabase.manager.GetUserID().equals(user))	
				   {
					   if(deliveryDatabase.manager.GetPassword().equals(pass1))
					   {
						   
						   /* GO TO SIGN UP PAGE */
							
							x.setVisible(false);
							frame.getContentPane().remove(x);
							signup_page();
						   
						   
					   }
					   
					   else
					   {
						   JOptionPane.showMessageDialog(null,"Incorrect Password.");
						   
					   }
					   
					   
					   
				   }
				   
				   else
				   {
					   JOptionPane.showMessageDialog(null,"Incorrect Username.");
					   
				   }
				   
				   
				
				}
				
			}		
    		
    		else
    		{
    			JOptionPane.showMessageDialog(null,"UserName field empty.");
    		}
    		
   
    	}
    });
    btnConfirmReplace.setBounds(304, 397, 268, 61);
    x.add(btnConfirmReplace);
	btnConfirmReplace.setFont(new Font("Serif", Font.ITALIC, 16));
	
	x.setVisible(true);
	
}
	private void Deliverypersonloggedin(int r) 
	{
		dp=new JPanel();
		dp.setVisible(true);
		dp.setLayout(null);
		frame.getContentPane().add(dp,"Welcome to Contact Book");
	  	
	    index1=r;
	  	
	  	
	  	JLabel lblUserId = new JLabel("USER ID :");
	  	lblUserId.setBounds(45, 72, 141, 30);
	  	dp.add(lblUserId);
	  	lblUserId.setFont(new Font("Serif", Font.ITALIC,27));
	  	
	  	JLabel lblName = new JLabel(deliveryDatabase.ListDeliveryPerson.get(r).getUserID());
	  	lblName.setBounds(180, 68, 504, 38);
	  	dp.add(lblName);
	  	lblName.setFont(new Font("Serif", Font.ITALIC,27));
	  	
	  	JButton btnNewButton = new JButton("CHECK  SUBSCRIPTION  DETAILS  OF  ALL  ADDRESSES");
	  	btnNewButton.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent arg0) {
	  			
	  			/* all_address_subscription */
	  			dp.setVisible(false);
				frame.getContentPane().remove(dp);
				
				all_address_subscription(index1);
	  			
	  		}
	  	});
	  	btnNewButton.setBounds(45, 251, 595, 76);
	  	dp.add(btnNewButton);
	  	btnNewButton.setFont(new Font("Serif", Font.BOLD,16));
	  	
	  	JButton btnNewButton_1 = new JButton("CHECK  SUBSCRIPTION  DETAILS  OF  ALLOTED  ADDRESSES  ONLY ");
	  	btnNewButton_1.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			
	  			
	  			/* alloted_address_subscription */
	  			dp.setVisible(false);

	  			frame.getContentPane().remove(dp);
	  			
				alloted_address_subscription(index1);
	  			
	  		}
	  	});
	  	btnNewButton_1.setBounds(45, 143, 595, 76);
	  	dp.add(btnNewButton_1);
	  	btnNewButton_1.setFont(new Font("Serif", Font.BOLD,16));
	  	
	  	JButton btnNewButton_2 = new JButton("CHECK  OUT  PAYROLL  FOR  THE  MONTH");
	  	btnNewButton_2.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			
	  			/*Pay roll page*/
	  			dp.setVisible(false);

	  			frame.getContentPane().remove(dp);
				Monthly_payroll(index1);
	  			
	  		}
	  	});
	  	btnNewButton_2.setBounds(45, 364, 595, 76);
	  	dp.add(btnNewButton_2);
	  	btnNewButton_2.setFont(new Font("Serif", Font.BOLD,16));
	  	
	  	JButton btnNewButton_3 = new JButton("LOGOUT");
	  	btnNewButton_3.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			
	  			/*Back to Login page */
	  			dp.setVisible(false);
				
				frame.getContentPane().remove(dp);
				Login();
	  			
	  		}
	  	});
	  	btnNewButton_3.setBounds(45, 573, 595, 69);
	  	dp.add(btnNewButton_3);
	  	btnNewButton_3.setFont(new Font("Serif", Font.BOLD,16));
	  	
	  	JButton btnNewButton_4 = new JButton("CHANGE  MY  PASSWORD");
	  	btnNewButton_4.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			
	  			/* CHANGEPASSWORDDELIVERYPERSON with i in parameter list*/	
	  			dp.setVisible(false);

	  			frame.getContentPane().remove(dp);
				ChangePasswordDeliveryPerson(index1);
	  			
	  			
	  		}
	  	});
	  	btnNewButton_4.setBounds(45, 463, 595, 69);
	  	dp.add(btnNewButton_4);
	  	btnNewButton_4.setFont(new Font("Serif", Font.BOLD,16));
	  	
	  	dp.setVisible(true);
		
	}
	
	



	public void  Login() {
		
		login=new JPanel();
		login.setLayout(null);
		frame.getContentPane().add(login);
		
		grp=new ButtonGroup();
		item net=new item();
		
		
		index=-1;
		JLabel lblWelcomeTo = new JLabel("SIDDU NEWSPAPER AGENCY ");
		lblWelcomeTo.setBounds(185, 25, 444, 25);
		login.add(lblWelcomeTo);
		lblWelcomeTo.setFont(new Font("Serif", Font.PLAIN, 28));
		
		JLabel lblERkHall = new JLabel("E318, RK Hall of Residence, IIT Kharagpur, West Bengal-721302 Ph:8768738271");
		lblERkHall.setBounds(52, 76, 657, 25);
		login.add(lblERkHall);
		lblERkHall.setFont(new Font("Serif", Font.PLAIN,20));
		
		JLabel lblForQueriesMail = new JLabel("For feedback and queries, mail to siddumsp@gmail.com");
		lblForQueriesMail.setBounds(136, 114, 460, 25);
		login.add(lblForQueriesMail);
		lblForQueriesMail.setFont(new Font("Serif", Font.PLAIN,20));
		
		JLabel lblEnterYourUsername = new JLabel("Enter your username and password to login :");
		lblEnterYourUsername.setBounds(160, 185, 520, 44);
		login.add(lblEnterYourUsername);
		lblEnterYourUsername.setFont(new Font("Serif", Font.ITALIC,25));
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(93, 273, 113, 16);
		login.add(lblUsername);
		lblUsername.setFont(new Font("Serif", Font.ITALIC,20));
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(93, 358, 102, 16);
		login.add(lblPassword);
		lblPassword.setFont(new Font("Serif", Font.ITALIC,20));
		
		final JTextField textField = new JTextField("");
		textField.setBounds(233, 258, 450, 49);
		login.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Serif", Font.PLAIN,22));
		
		final JPasswordField textField_1 = new JPasswordField(20);
		textField_1.setBounds(235, 343, 445, 49);
		login.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Serif", Font.PLAIN,22));;
		
		  
		JButton btnLogin = new JButton("LOGIN >>");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals(""))
				{  
					name= textField.getText();
					t=1;
				}
				  
			
				char[] k=textField_1.getPassword();
				pass=new String(k);
				
				if(!pass.equals(""))
				{
					t1=1;
				}
				
				
				if(t==1&&t1==1){
				
				if(index==-1)
				{
					JOptionPane.showMessageDialog(null,"Please select your designation.");
				}
				
				
			    if(index==1)
				{   
			    	if(deliveryDatabase.manager!=null){
					if(deliveryDatabase.manager.GetUserID().equals(name))
					{
						if(deliveryDatabase.manager.GetPassword().equals(pass))
						{
							
							/* LOGIN manager*/
							login.setVisible(false);
							frame.getContentPane().remove(login);
							ManagerLoggedIn(deliveryDatabase.manager);
						
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Invalid password !!");
						}
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid username !!");
					}
					
			    	}	
			    	
			    	else
			    	{
			    		JOptionPane.showMessageDialog(null,"Signup First !!");
			    		
			    	}
					

				}
				
				if(index==2)
				{
					 int flag=-1;
				     int index=0;
					
					 for(final DeliveryPerson x:deliveryDatabase.ListDeliveryPerson)
			         {  
			 	           if(x.getUserID().equals(name))
			 	          { 
			 	        	 
			 	        	 if(x.getPassword().equals(pass))  
			 	        	 {
			 	        		 flag=index;
			 	        		 break;
			 	        	 }
			 	            
			 	          }
			 	           index++;
			 	           
			          }
					//end of for loop
					
					if(flag==-1)
					{
						JOptionPane.showMessageDialog(null,"Invalid username / password.");
						
					}
					else
					{
						
						/* LOGIN WITH i as index in arraylist */
							login.setVisible(false);
							frame.getContentPane().remove(login);
							Deliverypersonloggedin(flag);
						
					}
		
				}
				
				
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Please don't leave any field empty.");
				}
				
				
			}
		});
		btnLogin.setBounds(556, 565, 219, 79);
		login.add(btnLogin);
		btnLogin.setFont(new Font("Serif", Font.ITALIC,16));
		
		JLabel lblSelectYourDesignation = new JLabel("Select your Designation :");
		lblSelectYourDesignation.setBounds(52, 450, 209, 44);
		login.add(lblSelectYourDesignation);
		lblSelectYourDesignation.setFont(new Font("Serif", Font.PLAIN,20));
		
	    rdbtnManager = new JRadioButton("Manager");
		rdbtnManager.setBounds(314, 460, 127, 25);
		login.add(rdbtnManager);
		rdbtnManager.setFont(new Font("Serif", Font.PLAIN,20));
		grp.add(rdbtnManager);
		rdbtnManager.addItemListener((ItemListener) net);
		
	    rdbtnDeliveryPerson = new JRadioButton("Delivery person");
		rdbtnDeliveryPerson.setBounds(472, 460, 208, 25);
		login.add(rdbtnDeliveryPerson);
		rdbtnDeliveryPerson.setFont(new Font("Serif", Font.PLAIN,20));
		grp.add(rdbtnDeliveryPerson);
		rdbtnDeliveryPerson.addItemListener(net);
		
		JButton btnNewButton = new JButton("<< EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/* EXIT */
				 
				login.setVisible(false);
				
				
			}
		});
		btnNewButton.setBounds(10, 565, 219, 79);
		login.add(btnNewButton);
		btnNewButton.setFont(new Font("Serif", Font.ITALIC,16));
		
		JButton btnNewButton_1 = new JButton("< SIGN UP >");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 /* SIGN UP PAGE */
				
				//frame.getContentPane().remove(login);
				//signup_page();
				
			 if(deliveryDatabase.manager==null)
			 {
				 /* GOT TO SIGN UP PAGE */ 
				 login.setVisible(false);
				    frame.getContentPane().remove(login);
					signup_page();
				 
			 }
				
			 else
			 {
			    /* GO TO MANAGER ALREADY EXISTS */ 
				   login.setVisible(false);
				   frame.getContentPane().remove(login);
				   //ManagerLoggedIn(DeliveryDatabase.manager);
				   manager_already_exists();
			 }
			 
				
			}
		});
		btnNewButton_1.setBounds(281, 565, 219, 79);
		login.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Serif", Font.ITALIC,16));

		
		frame.setBounds(10, 10, 900, 850);
		
		login.setVisible(true);

		
	}

	public class item implements ItemListener
	{
		
	  public void itemStateChanged(ItemEvent ee)
	  {
		
		  if(ee.getItem()==rdbtnManager){
			  
			  index=1;
		  }
		  
	      if(ee.getItem()==rdbtnDeliveryPerson){
			  
			  index=2;
		  }
		  
	    
	  }

	}
	
	private void ChangePasswordDeliveryPerson(int i){
		PanelChangePasswordDeliveryPerson = new JPanel();
		frame.getContentPane().add(PanelChangePasswordDeliveryPerson, "name_108658631601381");
		PanelChangePasswordDeliveryPerson.setLayout(null);
		PanelChangePasswordDeliveryPerson.setBackground(Color.LIGHT_GRAY);
		
		final int index = i;
		
		JLabel lblEnterOldPassword = new JLabel("Enter old Password :");
		lblEnterOldPassword.setBounds(10, 36, 200, 50);
		PanelChangePasswordDeliveryPerson.add(lblEnterOldPassword);
		lblEnterOldPassword.setFont(new Font("Serif", Font.ITALIC,23));
		
		JLabel lblEnterNewPassword = new JLabel("Enter new Password :");
		lblEnterNewPassword.setBounds(10, 110, 226, 50);
		PanelChangePasswordDeliveryPerson.add(lblEnterNewPassword);
		lblEnterNewPassword.setFont(new Font("Serif", Font.ITALIC, 23));
		
		final JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(232, 36, 385, 50);
		PanelChangePasswordDeliveryPerson.add(passwordField);
		
		final JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(232, 110, 385, 47);
		PanelChangePasswordDeliveryPerson.add(passwordField_1);
		
		JButton btnChangePassword = new JButton("CHANGE PASSWORD ");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String pass1,pass2;
				
			
				char[] k=passwordField.getPassword();
				pass1=new String(k);
				
			
				char[] k1=passwordField_1.getPassword();
			    pass2=new String(k1);
				
			    if(deliveryDatabase.ListDeliveryPerson.get(index).getPassword().equals(pass1))
			    {
			      deliveryDatabase.ListDeliveryPerson.get(index).setPassword(pass2);
			      
			      JOptionPane.showMessageDialog(null,"Password successfully changed !!");
			      PanelChangePasswordDeliveryPerson.setVisible(false);
				  Deliverypersonloggedin(index);
				  
			      
			    }
			    
			    else
			    {
			    	JOptionPane.showMessageDialog(null,"Old password entered is wrong !!");
			    }
				
				
				
			}
		});
		btnChangePassword.setBounds(292, 184, 335, 50);
		PanelChangePasswordDeliveryPerson.add(btnChangePassword);
		btnChangePassword.setFont(new Font("Serif", Font.ITALIC, 24));
		
		
		JButton btnNewButton = new JButton("<< BACK ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelChangePasswordDeliveryPerson.setVisible(false);
				Deliverypersonloggedin(index);
				
			}
		});
		btnNewButton.setBounds(10, 184, 270, 50);
		PanelChangePasswordDeliveryPerson.add(btnNewButton);
		btnNewButton.setFont(new Font("Serif", Font.ITALIC, 24));
		
		PanelChangePasswordDeliveryPerson.setVisible(true);
		
	}
	
	
	
	public void signup_page() {
		final JTextField textField;
		final JPasswordField textField_1;
	    final JPasswordField textField_2;
		
		
	    final JPanel signup=new JPanel();
		signup.setSize(706,611);
		signup.setVisible(true);
		signup.setLayout(null);
		frame.getContentPane().add(signup,"SIGN UP");
		
		textField = new JTextField("");
		textField.setBounds(179, 192, 409, 50);
		signup.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Serif", Font.PLAIN,22));
		
		textField_1 = new JPasswordField("");
		textField_1.setBounds(179, 283, 409, 50);
		signup.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Serif", Font.PLAIN,22));
		
		JLabel lblReEnterPassword = new JLabel("Re enter Password :");
		lblReEnterPassword.setBounds(10, 368, 200, 50);
		signup.add(lblReEnterPassword);
		lblReEnterPassword.setFont(new Font("Serif", Font.ITALIC,19));
		
		textField_2 = new JPasswordField("");
		textField_2.setBounds(179, 371, 409, 50);
		signup.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Serif", Font.PLAIN,22));
		
		JLabel lblLetsCreateA = new JLabel("Let's create a new account.");
		lblLetsCreateA.setBounds(38, 99, 337, 50);
		signup.add(lblLetsCreateA);
		lblLetsCreateA.setFont(new Font("Serif", Font.ITALIC,25));
	    
	    
		
		JButton btnCreateNewAccount = new JButton("CREATE NEW ACCOUNT ");
		btnCreateNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user;
				
				// Create a new account
			//	textField_1=(JPasswordField)e.getSource();
				char[] k=textField_1.getPassword();
				String pass1=new String(k);
				
			//	textField_2=(JPasswordField)e.getSource();
				char[] k1=textField_2.getPassword();
				String pass2=new String(k1);
				
				
				
				if(!textField.getText().equals(""))
				{  
					user= textField.getText();
					
					if(!pass1.equals("")&&!pass2.equals("")){
					if(pass1.equals(pass2)){
						
						//DeliveryDatabase.manager.SetUserID(user);
						//DeliveryDatabase.manager.SetPassword(pass1);
						deliveryDatabase.manager=new Manager(user,pass1);
						
						
						JOptionPane.showMessageDialog(null,"Manager account successfully created !!");
						
						/* GO TO LOGIN PAGE */ 
						SaveEverything();
						signup.setVisible(false);
						frame.getContentPane().remove(signup);
						Login();
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"Password field doesn't match. Try again !!");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Dont leave the password field(s) empty.");
					}
					
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter the username !!");
				}	
				
			}
		});
		btnCreateNewAccount.setBounds(313, 462, 312, 73);
		signup.add(btnCreateNewAccount);
		btnCreateNewAccount.setFont(new Font("Serif", Font.ITALIC,15));
		
		
		
		JLabel lblHelloManager = new JLabel("Welcome Manager !!");
		lblHelloManager.setBounds(179, 48, 272, 50);
		signup.add(lblHelloManager);
		lblHelloManager.setFont(new Font("Serif", Font.ITALIC,27));
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*Login page */
				signup.setVisible(false);
				frame.getContentPane().remove(signup);
				Login();
				
				
			}
		});
		btnNewButton.setBounds(10, 462, 280, 73);
		signup.add(btnNewButton);
		btnNewButton.setFont(new Font("Serif", Font.ITALIC,15));
		
		JLabel lblEnterUsername = new JLabel("Enter Username :");
		lblEnterUsername.setBounds(22, 189, 200, 50);
		signup.add(lblEnterUsername);
		lblEnterUsername.setFont(new Font("Serif", Font.ITALIC,19));
		
		JLabel lblEnterPassword = new JLabel("Enter Password :");
		lblEnterPassword.setBounds(22, 280, 200, 50);
		signup.add(lblEnterPassword);
		lblEnterPassword.setFont(new Font("Serif", Font.ITALIC,19));
		
		
		signup.setVisible(true);
	
		
	}


	
	
	
	public void BillReminder(final Manager manager){
		PanelBillReminder = new JPanel();
		frame.getContentPane().add(PanelBillReminder, "name_11725845431438");
		
		final DefaultListModel CustomerNames = new DefaultListModel();
    	for(Customer temp : deliveryDatabase.ListCustomers){
    		Date Today = new Date();
    		long diff = - temp.GetDateTillBillPaid().getTime() + Today.getTime();
    		if(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) > 60)CustomerNames.addElement("Late by 2 months : " + temp.GetName());
    		else if(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) > 30)CustomerNames.addElement("Late by 1 months : " + temp.GetName());
    		
    	}
    	PanelBillReminder.setLayout(null);
        
    	final JList CustomerNameList = new JList(CustomerNames);
    	CustomerNameList.setBounds(17, 21, 256, 48);
    	CustomerNameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	CustomerNameList.setSelectedIndex(0);
    	CustomerNameList.setVisibleRowCount(3);
    	PanelBillReminder.add(CustomerNameList);
    	
    	JScrollPane CustomerNameListScrollPane = new JScrollPane(CustomerNameList);
    	CustomerNameListScrollPane.setBounds(160, 30, 300, 95);
    	PanelBillReminder.add(CustomerNameListScrollPane);
    	
    	
    	btnDone_6 = new JButton("Done");
    	btnDone_6.setFont(new Font("Serif", Font.PLAIN, 20));
    	btnDone_6.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelBillReminder.setVisible(false);
    		ManagerLoggedIn(manager);
    		}
    	});
    	btnDone_6.setBounds(80, 258, 300, 52);
    	PanelBillReminder.add(btnDone_6);
    	
    	lblBillReminder = new JLabel("Bill Reminder");
    	lblBillReminder.setFont(new Font("Serif", Font.PLAIN, 20));
    	lblBillReminder.setBounds(183, 11, 244, 42);
    	PanelBillReminder.add(lblBillReminder);
    	
    	JScrollBar scrollBar = new JScrollBar();
    	scrollBar.setBounds(363, 120, 17, 93);
    	PanelBillReminder.add(scrollBar);
    	
    	
   
    	
    	
    	
    	
    	PanelBillReminder.setVisible(true);
	}
	
	private void CustomerSection(final Manager manager){
		
		PanelCustomerSection = new JPanel();
		frame.getContentPane().add(PanelCustomerSection, "name_189010185122708");
		
		final DefaultListModel CustomerNames = new DefaultListModel();
    	for(Customer temp : deliveryDatabase.ListCustomers){
    		CustomerNames.addElement(temp.GetName());
    	}
        
    	final JList CustomerNameList = new JList(CustomerNames);
    	CustomerNameList.setBounds(17, 21, 256, 48);
    	CustomerNameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	CustomerNameList.setSelectedIndex(0);
    	CustomerNameList.setVisibleRowCount(3);
    	PanelCustomerSection.add(CustomerNameList);
    	
    	JScrollPane CustomerNameListScrollPane = new JScrollPane(CustomerNameList);
    	CustomerNameListScrollPane.setBounds(160, 30, 300, 95);
    	PanelCustomerSection.add(CustomerNameListScrollPane);
    	
    	JButton showOptions = new JButton("ShowOptions");
    	showOptions.setFont(new Font("Serif", Font.PLAIN, 18));
    	showOptions.setBounds(224, 200, 186, 52);
    	showOptions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
               int index = CustomerNameList.getSelectedIndex();
               if (index != -1) {                     
                  Customer temp = deliveryDatabase.ListCustomers.get(index);
                  PanelCustomerSection.setVisible(false);
                  CustomerSection_1(manager,temp);
               }
            }
         });
    	PanelCustomerSection.add(showOptions);
    	PanelCustomerSection.setLayout(null);
    	
    	
    	
    	
    	JButton btnDone = new JButton("Done");
    	btnDone.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnDone.setBounds(224, 288, 186, 52);
    	btnDone.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelCustomerSection.setVisible(false);
    			ManagerLoggedIn(manager);

    		}
    	});
    	PanelCustomerSection.add(btnDone);
    	
    	
    	
    	PanelCustomerSection.setVisible(true);
	}
	
	private void AssignDeliveryBoy(final Manager manager, final Customer customer){
	
		PanelAssignDeliveryBoy = new JPanel();
		frame.getContentPane().add(PanelAssignDeliveryBoy, "name_369154345054678");
		PanelAssignDeliveryBoy.setLayout(null);
		
		final DefaultListModel DeliveryPersonNames = new DefaultListModel();
    	for(DeliveryPerson temp : deliveryDatabase.ListDeliveryPerson){
    		DeliveryPersonNames.addElement(temp.getUserID());
    	}
        
    	final JList DeliveryPersonNamesList = new JList(DeliveryPersonNames);
    	DeliveryPersonNamesList.setBounds(1, 1, 256, 48);
    	DeliveryPersonNamesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	DeliveryPersonNamesList.setSelectedIndex(0);
    	DeliveryPersonNamesList.setVisibleRowCount(3);
    	PanelAssignDeliveryBoy.add(DeliveryPersonNamesList);
    	
    	JScrollPane DeliveryPersonNameListScrollPane = new JScrollPane(DeliveryPersonNamesList);
    	DeliveryPersonNameListScrollPane.setBounds(150, 70, 300, 100);
    	PanelAssignDeliveryBoy.add(DeliveryPersonNameListScrollPane);
    	
    	btnAssign = new JButton("Assign");
    	btnAssign.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnAssign.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			int index =  DeliveryPersonNamesList.getSelectedIndex();
    			String DeliveryBoyAssignedID = deliveryDatabase.ListDeliveryPerson.get(index).getUserID();
    			customer.GetSubscriptions().setDeliveryBoyAssignedID(DeliveryBoyAssignedID);
    			JOptionPane.showMessageDialog(null, DeliveryBoyAssignedID + " assigned to " + customer.GetName());
    			SaveEverything();
    		}
    	});
    	btnAssign.setBounds(174, 238, 243, 65);
    	PanelAssignDeliveryBoy.add(btnAssign);
    	
    	btnDone_4 = new JButton("Done");
    	btnDone_4.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnDone_4.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelAssignDeliveryBoy.setVisible(false);
    			CustomerSection_1(manager,customer);
    		}
    	});
    	btnDone_4.setBounds(174, 360, 243, 65);
    	PanelAssignDeliveryBoy.add(btnDone_4);
    	
    	JLabel lblAssignDelieryPerson = new JLabel("Assign Deliery Person");
    	lblAssignDelieryPerson.setFont(new Font("Serif", Font.PLAIN, 25));
    	lblAssignDelieryPerson.setBounds(192, 11, 315, 37);
    	PanelAssignDeliveryBoy.add(lblAssignDelieryPerson);
    	
    	PanelAssignDeliveryBoy.setVisible(true);
	}
	
	private void CustomerSection_1(final Manager manager, final Customer customer){
		PanelCustomerSection_1 = new JPanel();
    	frame.getContentPane().add(PanelCustomerSection_1, "name_244963359326653");
    	PanelCustomerSection_1.setLayout(null);
    	
    	button = new JButton("ModifySubscription");
    	button.setFont(new Font("Serif", Font.PLAIN, 18));
    	button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelCustomerSection_1.setVisible(false);
    			ModifySubscription(manager,customer);
    		}
    	});
    	button.setBounds(44, 286, 214, 58);
    	PanelCustomerSection_1.add(button);
    	
    	label = new JLabel("Name :");
    	label.setFont(new Font("Serif", Font.PLAIN, 16));
    	label.setBounds(44, 115, 71, 33);
    	PanelCustomerSection_1.add(label);
    	
    	label_1 = new JLabel(customer.GetName());
    	label_1.setFont(new Font("Serif", Font.PLAIN, 19));
    	label_1.setBounds(154, 115, 96, 33);
    	PanelCustomerSection_1.add(label_1);
    	
    	label_2 = new JLabel("UserID :");
    	label_2.setFont(new Font("Serif", Font.PLAIN, 16));
    	label_2.setBounds(44, 159, 62, 24);
    	PanelCustomerSection_1.add(label_2);
    	
    	lblUserid_2 = new JLabel(customer.GetCustomerID());
    	lblUserid_2.setFont(new Font("Serif", Font.PLAIN, 19));
    	lblUserid_2.setBounds(154, 155, 104, 33);
    	PanelCustomerSection_1.add(lblUserid_2);
    	
    	label_4 = new JLabel("Address :");
    	label_4.setFont(new Font("Serif", Font.PLAIN, 16));
    	label_4.setBounds(41, 194, 83, 32);
    	PanelCustomerSection_1.add(label_4);
    	
    	label_5 = new JLabel(customer.GetAddress());
    	label_5.setFont(new Font("Serif", Font.PLAIN, 19));
    	label_5.setBounds(154, 194, 112, 32);
    	PanelCustomerSection_1.add(label_5);
    	
    	lblCustomerSection = new JLabel("Customer Section");
    	lblCustomerSection.setFont(new Font("Serif", Font.PLAIN, 25));
    	lblCustomerSection.setBounds(194, 11, 241, 33);
    	PanelCustomerSection_1.add(lblCustomerSection);
    	
    	btnAssignDeliveryBoy = new JButton("Assign Delivery Person");
    	btnAssignDeliveryBoy.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnAssignDeliveryBoy.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelCustomerSection_1.setVisible(false);
    			AssignDeliveryBoy(manager,customer);
    		}
    	});
    	btnAssignDeliveryBoy.setBounds(45, 373, 216, 58);
    	PanelCustomerSection_1.add(btnAssignDeliveryBoy);
    	
    	btnSeeBill = new JButton("See Bill");
    	btnSeeBill.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnSeeBill.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			String message = null;
    			double Bill = 0.0;
    			for(Magazine temp : customer.GetSubscriptions().getListSubscription()){
    				Bill += 30.0 * temp.GetCost();
    			}
    			message = customer.GetName() + "'s Bill is " + Bill;
    			JOptionPane.showMessageDialog(null,message);
    		}
    	});
    	btnSeeBill.setBounds(366, 286, 216, 58);
    	PanelCustomerSection_1.add(btnSeeBill);
    	
    	btnDone_2 = new JButton("Done");
    	btnDone_2.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnDone_2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelCustomerSection_1.setVisible(false);
    			ManagerLoggedIn(manager);
    		}
    	});
    	btnDone_2.setBounds(44, 455, 216, 58);
    	PanelCustomerSection_1.add(btnDone_2);
    	
    	btnPayBill = new JButton("Pay Bill");
    	btnPayBill.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnPayBill.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    		customer.ComputeBill();
    		customer.payBill(customer.GetBill());	
    		JOptionPane.showMessageDialog(null, "Bill is successfully paid");
    		}
    	});
    	btnPayBill.setBounds(366, 373, 216, 58);
    	PanelCustomerSection_1.add(btnPayBill);
    	
    	JButton btnDelete = new JButton("Delete");
    	btnDelete.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    		deliveryDatabase.ListCustomers.remove(customer);
    		JOptionPane.showMessageDialog(null, "Customer deleted!");
			SaveEverything();
    		PanelCustomerSection_1.setVisible(false);
    		ManagerLoggedIn(manager);
    		}
    	});
    	btnDelete.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnDelete.setBounds(366, 455, 216, 58);
    	PanelCustomerSection_1.add(btnDelete);
    	
    	
    	
    	PanelCustomerSection_1.setVisible(true);
	}
	
	private void ModifySubscription(final Manager manager, final Customer customer){

    	PanelModifySubscription = new JPanel();
    	frame.getContentPane().add(PanelModifySubscription, "name_363175685060824");
    	PanelModifySubscription.setLayout(null);
    	
    	final DefaultListModel MagazineNames = new DefaultListModel();
    	for(Magazine temp : deliveryDatabase.ListMagazine){
    		MagazineNames.addElement(temp.GetTitle());
    	}
        
    	final JList MagazineNameList = new JList(MagazineNames);
    	MagazineNameList.setBounds(17, 21, 256, 48);
    	MagazineNameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	MagazineNameList.setSelectedIndex(0);
    	MagazineNameList.setVisibleRowCount(3);
    	PanelModifySubscription.add(MagazineNameList);
    	
    	JScrollPane MagazineNameListScrollPane = new JScrollPane(MagazineNameList);
    	MagazineNameListScrollPane.setBounds(150, 100, 300, 95);
    	PanelModifySubscription.add(MagazineNameListScrollPane);
    	
    	btnAddSubscription = new JButton("Add Subscription");
    	btnAddSubscription.setFont(new Font("Serif", Font.PLAIN, 20));
    	btnAddSubscription.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			int index = MagazineNameList.getSelectedIndex();
    				for(Magazine temp : customer.GetSubscriptions().getListSubscription()){
    					if(deliveryDatabase.ListMagazine.get(index).equals(temp)){
    	    				JOptionPane.showMessageDialog(null,deliveryDatabase.ListMagazine.get(index).GetTitle() + " is already in " + customer.GetName() + "'s subscriptions.");
    	    			
    	    				return;
    					}
    				
    				}
    				
    				customer.GetSubscriptions().getListSubscription().add(deliveryDatabase.ListMagazine.get(index));
    				JOptionPane.showMessageDialog(null,deliveryDatabase.ListMagazine.get(index).GetTitle() + " added to " + customer.GetName() + "'s subscriptions.");
    				
    				}
    			
    		
    	});
    	btnAddSubscription.setBounds(150, 242, 300, 70);
    	PanelModifySubscription.add(btnAddSubscription);
    	
    	btnRemoveSubscription = new JButton("Remove Subscription");
    	btnRemoveSubscription.setFont(new Font("Serif", Font.PLAIN, 20));
    	btnRemoveSubscription.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			int index = MagazineNameList.getSelectedIndex();
    			if(index != -1){
    				Magazine magazine = deliveryDatabase.ListMagazine.get(index);
    				int i = 0;
    				for(Magazine temp : customer.GetSubscriptions().getListSubscription()){
    					if(temp.equals(magazine)){
    						JOptionPane.showMessageDialog(null,temp.GetTitle() + " removed from " + customer.GetName() + "'s subscriptions.");
    						 customer.GetSubscriptions().getListSubscription().remove(i);
    						 SaveEverything();
    						 return;
    					}
						 i++;
    				}
    				JOptionPane.showMessageDialog(null,magazine.GetTitle() + " is not in " + customer.GetName() + "'s subscriptions");
    				
    			}

    		}
    	});
    	btnRemoveSubscription.setBounds(150, 323, 300, 70);
    	PanelModifySubscription.add(btnRemoveSubscription);
    	
    	btnDone_3 = new JButton("Done");
    	btnDone_3.setFont(new Font("Serif", Font.PLAIN, 20));
    	btnDone_3.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelModifySubscription.setVisible(false);
    			CustomerSection_1(manager,customer);
    		}
    	});
    	btnDone_3.setBounds(150, 446, 300, 70);
    	PanelModifySubscription.add(btnDone_3);
    	
    	JLabel lblModifySubscriptions = new JLabel("Modify Subscriptions");
    	lblModifySubscriptions.setFont(new Font("Serif", Font.PLAIN, 24));
    	lblModifySubscriptions.setBounds(198, 29, 336, 33);
    	PanelModifySubscription.add(lblModifySubscriptions);
    	
    	PanelModifySubscription.setVisible(true);
	}
	
	private void UpdateDetails(final Manager manager){
		
		PanelUpdateDetails = new JPanel();
		frame.getContentPane().add(PanelUpdateDetails, "name_186835017401195");
		PanelUpdateDetails.setLayout(null);
		
		JLabel lblUpdateDetails = new JLabel("Update details");
		lblUpdateDetails.setBounds(204, 11, 185, 33);
		lblUpdateDetails.setFont(new Font("Serif", Font.PLAIN, 25));
		PanelUpdateDetails.add(lblUpdateDetails);
		
		JLabel lblUserid = new JLabel("UserID : ");
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserid.setBounds(10, 98, 75, 43);
		PanelUpdateDetails.add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(176, 100, 201, 43);
		PanelUpdateDetails.add(textField);
		textField.setColumns(10);
		textField.setText(deliveryDatabase.manager.GetUserID());
		
		JLabel lblPassword = new JLabel("Old Password : ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 165, 102, 43);
		PanelUpdateDetails.add(lblPassword);
		
		final JPasswordField passwordField = new JPasswordField(20);		
		passwordField.setColumns(10);
		passwordField.setBounds(176, 167, 201, 43);
		PanelUpdateDetails.add(passwordField);
		
		
		lblNewPassword = new JLabel("New Password : ");
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewPassword.setBounds(10, 229, 119, 43);
		PanelUpdateDetails.add(lblNewPassword);
		
		final JPasswordField passwordField_1 = new JPasswordField(20);		
		passwordField_1.setColumns(10);
		passwordField_1.setBounds(176, 231, 201, 43);
		PanelUpdateDetails.add(passwordField_1);
		
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			if(passwordField.getText().equals(manager.GetPassword())){
			deliveryDatabase.manager.SetUserID(textField.getText());
			deliveryDatabase.manager.SetPassword(passwordField_1.getText());
			JOptionPane.showMessageDialog(null, "Details successfully updated.");
			System.out.println(deliveryDatabase.manager.GetUserID());	
			SaveEverything();
			PanelUpdateDetails.setVisible(false);
			ManagerLoggedIn(manager);
			}
			else{
				JOptionPane.showMessageDialog(null,"Invalid username / password.");			}
			
			}
		});
		btnSubmit.setBounds(117, 325, 201, 43);
		PanelUpdateDetails.add(btnSubmit);
		
		JButton btnDone_1 = new JButton("Back");
		btnDone_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDone_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelUpdateDetails.setVisible(false);
				ManagerLoggedIn(manager);
			}
		});
		btnDone_1.setBounds(117, 391, 201, 43);
		PanelUpdateDetails.add(btnDone_1);
		
	
		PanelUpdateDetails.setVisible(true);
	}
	private void CreateDeliveryPerson(final Manager manager){
		
		PanelCreateDeliveryPerson = new JPanel();
		frame.getContentPane().add(PanelCreateDeliveryPerson, "name_185635472486948");
		PanelCreateDeliveryPerson.setLayout(null);
		
		JLabel lblCreateNewDelivery = new JLabel("Create new Delivery Person");
		lblCreateNewDelivery.setFont(new Font("Serif", Font.PLAIN, 25));
		lblCreateNewDelivery.setBounds(98, 11, 312, 31);
		PanelCreateDeliveryPerson.add(lblCreateNewDelivery);
		
		JLabel lblUserid = new JLabel("UserID : ");
		lblUserid.setFont(new Font("Serif", Font.PLAIN, 17));
		lblUserid.setBounds(20, 99, 69, 48);
		PanelCreateDeliveryPerson.add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(117, 99, 239, 48);
		PanelCreateDeliveryPerson.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 17));
		lblPassword.setBounds(20, 179, 87, 45);
		PanelCreateDeliveryPerson.add(lblPassword);
		
		final JPasswordField passwordField = new JPasswordField(20);		
		passwordField.setColumns(10);
		passwordField.setBounds(117, 176, 239, 48);
		PanelCreateDeliveryPerson.add(passwordField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Serif", Font.PLAIN, 18));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("") || passwordField.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please don't leave empty fields.");
					return;
				}
			deliveryDatabase.ListDeliveryPerson.add(new DeliveryPerson(textField.getText(), passwordField.getText()));
			System.out.println(deliveryDatabase.ListDeliveryPerson.get(deliveryDatabase.ListDeliveryPerson.size()-1).getUserID() );
			SaveEverything();
			PanelCreateDeliveryPerson.setVisible(false);
			ManagerLoggedIn(manager);
			}
		});
		btnSubmit.setBounds(117, 281, 214, 48);
		PanelCreateDeliveryPerson.add(btnSubmit);
		
		PanelCreateDeliveryPerson.setVisible(true);
	}
	
	private void ManagerLoggedIn(final Manager manager){

		PanelManagerLoggedIn = new JPanel();
		frame.getContentPane().add(PanelManagerLoggedIn, "name_92465843807035");
		PanelManagerLoggedIn.setBounds(100, 100, 450, 300);
		PanelManagerLoggedIn.setLayout(null);
		
		JButton btnSeeMonthlyReport = new JButton("SeeMonthlyReport");
		btnSeeMonthlyReport.setFont(new Font("Serif", Font.PLAIN, 15));
		btnSeeMonthlyReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				SeeMonthlyReport(manager);
			}
		});
		btnSeeMonthlyReport.setBounds(24, 57, 203, 52);
		PanelManagerLoggedIn.add(btnSeeMonthlyReport);
		
		JButton btnSeepayroll = new JButton("SeePayRoll");
		btnSeepayroll.setFont(new Font("Serif", Font.PLAIN, 15));
		btnSeepayroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//SeePayRoll(manager);
				PanelManagerLoggedIn.setVisible(false);
				SeePayRoll(manager);
			}
		});
		btnSeepayroll.setBounds(344, 57, 203, 52);
		PanelManagerLoggedIn.add(btnSeepayroll);
		
		JButton btnBillreminder = new JButton("BillReminder");
		btnBillreminder.setFont(new Font("Serif", Font.PLAIN, 15));
		btnBillreminder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				BillReminder(manager);
			}
		});
		btnBillreminder.setBounds(24, 198, 203, 52);
		PanelManagerLoggedIn.add(btnBillreminder);
		
		JButton btnCustomersection = new JButton("CustomerSection");
		btnCustomersection.setFont(new Font("Serif", Font.PLAIN, 15));
		btnCustomersection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				CustomerSection(manager);
			}
		});
		btnCustomersection.setBounds(344, 198, 203, 52);
		PanelManagerLoggedIn.add(btnCustomersection);
		
		JLabel lblWelcomeMrManager = new JLabel(" Welcome Mr. " + manager.GetUserID());
		lblWelcomeMrManager.setFont(new Font("Serif", Font.PLAIN, 24));
		lblWelcomeMrManager.setBounds(172, 11, 231, 35);
		PanelManagerLoggedIn.add(lblWelcomeMrManager);
		
		JButton btnCreatedeliveryperon = new JButton("CreateDeliveryPeron");
		btnCreatedeliveryperon.setFont(new Font("Serif", Font.PLAIN, 15));
		btnCreatedeliveryperon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				CreateDeliveryPerson(manager);
				}
		});
		btnCreatedeliveryperon.setBounds(24, 130, 203, 52);
		PanelManagerLoggedIn.add(btnCreatedeliveryperon);
		
		JButton btnUpdatedetails = new JButton("UpdateDetails");
		btnUpdatedetails.setFont(new Font("Serif", Font.PLAIN, 15));
		btnUpdatedetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				UpdateDetails(manager);
			}
		});
		btnUpdatedetails.setBounds(344, 130, 203, 52);
		PanelManagerLoggedIn.add(btnUpdatedetails);
		
		JButton btnCreatecustomer = new JButton("CreateCustomer");
		btnCreatecustomer.setFont(new Font("Serif", Font.PLAIN, 15));
		btnCreatecustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				CreateCustomer(manager);
			}
		});
		btnCreatecustomer.setBounds(24, 276, 203, 52);
		PanelManagerLoggedIn.add(btnCreatecustomer);
		
		JButton btnDeliveryperonSection = new JButton("DeliveryPerson Section");
		btnDeliveryperonSection.setFont(new Font("Serif", Font.PLAIN, 15));
		btnDeliveryperonSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			PanelManagerLoggedIn.setVisible(false);	
			DeliveryPersonSection(manager);
			}
		});
		btnDeliveryperonSection.setBounds(344, 276, 203, 52);
		PanelManagerLoggedIn.add(btnDeliveryperonSection);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Serif", Font.PLAIN, 15));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelManagerLoggedIn.setVisible(false);
				Login();
			}
		});
		btnLogout.setBounds(24, 350, 203, 52);
		PanelManagerLoggedIn.add(btnLogout);
		
		JButton btnCreateMagazine = new JButton("Create magazine");
		btnCreateMagazine.setFont(new Font("Serif", Font.PLAIN, 15));
		btnCreateMagazine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			PanelManagerLoggedIn.setVisible(false);
			CreateMagazine(manager);
			}
		});
		btnCreateMagazine.setBounds(344, 350, 203, 52);
		PanelManagerLoggedIn.add(btnCreateMagazine);
		
		frame.setBounds(10, 10, 620, 650);
				
		
		PanelManagerLoggedIn.setVisible(true);
	}
	
	private void CreateMagazine(final Manager manager){
		PanelCreateMagazine = new JPanel();
		frame.getContentPane().add(PanelCreateMagazine, "name_337292615152869");
		PanelCreateMagazine.setLayout(null);
		
		JLabel lblCreateMagazine = new JLabel("Create Magazine");
		lblCreateMagazine.setFont(new Font("Serif", Font.PLAIN, 24));
		lblCreateMagazine.setBounds(182, 30, 350, 38);
		PanelCreateMagazine.add(lblCreateMagazine);
		
		JLabel lblTitle = new JLabel("Title :");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setBounds(29, 141, 46, 14);
		PanelCreateMagazine.add(lblTitle);
		
		textField_5 = new JTextField();
		textField_5.setBounds(108, 131, 295, 38);
		PanelCreateMagazine.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCode = new JLabel("Code :");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCode.setBounds(29, 189, 46, 14);
		PanelCreateMagazine.add(lblCode);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 181, 295, 35);
		PanelCreateMagazine.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(108, 227, 295, 36);
		PanelCreateMagazine.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(108, 274, 295, 35);
		PanelCreateMagazine.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(108, 320, 295, 38);
		PanelCreateMagazine.add(textField_9);
		
		JLabel lblPublisher = new JLabel("Publisher :");
		lblPublisher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPublisher.setBounds(29, 233, 69, 20);
		PanelCreateMagazine.add(lblPublisher);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblType.setBounds(29, 281, 69, 17);
		PanelCreateMagazine.add(lblType);
		
		JLabel lblCost = new JLabel("Cost :");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCost.setBounds(29, 330, 69, 14);
		PanelCreateMagazine.add(lblCost);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			deliveryDatabase.ListMagazine.add(new Magazine(textField_5.getText(),Integer.parseInt(textField_6.getText()),textField_7.getText(),textField_8.getText(),Double.parseDouble(textField_9.getText())));
			JOptionPane.showMessageDialog(null, "Magazine " + deliveryDatabase.ListMagazine.get(deliveryDatabase.ListMagazine.size()-1).GetTitle() + " Added.");
			SaveEverything();
			PanelCreateMagazine.setVisible(false);
			ManagerLoggedIn(manager);
			}
		});
		btnSubmit_1.setBounds(108, 391, 295, 49);
		PanelCreateMagazine.add(btnSubmit_1);
		
		PanelCreateMagazine.setVisible(true);
	}

	public void SeeMonthlyReport(final Manager manager){
		//SaveEverything();
		PanelSeeMonthlyReport = new JPanel();
		frame.getContentPane().add(PanelSeeMonthlyReport, "name_9109717220102");
		PanelSeeMonthlyReport.setLayout(null);
		
		int NoOfCustomers = 0;
		int NoOfDeliveryPerson = 0;
		double Revenue = 0.0;
		double SalaryToBePaid = 0.0;
		
		for(Customer customer : deliveryDatabase.ListCustomers){
			NoOfCustomers++;
			customer.ComputeBill();
			Revenue += customer.GetBill();
		}
		for(DeliveryPerson temp : deliveryDatabase.ListDeliveryPerson ){
			NoOfDeliveryPerson++;
			temp.ComputeMonthlyPayRoll(deliveryDatabase);
			SalaryToBePaid += temp.getmonthlyPayroll();
		}
		
		JLabel lblMonthlyReport = new JLabel("Monthly Report");
		lblMonthlyReport.setFont(new Font("Serif", Font.PLAIN, 25));
		lblMonthlyReport.setBounds(235, 11, 200, 32);
		PanelSeeMonthlyReport.add(lblMonthlyReport);
		
		
		JLabel lblNumberOfCustomers = new JLabel("Number of customers : " + NoOfCustomers);
		lblNumberOfCustomers.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNumberOfCustomers.setBounds(10, 119, 232, 36);
		PanelSeeMonthlyReport.add(lblNumberOfCustomers);
		
		JLabel lblTotalRevenue = new JLabel("Total revenue : " + Revenue);
		lblTotalRevenue.setFont(new Font("Serif", Font.PLAIN, 18));
		lblTotalRevenue.setBounds(10, 166, 232, 32);
		PanelSeeMonthlyReport.add(lblTotalRevenue);
		
		JLabel lblNumberOfDelivery = new JLabel("Number of Delivery Person : " + NoOfDeliveryPerson);
		lblNumberOfDelivery.setFont(new Font("Serif", Font.PLAIN, 19));
		lblNumberOfDelivery.setBounds(10, 208, 264, 36);
		PanelSeeMonthlyReport.add(lblNumberOfDelivery);
		
		JLabel lblSalaryToBe = new JLabel("Salary to be paid : " + SalaryToBePaid);
		lblSalaryToBe.setFont(new Font("Serif", Font.PLAIN, 18));
		lblSalaryToBe.setBounds(10, 257, 182, 32);
		PanelSeeMonthlyReport.add(lblSalaryToBe);
		
		JButton btnDone_5 = new JButton("Done");
		btnDone_5.setFont(new Font("Serif", Font.PLAIN, 21));
		btnDone_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelSeeMonthlyReport.setVisible(false);
				ManagerLoggedIn(manager);
			}
		});
		btnDone_5.setBounds(194, 424, 258, 65);
		PanelSeeMonthlyReport.add(btnDone_5);
		
		PanelSeeMonthlyReport.setVisible(true);
	}
	private void DeliveryPersonSection(final Manager manager){
		PanelDeliveryPersonSection = new JPanel();
		frame.getContentPane().add(PanelDeliveryPersonSection, "name_370563901499284");
		PanelDeliveryPersonSection.setLayout(null);	
		
		final DefaultListModel DeliveryPersonNames = new DefaultListModel();
    	for(DeliveryPerson temp : deliveryDatabase.ListDeliveryPerson){
    		DeliveryPersonNames.addElement(temp.getUserID());
    	}
        
    	final JList DeliveryPersonNamesList = new JList(DeliveryPersonNames);
    	DeliveryPersonNamesList.setBounds(1, 1, 256, 48);
    	DeliveryPersonNamesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	DeliveryPersonNamesList.setSelectedIndex(0);
    	DeliveryPersonNamesList.setVisibleRowCount(3);
    	PanelDeliveryPersonSection.add(DeliveryPersonNamesList);
    	
    	JScrollPane DeliveryPersonNameListScrollPane = new JScrollPane(DeliveryPersonNamesList);
    	DeliveryPersonNameListScrollPane.setBounds(200, 100, 258, 100);
    	PanelDeliveryPersonSection.add(DeliveryPersonNameListScrollPane);
    	
    	btnSelect = new JButton("Back");
    	btnSelect.setFont(new Font("Serif", Font.PLAIN, 20));
    	btnSelect.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			PanelDeliveryPersonSection.setVisible(false);
    			ManagerLoggedIn(manager);
    		}
    	});
    	btnSelect.setBounds(200, 282, 258, 54);
    	PanelDeliveryPersonSection.add(btnSelect);
    	
    	JLabel lblDeliveryPersonSection = new JLabel("Delivery Person Section");
    	lblDeliveryPersonSection.setFont(new Font("Serif", Font.PLAIN, 25));
    	lblDeliveryPersonSection.setBounds(208, 11, 258, 37);
    	PanelDeliveryPersonSection.add(lblDeliveryPersonSection);
    	
    	JButton btnDeleteDeliveryPerson = new JButton("Delete Delivery Person");
    	btnDeleteDeliveryPerson.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			deliveryDatabase.ListDeliveryPerson.remove(DeliveryPersonNamesList.getSelectedIndex());
    			JOptionPane.showMessageDialog(null, "Delivery Person deleted.");
    			SaveEverything();
    			PanelDeliveryPersonSection.setVisible(false);
    			ManagerLoggedIn(manager);
    		}
    	});
    	btnDeleteDeliveryPerson.setFont(new Font("Serif", Font.PLAIN, 20));
    	btnDeleteDeliveryPerson.setBounds(200, 389, 258, 54);
    	PanelDeliveryPersonSection.add(btnDeleteDeliveryPerson);
    	
    	
		
    	PanelDeliveryPersonSection.setVisible(true);
	}
	
	private void CreateCustomer(final Manager manager){
		PanelCreateCustomer = new JPanel();
		frame.getContentPane().add(PanelCreateCustomer, "name_249318603865912");
		PanelCreateCustomer.setLayout(null);
		
		JLabel lblCreateCustomer = new JLabel("Create Customer");
		lblCreateCustomer.setBounds(131, 11, 317, 37);
		lblCreateCustomer.setFont(new Font("Serif", Font.PLAIN, 25));
		PanelCreateCustomer.add(lblCreateCustomer);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(5, 261, 61, 29);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PanelCreateCustomer.add(lblName);
		
		JLabel lblUserid_1 = new JLabel("UserID : ");
		lblUserid_1.setBounds(5, 318, 61, 29);
		lblUserid_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PanelCreateCustomer.add(lblUserid_1);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setBounds(5, 372, 90, 29);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PanelCreateCustomer.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setBounds(105, 364, 241, 37);
		textField_4.setColumns(10);
		PanelCreateCustomer.add(textField_4);
		
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 310, 241, 37);
		textField_3.setColumns(10);
		PanelCreateCustomer.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 253, 241, 37);
		textField_2.setColumns(10);
		PanelCreateCustomer.add(textField_2);
		
		final DefaultListModel DeliveryPersonNames = new DefaultListModel();
    	for(DeliveryPerson temp : deliveryDatabase.ListDeliveryPerson){
    		DeliveryPersonNames.addElement(temp.getUserID());
    	}
        
    	final JList DeliveryPersonNamesList = new JList(DeliveryPersonNames);
    	DeliveryPersonNamesList.setBounds(1, 1, 256, 48);
    	DeliveryPersonNamesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	DeliveryPersonNamesList.setSelectedIndex(0);
    	DeliveryPersonNamesList.setVisibleRowCount(3);
    	PanelCreateCustomer.add(DeliveryPersonNamesList);
    	
    	JScrollPane DeliveryPersonNameListScrollPane = new JScrollPane(DeliveryPersonNamesList);
    	DeliveryPersonNameListScrollPane.setBounds(88, 58, 258, 100);
    	PanelCreateCustomer.add(DeliveryPersonNameListScrollPane);
    	
    	JLabel lblSelectDeliveryBoy = new JLabel("Select delivery boy to be assigned to the customer");
    	lblSelectDeliveryBoy.setFont(new Font("Serif", Font.PLAIN, 17));
    	lblSelectDeliveryBoy.setBounds(88, 191, 378, 30);
    	PanelCreateCustomer.add(lblSelectDeliveryBoy);
		
    	JButton btnCreateCustomer = new JButton("Create Customer");
    	btnCreateCustomer.setFont(new Font("Serif", Font.PLAIN, 18));
		btnCreateCustomer.setBounds(107, 425, 239, 59);
		btnCreateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_2.getText().equals("") || textField_3.getText().equals("") || textField_4.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Don't leave empty fields!");
					return;
				}
			Customer newCustomer = new Customer(textField_2.getText(),textField_3.getText(),textField_4.getText());
			int index = DeliveryPersonNamesList.getSelectedIndex();
            if (index != -1) {                     
    			String DeliveryBoyAssignedID = deliveryDatabase.ListDeliveryPerson.get(index).getUserID();
                newCustomer.GetSubscriptions().setDeliveryBoyAssignedID(DeliveryBoyAssignedID);
            }
            JOptionPane.showMessageDialog(null, "Customer " + newCustomer.GetName() + " created.");
            deliveryDatabase.ListCustomers.add(newCustomer);
			//System.out.println(DeliveryDatabase.ListCustomers.get(DeliveryDatabase.ListCustomers.size()-1).GetName() );
			//System.out.println(DeliveryDatabase.ListCustomers.get(DeliveryDatabase.ListCustomers.size()-1).GetSubscriptions().getDeliveryBoyAssignedID()  );
            SaveEverything();
            PanelCreateCustomer.setVisible(false);
            ManagerLoggedIn(manager);
			}
		});
		PanelCreateCustomer.add(btnCreateCustomer);
    	
    	
		PanelCreateCustomer.setVisible(true);
	}
	
    private void SeePayRoll(final Manager manager){
//SaveEverything();
    	PanelSeePayRoll = new JPanel();
		frame.getContentPane().add(PanelSeePayRoll, "name_93850022783599");
    	PanelSeePayRoll.setLayout(null);

    	final DefaultListModel DeliveryPersonNames = new DefaultListModel();
    	for(DeliveryPerson temp : deliveryDatabase.ListDeliveryPerson){
    		DeliveryPersonNames.addElement(temp.getUserID());
    	}
        
    	final JList DeliveryPersonNamesList = new JList(DeliveryPersonNames);
    	DeliveryPersonNamesList.setBounds(54, -11, 256, 48);
    	DeliveryPersonNamesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	DeliveryPersonNamesList.setSelectedIndex(0);
    	DeliveryPersonNamesList.setVisibleRowCount(3);
    	PanelSeePayRoll.add(DeliveryPersonNamesList);
    	
    	JScrollPane DeliveryPersonNameListScrollPane = new JScrollPane(DeliveryPersonNamesList);
    	DeliveryPersonNameListScrollPane.setBounds(180, 100, 258, 100);
    	PanelSeePayRoll.add(DeliveryPersonNameListScrollPane);
    	
    	final JLabel labelPayRoll = new JLabel("");
    	labelPayRoll.setBounds(165, 220, 300, 50);
		labelPayRoll.setFont(new Font("Tahoma", Font.PLAIN, 15));
    	
    	JButton showButton = new JButton("ShowPayroll");
    	showButton.setFont(new Font("Serif", Font.PLAIN, 18));
    	showButton.setBounds(180, 288, 258, 57);
    	showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
               String data = "";
               int index = DeliveryPersonNamesList.getSelectedIndex();
               System.out.println(index);
               if (index != -1) {      
            	   deliveryDatabase.ListDeliveryPerson.get(index).ComputeMonthlyPayRoll(deliveryDatabase);
                  data = "Pay Roll : " + deliveryDatabase.ListDeliveryPerson.get(index).getmonthlyPayroll();
                  labelPayRoll.setText(data);
                  labelPayRoll.setVisible(true);
               }
            }
         });
    	PanelSeePayRoll.add(showButton);
    	
    	
    	PanelSeePayRoll.add(labelPayRoll);
    	
    	JButton btnDone = new JButton("Done");
    	btnDone.setFont(new Font("Serif", Font.PLAIN, 18));
    	btnDone.setBounds(180, 377, 258, 57);
    	btnDone.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    	    	PanelSeePayRoll.setVisible(false);
    	    	ManagerLoggedIn(manager);
    		}
    	});
    	PanelSeePayRoll.add(btnDone);
    	
    	JLabel lblSeePayRoll = new JLabel("See Pay Roll");
    	lblSeePayRoll.setFont(new Font("Serif", Font.PLAIN, 25));
    	lblSeePayRoll.setBounds(240, 11, 257, 43);
    	PanelSeePayRoll.add(lblSeePayRoll);

    	PanelSeePayRoll.setVisible(true); //on last line
	}
}
