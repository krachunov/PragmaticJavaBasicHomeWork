package edu.pragmatic.java.basics.swing.loginMenu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

@SuppressWarnings("serial")
public class LoginPanel extends JFrame implements ActionListener {
	private JTextField userField = new JTextField("user");
	private JTextField passwordField = new JPasswordField("pass");
	private JButton loginButton = new JButton("Login");
	private final JLabel lblNewLabel = new JLabel("Enter the user");
	private final JLabel lblEnterThePassword = new JLabel("Enter the password");

	public LoginPanel() {

		loginButton.addActionListener(this);

		// check whether the field is filled and activate button
		DocumentListenerLogin text = new DocumentListenerLogin(userField,
				loginButton);
		userField.setName("User name");
		userField.getDocument().addDocumentListener(text);
		
		// removes the original text
		MouseAdapterLogin mouseOnUserFeild = new MouseAdapterLogin(userField);
		userField.addMouseListener(mouseOnUserFeild);
		
		// check whether the field is filled and activate button
		DocumentListenerLogin pass = new DocumentListenerLogin(passwordField,
				loginButton);
		passwordField.setName("Password");
		passwordField.getDocument().addDocumentListener(pass);
		
		// removes the original text
		MouseAdapterLogin mouseOnPasswordFeild = new MouseAdapterLogin(
				passwordField);
		passwordField.addMouseListener(mouseOnPasswordFeild);

		setTitle("Login Panel");
		setBounds(0, 0, 254, 119);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new BoxLayout(cont, BoxLayout.PAGE_AXIS));

		getContentPane().add(lblNewLabel);
		userField.setToolTipText("user");
		cont.add(userField);
		getContentPane().add(lblEnterThePassword);
		cont.add(passwordField);
		cont.add(loginButton);

		pack();
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] {
				getContentPane(), passwordField, userField, loginButton }));
		setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		loginButton.isSelected();
		System.out.println("User: " + userField.getText());
		System.out.println("Password: " + passwordField.getText());
	}

	public static void main(String[] args) {
		LoginPanel log = new LoginPanel();
		log.setVisible(true);

	}

}
