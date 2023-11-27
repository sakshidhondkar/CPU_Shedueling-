//import java.util.*;
import java.util.Scanner;
public class FIFO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int search,index=0,hit=0,fault=0;
		System.out.println("Enter Number of Frames:");
		int nframe= sc.nextInt();
		
		System.out.println("Enter Number of reference string:");
		int len=sc.nextInt();
		
		int[] str=new int[len];
		int[] fifoframe=new int[nframe];
		int[][] table = new int[len][nframe];
		
		System.out.println("Enter reference string:");
		for(int i=0;i<len;i++)
		{
			str[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<nframe;i++)
		{
			fifoframe[i]=-1;
		}
		
		for(int i=0;i<len;i++)
		{
			search =-1;
			for(int j=0;j<nframe;j++)
			{
				if(fifoframe[j]==str[i])
				{
					search=j;
					hit++;
					break;
				}
			}
			
			if(search==-1)
			{
				fifoframe[index] = str[i];
				fault++;
				index++;
				
				if(index==nframe)
					index=0;
				
			}
			
		}
		
		System.out.println("---------------------------------------------------");
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<nframe;j++)
			{
				System.out.print("\t"+table[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
		
		System.out.println("Total Hit :"+hit);
		System.out.println("Total Fault :"+fault);
		System.out.println("Hit Ratio :"+((float)hit/len));
		System.out.println("Fault Ratio :"+((float)fault/len));
		

	}

}
