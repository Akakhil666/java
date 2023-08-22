package see_p;

import java.util.*;

class demo{
	
	int []c=new int [10];
	char[]g=new char[10];
	int sum=0,totcre=0;
	int []gp=new int[10];
	demo(){
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<8;i++) {
		    int j=i+1;
			System.out.println("enter the credit of subject "+j);
			 c[i]=sc.nextInt();
			
			System.out.println("enter the grade subject "+j);
			
			g[i]=sc.next().charAt(0);
			if(g[i]=='s') {
				gp[i]=10;
			}else if(g[i]=='a') {
				gp[i]=9;
			}else if(g[i]=='b') {
				gp[i]=8;
			}else if(g[i]=='c'){
				gp[i]=7;
			}else if(g[i]=='d'){
				gp[i]=6;
			}else if(g[i]=='e'){
				gp[i]=4;
			}else {
				gp[i]=1;
			}
			
			
			sum=sum+c[i]*gp[i];
			
			totcre=totcre+c[i];
		}
		
		double sgpa=sum/totcre;
		
		System.out.println(sgpa);
	}
}

public class grade{
	public static void main(String[] args) {
		new demo();
	}
}