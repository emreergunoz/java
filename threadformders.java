package timerform;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.RadialGradientPaint;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class threadformders extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	Random rasgele = new Random ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					threadformders frame = new threadformders();
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
	public threadformders() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 175, 338, 179);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		textField = new JTextField();
		textField.setBounds(363, 173, 240, 181);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 49, 118, 51);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(350, 49, 124, 51);
		contentPane.add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Thread t = new Thread() {
					public void run() {
						int sayac=0;
						for (int i=0;i<1000;i++) {
							textArea.setText(textArea.getText()+"A"+sayac+"-");
							sayac++;
						
						}
					}
					
				};
				Thread t2 = new Thread() {
					public void run() {
						int r,g,b;
						r=0;
						g=0;
						b=0;
						for(int k=0;k<1000;k++) {
							r= rasgele.nextInt(255);
							g= rasgele.nextInt(255);
							b= rasgele.nextInt(255);
							btnNewButton_1.setBackground(new Color(r,g,b));
							try {
								TimeUnit.MILLISECONDS.sleep(300);
							} catch (InterruptedException e2) {
								e2.printStackTrace();
							}
							
						}
						
					}
				};
				
				t.start();
				t2.start();
			}
		});
}}
