package see_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class tw extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
	
	tw(){
		setBounds(200,200,500,500);
		setResizable(false);
		setLayout(new GridLayout(9,1));
		
		l1=new JLabel("enter the marks");
		l2=new JLabel("IA-1");
		l3=new JLabel("IA-2");
		l4=new JLabel("IA-3");
		l5=new JLabel("CTA");
		l6=new JLabel("SEE");
		l7=new JLabel("");
		
		
		
		b1=new JButton("check see marks");
		b2=new JButton("calculate");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		p8=new JPanel();
		p9=new JPanel();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.add(l1);

		p2.add(l2);
		p2.add(t1);
		p3.add(l3);
		p3.add(t2);
		p4.add(l4);
		p4.add(t3);
		p5.add(l5);
		p5.add(t4);
		
		p6.add(b1);
		
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		 add(p6);
		 add(p7);
		 add(p8);
		 add(p9);
		 
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			int ia1=Integer.parseInt(t1.getText());
			int ia2=Integer.parseInt(t2.getText());
			int ia3=Integer.parseInt(t3.getText());
			int cta=Integer.parseInt(t4.getText());
			int cie = 0;
			
			if(ia1<0 || ia1>20 ||ia2<0 || ia2>20 ||ia3<0 || ia3>20 ||cta<0 || cta>20 ) {
				JOptionPane.showMessageDialog(this, "invalid marks");
			}
			if(ia1<=ia2 && ia1<=ia3) {
				cie=ia2+ia3;
			}
			if(ia2<=ia1 && ia2<=ia3) {
				cie=ia1+ia3;
			}
			if(ia3<=ia1 && ia3<=ia2) {
				cie=ia2+ia1;
			}
			
			cie=cie+cta;
			
			if(cie>20) {
				p7.add(l6);
				p7.add(t5);
				p8.add(b2);
				setVisible(true);
			}else {
				JOptionPane.showMessageDialog(this, "student detained from see");
			}		
		}
		
		if(e.getSource()==b2) {
			l7.setText("");
			int see=Integer.parseInt(t5.getText());
			char ch;
			if(see<0 || see>100) {
				JOptionPane.showMessageDialog(this, "invalid marks");
			}
			if(see<100 && see>=90) {
				ch='S';
			}else if(see<90 && see>=80) {
				ch='A';
			}else if(see<80 && see>=70) {
				ch='B';
			}else if(see<70 && see>=60) {
				ch='C';
			}else if(see<60 && see>=50) {
				ch='D';
			}else if(see<50 && see>=40) {
				ch='E';
			}else {
				ch='F';
			}
			
			
			l7.setText("GRADE "+ch);
			p9.add(l7);
			add(p9);
			setVisible(true);
			
		}
		
	}
}

public class tw4 {

	public static void main(String[] args) {
		new tw();

	}

}
