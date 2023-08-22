package see_p;
import java.util.*;

class set{
	Set<Integer> s1=new HashSet<>();
	Set<Integer> s2=new HashSet<>();
	Set<Integer> s3=new HashSet<>();

	set(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter  the ope ");
		System.out.println("1-to union\n 2--to interse\n3--power");
		int ch=sc.nextInt();
		
		if(ch==3) {
	
			System.out.println("enter the num of ele");
			int n=sc.nextInt();
		
			System.out.println("enter the ele of the  set");
			for(int i=0;i<n;i++) {
			s1.add(sc.nextInt());
		
			}
			pow();
		}else {
			System.out.println("enter the num of ele in first set");
			int n1=sc.nextInt();
			
			System.out.println("enter the ele of first set");
			for(int i=0;i<n1;i++) {
				s1.add(sc.nextInt());
			}
			
			System.out.println("enter the num of ele in second set");
			int n2=sc.nextInt();
			
			System.out.println("enter the ele of second set");
			for(int i=0;i<n2;i++) {
				s2.add(sc.nextInt());
			}
			if(ch==1) {
				uni();
			}else
			{
				inter();
			}
		}
		
	}
	
	void uni() {
		s1.addAll(s2);
		System.out.println(s1);
	}
	
	void inter(){
		s1.retainAll(s2);
		System.out.println(s1);
		
	}
	

	void pow() {
		
		Set<Set<Integer>> res=new HashSet<>();
		
		powerSet(s1,res);
		
		System.out.println(res);
	}
	
	void powerSet(Set<Integer> set,Set<Set<Integer>> res) {
		if(set.isEmpty()) {
			res.add(new HashSet<>());
			return;
		}
		
		int ele=set.iterator().next();
		set.remove(ele);
		powerSet(set,res);
		
		Set<Set<Integer>> allsubsets=new HashSet<>();
		for(Set<Integer> i:res) {
			Set<Integer> newsubset=new HashSet<>(i);
			newsubset.add(ele);
			allsubsets.add(newsubset);
		}
		res.addAll(allsubsets);
	}
}

public class sets_1{
	public static void main(String[]args) {
	new set();
	}
}