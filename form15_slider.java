package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class form15_slider extends JFrame {

	private JPanel contentPane;
	int r,g,b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form15_slider frame = new form15_slider();
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
	public form15_slider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider rs = new JSlider();
		
		rs.setBackground(Color.RED);
		rs.setMinorTickSpacing(5);
		rs.setMajorTickSpacing(25);
		rs.setMaximum(255);
		rs.setValue(0);
		rs.setPaintTicks(true);
		rs.setPaintLabels(true);
		rs.setBounds(27, 10, 514, 46);
		contentPane.add(rs);
		
		JSlider gs = new JSlider();
		gs.setValue(0);
		gs.setPaintTicks(true);
		gs.setPaintLabels(true);
		gs.setMinorTickSpacing(5);
		gs.setMaximum(255);
		gs.setMajorTickSpacing(25);
		gs.setBackground(Color.GREEN);
		gs.setBounds(27, 77, 514, 46);
		contentPane.add(gs);
		
		JSlider bs = new JSlider();
		bs.setValue(0);
		bs.setPaintTicks(true);
		bs.setPaintLabels(true);
		bs.setMinorTickSpacing(5);
		bs.setMaximum(255);
		bs.setMajorTickSpacing(25);
		bs.setBackground(Color.BLUE);
		bs.setBounds(27, 145, 514, 46);
		contentPane.add(bs);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(27, 234, 514, 91);
		contentPane.add(btnNewButton);
		
		
		rs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = rs.getValue();
				g = gs.getValue();
				b = bs.getValue();
				btnNewButton.setBackground(new Color(r,g,b));
				rs.setBackground(new Color(r,0,0));
				if (r<125) rs.setForeground(Color.WHITE);
				else rs.setForeground(Color.BLACK);
				String s = Integer.toString(r) + " - " + Integer.toString(g) + " - " + Integer.toString(b);
				btnNewButton.setText(s);
			}
		});
		
		gs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = rs.getValue();
				g = gs.getValue();
				b = bs.getValue();
				btnNewButton.setBackground(new Color(r,g,b));
				gs.setBackground(new Color(0,g,0));
				if (g<125) gs.setForeground(Color.WHITE);
				else gs.setForeground(Color.BLACK);
				String s = Integer.toString(r) + " - " + Integer.toString(g) + " - " + Integer.toString(b);
				btnNewButton.setText(s);
			}
		});
		
		bs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = rs.getValue();
				g = gs.getValue();
				b = bs.getValue();
				btnNewButton.setBackground(new Color(r,g,b));
				bs.setBackground(new Color(0,0,b));
				if (b<125) bs.setForeground(Color.WHITE);
				else bs.setForeground(Color.BLACK);
				String s = Integer.toString(r) + " - " + Integer.toString(g) + " - " + Integer.toString(b);
				btnNewButton.setText(s);
			}
		});
		
	}
}
