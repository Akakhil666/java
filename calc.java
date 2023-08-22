package see_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calcdemo extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JButton b;
	JCheckBox b1,b2,b3,b4;
	JTextField t1,t2;
	JPanel p1,p2,p3,p4,p5,p6,p7;
	Calcdemo(){
		setBounds(200,200,500,500);
		setLayout(new GridLayout(7,1));
		setResizable(false);
	
		l1=new JLabel("calculator");
		l2=new JLabel("enter num 1");
		l3=new JLabel("enter num 2");
		l4=new JLabel("add");
		l5=new JLabel("sub");
		l6=new JLabel("mul");
		l7=new JLabel("div");
		l8=new JLabel("");
		l9=new JLabel("");
		l10=new JLabel("");
		l11=new JLabel("");
		
		b=new JButton("calculate");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
	
		b1=new JCheckBox();
		b2=new JCheckBox();
		b3=new JCheckBox();
		b4=new JCheckBox();
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	
		p1.add(l1);

		p2.add(l2);
		p2.add(t1);
		p2.add(l3);
		p2.add(t2);
		
		p3.add(l4);
		p3.add(b1);
		p3.add(l8);
		
		p4.add(l5);
		p4.add(b2);
		p4.add(l9);
		
		p5.add(l6);
		p5.add(b3);
		p5.add(l10);
		
		p6.add(l7);
		p6.add(b4);
		p6.add(l11);
		
		p7.add(b);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		
			
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			l8.setText("");
			l9.setText("");
			l10.setText("");
			l11.setText("");
			if(b1.isSelected()) {
				double a=Integer.parseInt(t1.getText());
				double b=Integer.parseInt(t2.getText());
				double res=a+b;
				l8.setText("res  "+res);
			}
			if(b2.isSelected()) {
				double a=Integer.parseInt(t1.getText());
				double b=Integer.parseInt(t2.getText());
				double res=a-b;
				l9.setText("res  "+res);
			}
			if(b3.isSelected()) {
				double a=Integer.parseInt(t1.getText());
				double b=Integer.parseInt(t2.getText());
				double res=a*b;
				l10.setText("res  "+res);
			}
			if(b4.isSelected()) {
				double a=Integer.parseInt(t1.getText());
				double b=Integer.parseInt(t2.getText());
				double res=a/b;
				l11.setText("res  "+res);
			}
		}
	}
}


public class calc {

	public static void main(String[] args) {
		new Calcdemo();

	}

}
