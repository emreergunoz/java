package ders;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Random;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.SpinnerNumberModel;

public class form12 extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	int satir, sutun;
	DefaultTableModel model1 = new DefaultTableModel();
	DefaultTableModel model2 = new DefaultTableModel();
	DefaultTableModel model3 = new DefaultTableModel();
	SpinnerNumberModel sm = new SpinnerNumberModel();
	Random r = new Random();
	private JTable table2;
	int k,b;
	private JTable table3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form12 frame = new form12();
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
	public form12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sat\u0131r");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 20, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblStun = new JLabel("S\u00FCtun");
		lblStun.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblStun.setBounds(114, 20, 45, 13);
		contentPane.add(lblStun);
		
		JSpinner strs = new JSpinner();
		
		strs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		strs.setBounds(10, 43, 59, 33);
		contentPane.add(strs);
		
		JSpinner stns = new JSpinner();
		
		stns.setFont(new Font("Tahoma", Font.PLAIN, 20));
		stns.setBounds(103, 43, 59, 33);
		contentPane.add(stns);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 98, 343, 220);
		contentPane.add(scrollPane);
		
		table1 = new JTable();
		
		scrollPane.setViewportView(table1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(402, 98, 343, 220);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setViewportView(table2);
		
		JSpinner mins = new JSpinner();
		
		mins.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mins.setBounds(220, 43, 59, 33);
		contentPane.add(mins);
		
		JSpinner maxs = new JSpinner();
		maxs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		maxs.setBounds(312, 43, 59, 33);
		contentPane.add(maxs);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblMin.setBounds(230, 23, 45, 13);
		contentPane.add(lblMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblMax.setBounds(324, 23, 45, 13);
		contentPane.add(lblMax);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(201, 367, 343, 220);
		contentPane.add(scrollPane_2);
		
		table3 = new JTable();
		scrollPane_2.setViewportView(table3);
		
		strs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				satir = (int) strs.getValue();
				sutun = (int) stns.getValue();
				k = (int) mins.getValue();
				b = (int) maxs.getValue();
				model1.setRowCount(satir);
				model1.setColumnCount(sutun);
				model2.setRowCount(satir);
				model2.setColumnCount(sutun);
				model3.setRowCount(satir);
				model3.setColumnCount(sutun);
				int s1,s2;
				
				int i,j;
				for(i=0;i<satir;i++) {
					for(j=0;j<sutun;j++) {
						model1.setValueAt(r.nextInt(b-k)+k, i, j);
						model2.setValueAt(r.nextInt(b-k)+k, i, j);
						s1 = (int) model1.getValueAt(i, j);
						s2 = (int) model2.getValueAt(i, j);
						model3.setValueAt(s1+s2, i, j);
					}
				}
				
				table1.setModel(model1);
				table2.setModel(model2);
				table3.setModel(model3);
			}
		});
		
		stns.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				satir = (int) strs.getValue();
				sutun = (int) stns.getValue();
				k = (int) mins.getValue();
				b = (int) maxs.getValue();
				model1.setRowCount(satir);
				model1.setColumnCount(sutun);
				model2.setRowCount(satir);
				model2.setColumnCount(sutun);
				model3.setRowCount(satir);
				model3.setColumnCount(sutun);
				int s1,s2;
				
				int i,j;
				for(i=0;i<satir;i++) {
					for(j=0;j<sutun;j++) {
						model1.setValueAt(r.nextInt(b-k)+k, i, j);
						model2.setValueAt(r.nextInt(b-k)+k, i, j);
						s1 = (int) model1.getValueAt(i, j);
						s2 = (int) model2.getValueAt(i, j);
						model3.setValueAt(s1+s2, i, j);
					}
				}
				
				table1.setModel(model1);
				table2.setModel(model2);
				table3.setModel(model3);
				
			}
		});
		
		mins.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int tabansayi;
				tabansayi = (int) mins.getValue();
				sm.setMinimum(tabansayi);
				maxs.setValue(tabansayi);
				maxs.setModel(sm);
				
			}
		});
		
	
	}

}
