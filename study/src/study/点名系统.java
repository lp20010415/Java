package study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class ����ϵͳ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JF();
		
	}
	
	

}
class JF extends JFrame{
	JLabel jl;
	JPanel jp1,jp2;
	JButton btn1,btn2;
	Timer tm;
	String []haha = {"����","����","����","����","����ͷ��","����","��������","����С����","��С��","����"};
	public JF() {
		jl = new JLabel("�ȴ���ʼ",JLabel.CENTER);
		jp1 = new JPanel();
		jp2 = new JPanel();
		btn1 = new JButton("��ʼ");
		btn2 = new JButton("��ͣ");

		jp1.add(jl);
		jp2.add(btn1);
		jp2.add(btn2);
		this.add(jp1,"North");
		this.add(jp2);
		this.setVisible(true);
		this.setSize(500, 100);
		
		
		
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tm = new Timer();
				tm.scheduleAtFixedRate(new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						int suiji = (int)(Math.random()*10);
						jl.setText(haha[suiji]);
						
					}
					
				}, 0, 100);
			}
			
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tm.cancel();
				}
		});
	}
	
}
