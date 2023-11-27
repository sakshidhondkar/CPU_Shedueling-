import java.util.Scanner;
import static java.lang.System.exit;


public class FCFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrival= new int[10];
		int[] burst = new int[10];
		int[] start= new int[10];
		int[] finish= new int[10];
		int[] turnaround= new int[10];
		int[] waiting = new int[10];
		
		int n;
		double avgtt=0, avgwt=0;
		
		//------------------------------------------------
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of process:");
		n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter arrival Time:");
			arrival[i]= sc.nextInt();
			
			System.out.println("Enter Burst Time:");
			burst[i]= sc.nextInt();
		}
		
		System.out.println("arrival Time\tBurst Time");
		for(int i=0;i<n;i++)
		{
			
			
			
			System.out.println(arrival[i]+"\t"+burst[i]);
			
		}
		start[0]=0;
		finish[0]= start[0]+burst[0];
		for(int i=1;i<n;i++)
		{
			start[i]=finish[i-1];
			finish[i]= start[i]+burst[i];
			
		}
		for(int i=0;i<n;i++)
		{
			turnaround[i]=finish[i]-arrival[i];
			waiting[i]=turnaround[i]-burst[i];
			avgtt=avgtt+turnaround[i];
			avgwt=avgwt+waiting[i];
		}
		
		System.out.println("Process\tBT\tAT\tFT\tTT\tWT");
		for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+"\t"+burst[i]+"\t"+arrival[i]+"\t"+finish[i]+"\t"+turnaround[i]+"\t"+waiting[i]);
		}
		System.out.println("\nAverage turnarround is :"+avgtt/n);
		System.out.println("\nAverage waiting is :"+avgwt/n);
		
		

	}

}
