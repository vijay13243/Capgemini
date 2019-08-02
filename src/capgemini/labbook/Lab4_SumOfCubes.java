package capgemini.labbook;
public class Lab4_SumOfCubes {
	public static int SumOfCubes(int m){
		int sum=0;
		while(m>0){
			int k=m%10;
			sum=(sum+(k*k*k));
			m=m/10;
		}
			
		return sum;
	}
	public static void main(String[] args) {
		int z=123;
		int result=SumOfCubes(z);
		System.out.println("RESULT:" +result);
	}
}
