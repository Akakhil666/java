package see_p;
import java.io.*;
import java.util.*;

class primedemo{
	primedemo() throws IOException{
		Random r=new Random();
		
		FileWriter fw=new FileWriter("pri.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int i=0;i<100000;i++) {
			bw.write(Integer.toString(r.nextInt(100000-0)+0));
			bw.newLine();
		}
		bw.close();
		
		Scanner sc=new Scanner(new File("pri.txt"));
		
		FileWriter fw2=new FileWriter("pri1.txt");
		BufferedWriter bw2=new BufferedWriter(fw2);
		int flag=0,count=0;
		while(sc.hasNextLine()) {
			int n=Integer.parseInt(sc.nextLine());
			flag=0;
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					flag=1;
					count++;
					break;
				}
			}
		
		
			if(flag==0) {
				bw2.write(Integer.toString(n)+" true\n");
			}else
			{
				bw2.write(Integer.toString(n)+" false\n");
				
			}
			}
		bw2.close();
		System.out.println("the num of prime num are "+count);
		
		
		
	}
}
public class prime {

	public static void main(String[] args) throws IOException {
		 new primedemo();

	}

}
