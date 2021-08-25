package xSkye;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class xSkyNet_Platform {

	private JFrame frmSignUp;
	private JTextField txtEmail;
	private JTextField txtFirstName;
	private JTextField txtName;
	private JTextField txtProfileName;
	private JTextField txtPassword;
	private JTextField txtConfirmPassword;
	private JLabel lblProfileName;
	private JLabel lblPassword;
	private JLabel lblComfirmPassword;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xSkyNet_Platform window = new xSkyNet_Platform();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public xSkyNet_Platform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setTitle("Sign Up");
		frmSignUp.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		frmSignUp.getContentPane().setBackground(Color.WHITE);
		frmSignUp.getContentPane().setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setForeground(Color.LIGHT_GRAY);
		txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtEmail.setText("mail@example.com");
		txtEmail.setBounds(489, 259, 395, 40);
		frmSignUp.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(Color.LIGHT_GRAY);
		txtFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(489, 313, 395, 40);
		frmSignUp.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtName.setForeground(Color.LIGHT_GRAY);
		txtName.setText("Last Name");
		txtName.setBounds(489, 366, 395, 40);
		frmSignUp.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtProfileName = new JTextField();
		txtProfileName.setForeground(Color.LIGHT_GRAY);
		txtProfileName.setText("Profile Name");
		txtProfileName.setBounds(489, 418, 395, 40);
		frmSignUp.getContentPane().add(txtProfileName);
		txtProfileName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setForeground(Color.LIGHT_GRAY);
		txtPassword.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtPassword.setText("Password");
		txtPassword.setBounds(489, 471, 396, 40);
		frmSignUp.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setText("Confirm Password");
		txtConfirmPassword.setForeground(Color.LIGHT_GRAY);
		txtConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtConfirmPassword.setColumns(10);
		txtConfirmPassword.setBounds(489, 524, 396, 40);
		frmSignUp.getContentPane().add(txtConfirmPassword);
		
		JLabel lblmail = new JLabel("Email");
		lblmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblmail.setBounds(287, 259, 56, 34);
		frmSignUp.getContentPane().add(lblmail);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblFirstName.setBounds(287, 319, 132, 34);
		frmSignUp.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblLastName.setBounds(287, 372, 132, 34);
		frmSignUp.getContentPane().add(lblLastName);
		
		lblProfileName = new JLabel("Profile Name");
		lblProfileName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblProfileName.setBounds(287, 424, 132, 34);
		frmSignUp.getContentPane().add(lblProfileName);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPassword.setBounds(287, 477, 132, 34);
		frmSignUp.getContentPane().add(lblPassword);
		
		lblComfirmPassword = new JLabel("Comfirm Password");
		lblComfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblComfirmPassword.setBounds(287, 530, 172, 34);
		frmSignUp.getContentPane().add(lblComfirmPassword);
		
		JLabel lblNewLabel = new JLabel("By Clicking the Sign up button, you agree to our \r\n");
		lblNewLabel.setBounds(489, 621, 276, 34);
		frmSignUp.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Term & Conditions and Privacy Policy ");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(489, 646, 223, 25);
		frmSignUp.getContentPane().add(lblNewLabel_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\LENOVO-1\\Pictures\\icons-xskynet\\copyright.jpg"));
		label.setForeground(new Color(0, 0, 0));
		label.setBackground(new Color(0, 0, 0));
		label.setBounds(0, 674, 1259, 34);
		frmSignUp.getContentPane().add(label);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\LENOVO-1\\Pictures\\icons-xskynet\\black.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1260, 34);
		frmSignUp.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\LENOVO-1\\Pictures\\icons-xskynet\\xskyenet.jpg"));
		lblNewLabel_2.setBounds(489, 26, 350, 165);
		frmSignUp.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\LENOVO-1\\Pictures\\icons-xskynet\\logo-signup.jpg"));
		lblNewLabel_4.setBounds(135, 180, 1035, 71);
		frmSignUp.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBackground(new Color(0, 0, 0));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\LENOVO-1\\Pictures\\icons-xskynet\\SignUp.jpg"));
		lblNewLabel_5.setBounds(489, 572, 276, 48);
		frmSignUp.getContentPane().add(lblNewLabel_5);
		frmSignUp.setBounds(100, 100, 1278, 756);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
