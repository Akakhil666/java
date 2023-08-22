package see_p;
import java.util.*;
import java.io.*;

class filewrite{
	filewrite() throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enterthe  text");
		String str=sc.next();
		
		FileWriter fw=new FileWriter("alp.txt");
		fw.write(str);
		fw.close();		
	}
}

class fileread{
	 fileread() throws IOException {
		FileReader fr=new FileReader("alp.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw1=new FileWriter("vol1.txt");
		BufferedWriter bw1=new BufferedWriter(fw1);
		FileWriter fw2=new FileWriter("cons1.txt");
		BufferedWriter bw2=new BufferedWriter(fw2);
		
		char []ch=br.readLine().toCharArray();
		int i=0;
		while(i<ch.length) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				bw1.write(ch[i]);
			}
			else if(ch[i]>='0' && ch[i]<='9'){
				try {
					throw new Exception();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else if(ch[i]>'a' &&ch[i]<='z'){
			bw2.write(ch[i]);
			}
			else {
				
			}
			i++;
		}
		bw1.close();
		bw2.close();
	}
}
public class Alpha{
	public static void main(String[]args) throws IOException {
		new filewrite();
		new fileread();
	}
}