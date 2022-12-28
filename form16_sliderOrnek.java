package gorselNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class form16_sliderOrnek extends JFrame {

	private JPanel contentPane;
	int v,f;
	float o;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form16_sliderOrnek frame = new form16_sliderOrnek();
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
	public form16_sliderOrnek() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider vs = new JSlider();
		
		vs.setMinorTickSpacing(5);
		vs.setMajorTickSpacing(10);
		vs.setPaintLabels(true);
		vs.setPaintTicks(true);
		vs.setBounds(25, 44, 584, 84);
		contentPane.add(vs);
		
		JSlider fs = new JSlider();
		fs.setPaintTicks(true);
		fs.setPaintLabels(true);
		fs.setMinorTickSpacing(5);
		fs.setMajorTickSpacing(10);
		fs.setBounds(25, 163, 584, 84);
		contentPane.add(fs);
		
		JSlider os = new JSlider();
		os.setBackground(Color.GREEN);
		os.setPaintTicks(true);
		os.setPaintLabels(true);
		os.setMinorTickSpacing(5);
		os.setMajorTickSpacing(10);
		os.setBounds(25, 312, 584, 84);
		contentPane.add(os);
		
		JLabel vl = new JLabel("Vize");
		vl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vl.setBounds(25, 20, 117, 25);
		contentPane.add(vl);
		
		JLabel fl = new JLabel("Final");
		fl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fl.setBounds(25, 138, 107, 25);
		contentPane.add(fl);
		
		JLabel ol = new JLabel("Ortalama");
		ol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ol.setBounds(25, 266, 229, 25);
		contentPane.add(ol);
		
		vs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v = vs.getValue();
				f = fs.getValue();
				o = (float) (v*0.4 + f*0.6);
				os.setValue(Math.round(o));
				if(o>=60) os.setBackground(Color.GREEN);
				else os.setBackground(Color.RED);
				vl.setText("Vize = " + Integer.toString(v));
				ol.setText("Ortalama = " + Float.toString(o));
			}
		});
		
		fs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v = vs.getValue();
				f = fs.getValue();
				o = (float) (v*0.4 + f*0.6);
				os.setValue(Math.round(o));
				if(o>=60) os.setBackground(Color.GREEN);
				else os.setBackground(Color.RED);
				fl.setText("Final = " + Integer.toString(f));
				ol.setText("Ortalama = " + Float.toString(o));
			}
		});
		
	}

}
