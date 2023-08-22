package see_p;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.io.*;

class top extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JPanel p1,p2,p3,p4,p5,p6,p7;
	
	top(){
		setBounds(200,200,500,500);
		setVisible(true);
		setResizable(false);
		setLayout(new GridLayout(7,1));
		
		l1=new JLabel("enter the criteria to select the tpper");
		l2=new JLabel("IA-1");
		l3=new JLabel("IA-2");
		l4=new JLabel("IA-3");
		l5=new JLabel("SUM OF 2-IA");
		l6=new JLabel("CTA");
		l7=new JLabel("CIE");
		
		b1=new JButton("click here");
		b2=new JButton("click here");
		b3=new JButton("click here");
		b4=new JButton("click here");
		b5=new JButton("click here");
		b6=new JButton("click here");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		
		p1.add(l1);
		
		p2.add(l2);
		p2.add(b1);

		p3.add(l3);
		p3.add(b2);
		
		p4.add(l4);
		p4.add(b3);
		
		p5.add(l5);
		p5.add(b4);
		
		p6.add(l6);
		p6.add(b5);

		p7.add(l7);
		p7.add(b6);
	
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
			
	}
	
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> ia1=new ArrayList<>();
		ArrayList<String> ia2=new ArrayList<>();
		ArrayList<String> ia3=new ArrayList<>();
		ArrayList<String> sum2=new ArrayList<>();
		ArrayList<String> cta=new ArrayList<>();
		ArrayList<String> cie=new ArrayList<>();
		ArrayList<String> name=new ArrayList<>();
		int high,j = 0;
		String line;
		
		
		try {
			FileReader fr = new FileReader("data.csv");
			BufferedReader br=new BufferedReader(fr);
			while((line=br.readLine())!=null) {
				String [] ele=line.split(",");
				ia1.add(ele[5]);
				ia2.add(ele[6]);
				ia3.add(ele[7]);
				sum2.add(ele[8]);
				cta.add(ele[9]);
				cie.add(ele[10]);
				name.add(ele[0]);
			
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		if(e.getSource()==b1) {
			  high=Integer.parseInt(ia1.get(0));
			  for(int i=0;i<ia1.size();i++) {
				  int cur=Integer.parseInt(ia1.get(i));
				  if(cur>high) {
					  high=cur;
					  j=i;
				  }
			  }
			  JOptionPane.showMessageDialog(this, "in IA-1 "+name.get(j)+"got highest marks");
		}
		
		if(e.getSource()==b2) {
			  high=Integer.parseInt(ia2.get(0));
			  for(int i=0;i<ia2.size();i++) {
				  int cur=Integer.parseInt(ia2.get(i));
				  if(cur>high) {
					  high=cur;
					  j=i;
				  }
			  }
			  JOptionPane.showMessageDialog(this, "in IA-2 "+name.get(j)+"got highest marks");
		}
		
		if(e.getSource()==b3) {
			  high=Integer.parseInt(ia3.get(0));
			  for(int i=0;i<ia3.size();i++) {
				  int cur=Integer.parseInt(ia3.get(i));
				  if(cur>high) {
					  high=cur;
					  j=i;
				  }
			  }
			  JOptionPane.showMessageDialog(this, "in IA-3 "+name.get(j)+"got highest marks");
		}
		
		if(e.getSource()==b4) {
		
			  double high1=Double.parseDouble(sum2.get(0));
			  for(int i=0;i<sum2.size();i++) {
				  double cur=Double.parseDouble(sum2.get(i));
				  if(cur>high1) {
					  high1=cur;
					  j=i;
				  }
			  }
			  JOptionPane.showMessageDialog(this, "in sum2 "+name.get(j)+"got highest marks");
		}
		
		if(e.getSource()==b5) {
			  high=Integer.parseInt(cta.get(0));
			  for(int i=0;i<cta.size();i++) {
				  int cur=Integer.parseInt(cta.get(i));
				  if(cur>high) {
					  high=cur;
					  j=i;
				  }
			  }
			  JOptionPane.showMessageDialog(this, "in cta "+name.get(j)+"got highest marks");
		}
		
		if(e.getSource()==b6) {
			  high=Integer.parseInt(cie.get(0));
			  for(int i=0;i<cie.size();i++) {
				  int cur=Integer.parseInt(cie.get(i));
				  if(cur>high) {
					  high=cur;
					  j=i;
				  }
			  }
			  JOptionPane.showMessageDialog(this, "in cie "+name.get(j)+"got highest marks");
		}
		
		}

	

	
	


}

public class Topper {

	public static void main(String[] args) {
		new top();

	}

}
