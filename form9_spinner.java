package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class form9_spinner extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form9_spinner frame = new form9_spinner();
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
	public form9_spinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner gs = new JSpinner();
		
		gs.setModel(new SpinnerNumberModel(50, 0, 100, 1));
		gs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gs.setBounds(23, 30, 74, 36);
		contentPane.add(gs);
		
		JLabel lblNewLabel = new JLabel("Geni\u015Flik");
		lblNewLabel.setBounds(23, 10, 74, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblYkseklik = new JLabel("Y\u00FCkseklik");
		lblYkseklik.setBounds(119, 10, 74, 13);
		contentPane.add(lblYkseklik);
		
		JSpinner ys = new JSpinner();
		
		ys.setModel(new SpinnerNumberModel(50, 0, 100, 1));
		ys.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ys.setBounds(119, 30, 74, 36);
		contentPane.add(ys);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(50, 150, 50, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(282, 10, 74, 13);
		contentPane.add(lblX);
		
		JSpinner xs = new JSpinner();
		
		xs.setModel(new SpinnerNumberModel(50, 0, 350, 5));
		xs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		xs.setBounds(282, 30, 74, 36);
		contentPane.add(xs);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(392, 10, 74, 13);
		contentPane.add(lblY);
		
		JSpinner yys = new JSpinner();
		
		yys.setModel(new SpinnerNumberModel(150, 0, 300, 5));
		yys.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yys.setBounds(392, 30, 74, 36);
		contentPane.add(yys);
		
		gs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				btnNewButton.setBounds((int) xs.getValue(), (int) yys.getValue(), (int) gs.getValue(), (int) ys.getValue());
			}
		});
		
		ys.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				btnNewButton.setBounds((int) xs.getValue(), (int) yys.getValue(), (int) gs.getValue(), (int) ys.getValue());
			}
		});
		
		xs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				btnNewButton.setBounds((int) xs.getValue(), (int) yys.getValue(), (int) gs.getValue(), (int) ys.getValue());
			}
		});
		
		yys.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				btnNewButton.setBounds((int) xs.getValue(), (int) yys.getValue(), (int) gs.getValue(), (int) ys.getValue());
			}
		});
		
		
	}
}
