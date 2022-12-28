package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class form3_combobox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form3_combobox frame = new form3_combobox();
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
	public form3_combobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ankara", "\u0130stanbul", "\u0130zmir", "Bursa", "Konya", "Adana"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(48, 26, 146, 41);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("New button");

		btnNewButton.setBounds(48, 88, 146, 48);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(230, 30, 114, 34);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(371, 30, 123, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Integer.toString(comboBox.getSelectedIndex()));
				textField_1.setText(comboBox.getSelectedItem().toString());
				if(comboBox.getSelectedIndex()==3) System.out.println("Bursayý seçtiniz!");
				if(comboBox.getSelectedItem().toString().equals("Konya")) System.out.println("Konyayý seçtiniz!");
			}
		});

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setText(Integer.toString(comboBox.getSelectedIndex()));
				textField_1.setText(comboBox.getSelectedItem().toString());
				if(comboBox.getSelectedIndex()==3) System.out.println("Bursayý seçtiniz!");
				if(comboBox.getSelectedItem().toString().equals("Konya")) System.out.println("Konyayý seçtiniz!");
			}
		});

	}
}
