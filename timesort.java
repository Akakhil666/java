package see_p;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Random;
import javax.swing.*;

class ts extends JFrame implements ActionListener{
	JLabel l1;
	JButton b;
	JComboBox<String> cb;
	JTextArea jt;
	
	
	ts(){
		setBounds(200,200,500,500);
		setResizable(false);
		setLayout(new FlowLayout());
		
		l1=new JLabel("enter the data type");
		
		String [] s= {"int","double","long"};
		cb=new JComboBox<>(s);
		
		b=new JButton("procees");
		
		jt=new JTextArea(50,50);
		b.addActionListener(this);
		add(l1);
		add(cb);
		add(b);
		add(jt);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random r=new Random();
		if(e.getSource()==b) {
			if(cb.getSelectedItem()=="int") {
				int []a=new int[100000];
				
				for(int i=0;i<100000;i++) {
					a[i]=r.nextInt(100000-0)+0;
				}
				long t1=System.nanoTime();
				Arrays.sort(a);
				long t2=System.nanoTime();
				long t=t2-t1;
				jt.append("the time to sort arrays is "+t+"\n");
			}
			
			if(cb.getSelectedItem()=="double") {
                  double []a=new double[100000];
				
				for(int i=0;i<100000;i++) {
					a[i]=r.nextDouble(100000-0)+0;
				}
				long t1=System.nanoTime();
				Arrays.sort(a);
				long t2=System.nanoTime();
				long t=t2-t1;
				jt.append("the time to sort arrays is "+t+"\n");
				
			}
			
			if(cb.getSelectedItem()=="long") {
				long []a=new long[100000];
				
				for(int i=0;i<100000;i++) {
					a[i]=r.nextLong(100000-0)+0;
				}
				long t1=System.nanoTime();
				Arrays.sort(a);
				long t2=System.nanoTime();
				
				long t=t2-t1;
				jt.append("time taken to sort long is"+t);
			}
		}
		
	}
}
public class timesort {

	public static void main(String[] args) {
		new ts();

	}

}
