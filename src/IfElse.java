//Author: Vijay
// Date: 24-july-2019
// purpose:  IF else

class IfElse{
	public static void main(String args[]){
		int month=4; //April
		String season;
		if(month==12 || month==1 || month==2)
			season="WINTER";
		else if(month==3 || month==4 || month==5)
			season="SPRING";
		else if(month==6 || month==7 || month==8)
			season="SUMMER";
		else if(month==9 || month==10 || month==11)
			season="AUTUMN";
		else
			season= "BOGUS MONTH";
		System.out.println("April is in the " +season+ ".");
	}
}

