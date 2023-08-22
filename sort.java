package see_p;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

class T1 extends Thread{
	T1(String n1) throws IOException{
		int n=Integer.parseInt(n1);
		int []arr=new int[100000];
		Scanner sc=new Scanner(new File("int.txt"));
		
	
		for(int i=0;i<n*(100000/3);i++) {
			sc.nextInt();
		}
		
		for(int i=0;i<(100000/3);i++) {
			System.out.println(n);
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<(100000/3)-1;i++) {
			for(int j=0;j<(100000/3)-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		if(n==0) {		
			FileWriter fw=new FileWriter("first1.txt");
		for(int i=0;i<(100000/3);i++) {
			fw.write(Integer.toString(arr[i])+" ");
		}
		fw.close();
		}
		if(n==1) {		
			FileWriter fw=new FileWriter("sec1.txt");
			for(int i=0;i<(100000/3);i++) {
				fw.write(Integer.toString(arr[i])+" ");
			}
			fw.close();
		}
		if(n==2) {		
			FileWriter fw=new FileWriter("thi1.txt");
			for(int i=0;i<(100000/3);i++) {
				fw.write(Integer.toString(arr[i])+" ");
			}
			fw.close();			
		}
		
		merge(new File("first1.txt"),new File("sec1.txt"),new File("out.txt"));
		merge(new File("out.txt"),new File("thi1.txt"),new File("final.txt"));
			
	}
	
	void merge(File f1,File f2,File f3) throws IOException {
		Scanner sc1=new Scanner(f1);
		Scanner sc2=new Scanner(f2);

		FileWriter fw=new FileWriter(f3);
		int i,j;
		int []a=new int[100000];
		int []b=new int[100000];
		
		for(i=0;sc1.hasNextInt();i++) {
			a[i]=sc1.nextInt();
		}
		
		for(j=0;sc2.hasNextInt();j++) {
			b[j]=sc2.nextInt();
		}
		
		int l=0,r=0;
		
		while(l<=i && r<=j) {
			if(a[l]<b[r]) {
				fw.write(Integer.toString(a[l])+" ");
				l++;
			}
			else {
				fw.write(Integer.toString(b[r])+" ");
			    r++;
			}			
		}
		while(l<=i) {
			fw.write(Integer.toString(a[l])+" ");
			l++;
		}
		while(r<=j) {
			fw.write(Integer.toString(b[r])+" ");
			r++;
		}
		fw.close();
		
	}
}
public class sort {

	public static void main(String[] args) throws IOException, InterruptedException {
		 Random r=new Random();
		 
		 FileWriter fw=new FileWriter("int.txt");
		 for(int i=0;i<100000;i++) {
			 fw.write(Integer.toString(r.nextInt(100000-0)+0));
			 fw.write(" ");
		 }
		 fw.close();
		 
		 T1 t1=new T1("0");
		 T1 t2=new T1("1");
		 T1 t3=new T1("2");
	     t1.start();
	     t1.join();
	     t2.start();
	     t2.join();
	     t3.start();
	     t3.join();

	}

}
