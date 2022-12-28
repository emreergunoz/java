package timerform;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Timerformders extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int x,y; // elimizdeki butonun yerlerini tumak için deðiþken atadýk
	int hizx=4; int hizy=2; // belirli biþr hýz deðiþeni belirledi


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timerformders frame = new Timerformders();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Timerformders() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("X");
		btn.setForeground(Color.BLACK);
		btn.setBackground(Color.YELLOW);
		btn.setBounds(0, 0,50,50);
		contentPane.add(btn);
		
		Timer myTimer= new Timer();
		TimerTask gorev = new TimerTask() {
			
			@Override
			public void run() {
				x= (int)btn.getBounds().getX();// butonunun deðerini almak için get bounds, x özelliði için get x , int e çeviridk
				y= (int)btn.getBounds().getY();
				x+=hizx;y+=hizy;  // butonun hareketi için x'i ve y'i artýrýyoruz ancak belirlenen hýzda
				btn.setBounds(x,y,50,50);// bu sefer elimideki artan x i set bounds ile yeniden butona gönderiyoruz
				if(x>437||x<0) hizx*=-1;if(y>422||y<0) hizy*=-1; // kenara çarpma efekti ile birlike belirlene piksel e geldiðinde tersine gidecek
			}
		};myTimer.schedule(gorev, 0,10);
	}
}
