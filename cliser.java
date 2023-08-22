package see_p;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class cliser {
	public static final Semaphore s=new Semaphore(2);
	public static final messageholder m=new messageholder();
	
	public static void main(String[] args) throws InterruptedException {
		Thread client=new Thread(new client());
		Thread server=new Thread(new server());
		System.out.println(5);
		while(true) {
			client.start();
			Thread.sleep(5000);
			server.start();
			Thread.sleep(5000);
			
		}
	}
	
	static class client implements Runnable{

		@Override
		public void run() {
			try {
				s.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("client can enter the message");
			String mes=sc.next();
			m.setmessage(mes);
			System.out.println("waiting for acknowledgemet");
			System.out.println("acknoledge reicived");
			s.release();
			
		}		
	}
	
	static class server implements Runnable{

		@Override
		public void run() {
			try {
				s.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("---------------------");
			System.out.println("the message is recived"+m.getmessage());
			s.release();
		}
		
	}
	
	static class messageholder{
		String mes;
		
		void setmessage(String mes) {
			this.mes=mes;
		}
		
		String getmessage(){
			return mes;
			
		}
	}

}
