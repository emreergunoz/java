package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class form5_checkbox_radiobutton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form5_checkbox_radiobutton frame = new form5_checkbox_radiobutton();
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
	public form5_checkbox_radiobutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox c1 = new JCheckBox("Java");
		
		c1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		c1.setBounds(43, 36, 80, 21);
		contentPane.add(c1);
		
		JCheckBox c2 = new JCheckBox("Python");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		c2.setBounds(141, 36, 132, 21);
		contentPane.add(c2);
		
		JCheckBox c3 = new JCheckBox("C++");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		c3.setBounds(275, 36, 112, 21);
		contentPane.add(c3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c1.isSelected()) System.out.println(c1.getText());
				if(c2.isSelected()) System.out.println(c2.getText());
				if(c3.isSelected()) System.out.println(c3.getText());
			}
		});
		btnNewButton.setBounds(141, 74, 136, 42);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ya\u015F\u0131n\u0131z", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(43, 144, 380, 174);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("18-24");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(20, 29, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("25-30");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(125, 33, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("30-36");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(229, 33, 103, 21);
		panel.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		
		btnNewButton_1.setBounds(112, 91, 133, 45);
		panel.add(btnNewButton_1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(c1.isSelected()) System.out.println(c1.getText());
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) System.out.println(rdbtnNewRadioButton.getText());
				if(rdbtnNewRadioButton_1.isSelected()) System.out.println(rdbtnNewRadioButton_1.getText());
				if(rdbtnNewRadioButton_2.isSelected()) System.out.println(rdbtnNewRadioButton_2.getText());
			}
		});
	}
}
