package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class form4_comboRenk extends JFrame {

	private JPanel contentPane;
	DefaultComboBoxModel redModel = new DefaultComboBoxModel<>();
	DefaultComboBoxModel greenModel = new DefaultComboBoxModel<>();
	DefaultComboBoxModel blueModel = new DefaultComboBoxModel<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form4_comboRenk frame = new form4_comboRenk();
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
	public form4_comboRenk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i=0;i<256;i++) redModel.addElement(i);
		for(int i=0;i<256;i++) greenModel.addElement(i);
		for(int i=0;i<256;i++) blueModel.addElement(i);
		
		JComboBox redCombo = new JComboBox();
		
		redCombo.setBackground(Color.RED);
		redCombo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		redCombo.setBounds(26, 31, 131, 44);
		redCombo.setModel(redModel);
		contentPane.add(redCombo);
		
		
		JComboBox greenCombo = new JComboBox();
		greenCombo.setBackground(Color.GREEN);
		greenCombo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		greenCombo.setBounds(189, 31, 131, 44);
		greenCombo.setModel(greenModel);
		contentPane.add(greenCombo);
		
		JComboBox blueCombo = new JComboBox();
		blueCombo.setBackground(Color.BLUE);
		blueCombo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		blueCombo.setBounds(348, 31, 131, 44);
		blueCombo.setModel(blueModel);
		contentPane.add(blueCombo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 107, 443, 188);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		redCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int red = redCombo.getSelectedIndex();
				int green = greenCombo.getSelectedIndex();
				int blue = blueCombo.getSelectedIndex();
				String s = Integer.toString(red)+" - "+ Integer.toString(green)+" - " + Integer.toString(blue);
				Color color = new Color(red,green,blue);
				lblNewLabel.setBackground(color);
				lblNewLabel.setText(s);
			}
		});
		
		greenCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int red = redCombo.getSelectedIndex();
				int green = greenCombo.getSelectedIndex();
				int blue = blueCombo.getSelectedIndex();
				String s = Integer.toString(red)+" - "+ Integer.toString(green)+" - " + Integer.toString(blue);
				Color color = new Color(red,green,blue);
				lblNewLabel.setBackground(color);
				lblNewLabel.setText(s);
			}
		});
		
		blueCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int red = redCombo.getSelectedIndex();
				int green = greenCombo.getSelectedIndex();
				int blue = blueCombo.getSelectedIndex();
				String s = Integer.toString(red)+" - "+ Integer.toString(green)+" - " + Integer.toString(blue);
				Color color = new Color(red,green,blue);
				lblNewLabel.setBackground(color);
				lblNewLabel.setText(s);
			}
		});
		
		
	}
}
