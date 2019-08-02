package capgemini.generics;

public class PreGenerics {
	private Object t;
	
	public Object getT() {
		return t;
	}

	public void setT(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {
		PreGenerics type1=new PreGenerics();	//newType
		type1.setT("PANKAJ");	//valid
		type1.setT(10);		//valid and auto boxing support
		
		PreGenerics type2=new PreGenerics();
		type2.setT("PANKAJ");	//valid
		String str=(String)type2.getT();	//type casting not needed, NO class castException
		System.out.println(str);
		//type2.set(1);	//error, not permitted in type string
	}
}
		/*PreGenerics type=new PreGenerics();
		
		type.setT("Vijay");
		String str= (String) type.getT();	//type casting error prone and can
		System.out.println(str);
		type.setT(1);
		int num=(int) type.getT();
		System.out.println(num);
	}

}*/
