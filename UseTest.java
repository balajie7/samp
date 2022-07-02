package Day3;

public class UseTest {
	public static void main(String[] args) {
		Test t1=new Test();
		t1.brand="BMW";
		t1.model="XVI";
		t1.price=400000;
		t1.isPetrol=false;
		
		Test t2=new Test();
		t2.brand="TATA";
		t2.model="IX";
		t2.price=300000;
		t2.isPetrol=true;
		
		Test t3=new Test();
		t3.brand="SWIFT";
		t3.model="X2V";
		t3.price=200000;
		t3.isPetrol=true;
		
		int a=t1.brand.length();
		int b=t2.brand.length();
		int c=t3.brand.length();
		
		int d=t1.price+t2.price+t3.price;
		String e=t1.brand.toUpperCase();
		String f=t2.brand.toUpperCase();
		String g=t3.brand.toUpperCase();
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
	}			

}
