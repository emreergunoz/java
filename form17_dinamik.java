package ders;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class form17 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int sayi=0;
	JTextField[] textalan;
	JLabel[] lbl;
	boolean durum = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form17 frame = new form17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ka\u00E7 adet programlama dili biliyorsunuz?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 30, 364, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(385, 30, 78, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("G\u00F6nder");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(474, 30, 115, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Temizle");
		btnNewButton_1.setEnabled(false);
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(604, 30, 103, 27);
		contentPane.add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Integer.parseInt(textField.getText());
				textalan = new JTextField[sayi];
				lbl = new JLabel[sayi];
				
				for(int i=0;i<sayi;i++) {
					textalan[i] = new JTextField();
					textalan[i].setBounds(120, ((i*40)+80), 120, 25);
					contentPane.add(textalan[i]);
					
					lbl[i] = new JLabel(Integer.toString(i+1)+". programlama dili");
					lbl[i].setBounds(10,((i*40)+80),160,25);
					contentPane.add(lbl[i]);
					
					contentPane.repaint(); //bu method formun yeniden bas�lmas�n� sa�lar
					
					}
				if(durum==false) {
					durum=true;
					btnNewButton_1.setEnabled(true);
					btnNewButton.setEnabled(false);
				}
			}
		});
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<sayi;i++) {
					contentPane.remove(textalan[i]);
					contentPane.remove(lbl[i]);
					contentPane.revalidate();
					contentPane.repaint();
				}
				if(durum) {
					durum=false;
					btnNewButton_1.setEnabled(false);
					btnNewButton.setEnabled(true);
				}
			}
		});
	}

}
