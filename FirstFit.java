
public class FirstFit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blockSize[] = {20,100,40,200,10};
		int processSize[]= {90,50,30,40};
		
		int m=blockSize.length;
		int n=processSize.length;
		
		int allocation[]=new int[n];
		
		for(int i=0;i<allocation.length;i++)
			allocation[i]=-1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(blockSize[j]>=processSize[i])
				{
					allocation[i]=j;
					blockSize[j]=blockSize[j]-processSize[i];
					break;
				}
			}
		}
		
		System.out.println("processNo\tprocesSize\tAllocatedBlock");
		for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+"\t\t"+processSize[i]+"\t\t"+ (allocation[i]+1));
		}

	}

}
