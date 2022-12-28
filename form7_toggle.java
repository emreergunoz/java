package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form7_toggle extends JFrame {

	private JPanel contentPane;
	boolean durum = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form7_toggle frame = new form7_toggle();
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
	public form7_toggle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setSelected(true);
		tglbtnNewToggleButton.setBounds(44, 37, 115, 21);
		contentPane.add(tglbtnNewToggleButton);
		
		JButton btnNewButton = new JButton("A\u00C7IK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(durum==false) {
					btnNewButton.setBackground(Color.GREEN);
					btnNewButton.setText("AÇIK");
					durum=true;
				}else {
					btnNewButton.setBackground(Color.RED);
					btnNewButton.setText("KAPALI");
					durum=false;
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(103, 101, 195, 84);
		contentPane.add(btnNewButton);
		
		
	}
}
