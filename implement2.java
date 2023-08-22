package see_p;
import java.util.*;
import java.io.*;
class imp{
	imp() throws IOException{
		ArrayList<String> ia1=new ArrayList<>();
		ArrayList<String> name=new ArrayList<>();
		String temp;
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the criteria to find topper");
		System.out.println("1--in a range\n2--toppers\n3--least");
		int n=sc.nextInt();
		
		FileReader fr=new FileReader("data.csv");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) {
			String [] ele=line.split(",");
			ia1.add(ele[5]);
			name.add(ele[0]);
		}
		
		for(int i=0;i<ia1.size()-1;i++) {
			for(int j=0;j<(ia1.size()-i-1);j++) {
				int a=Integer.parseInt(ia1.get(j));
				int b=Integer.parseInt(ia1.get(j+1));
				if(a>b) {
					temp=ia1.get(j);
					ia1.set(j,ia1.get(j+1));
					ia1.set(j+1, temp);
					
					temp=name.get(j);
					name.set(j,name.get(j+1));
					name.set(j+1, temp);
				}
			}
		}
		
		for(int i=0;i<ia1.size();i++) {
		System.out.println(ia1.get(i)+" "+name.get(i));
		}
		
	}
}
public class implement2 {

	public static void main(String[] args) throws IOException {
		new imp();


	}

}
