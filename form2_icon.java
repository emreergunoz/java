package ders;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class ders2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders2 frame = new ders2();
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
	public ders2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u00C7ALI\u015ETIR");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Image img = new ImageIcon(this.getClass().getResource("/icon2.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton.setBounds(79, 21, 186, 72);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(324, 10, 260, 113);
	    lblNewLabel.setOpaque(true);
		Image imgmavi = new ImageIcon(this.getClass().getResource("/btnmavi.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(imgmavi));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(199, 166, 217, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(255, 310, 241, 38);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(216, 251, 186, 46);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Image imgmor = new ImageIcon(this.getClass().getResource("/btnmor.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(imgmor));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image imgmavi = new ImageIcon(this.getClass().getResource("/btnmavi.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(imgmavi));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Image imgyesil = new ImageIcon(this.getClass().getResource("/btnyesil.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(imgyesil));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Image imgmavi = new ImageIcon(this.getClass().getResource("/btnmavi.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(imgmavi));
			}
		});
		
		
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				String s = textField.getText();
				int puan = Integer.parseInt(s);
				if(puan>=0 && puan<=100) btnNewButton_1.setEnabled(true);
				else btnNewButton_1.setEnabled(false);
				
				lblNewLabel_1.setText(s);
			}
		});
		
	
	}

}
