package capgemini.labbook;

public class Lab1_Ex2_CalculateDifference {
	public static int CalculateDifference(int n){
		int sum=0,sums=0,result=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(int)Math.pow(i,2);
			sums= (int)Math.pow(((n*(n+1))/2),2);
		}
		result=sums-sum;
		return result;
		
	}
	public static void main(String[] args) {
		int res=CalculateDifference(10);
		System.out.println(res);
	}
		
}
