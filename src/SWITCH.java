//Author: Vijay
// Date: 24-july-2019
// purpose:  SWITCH STATEMENT
class SWITCH{
	public static void main(String args[]){
		int i=14;
		String season;
		switch(i) {
			case 12:
			case 1:
			case 2:
				season= "WINTER";
				break;
			case 3:
			case 4:
			case 5:
				season= "SPRING";
				break;
			case 6:
			case 7:
			case 8:
				season ="SUMMER";
				break;
			case 9:
			case 10:
			case 11:
				season= "AUTUMN";
				break;
			default:
				season= "BOGUS MONTH";
				break;
		}
		System.out.println("SEASON :" +season);
	}
}