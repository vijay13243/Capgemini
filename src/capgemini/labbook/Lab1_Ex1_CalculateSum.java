package capgemini.labbook;

public class Lab1_Ex1_CalculateSum {
	public static int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int result=calculateSum(5);
		System.out.println(result);
	}

}
