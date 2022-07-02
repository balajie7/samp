package Day3;

public class UseLaptop {
	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.brand="Dell";
		l1.price=50000;
		l1.colour="black";
		l1.isWarranty=true;
		String a=l1.brand.toUpperCase();
		int b=l1.brand.length();
		
		System.out.println(a+" "+b);
		
	}

}
