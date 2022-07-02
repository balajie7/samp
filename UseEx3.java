package Day3;

public class UseEx3 {
	public static void main(String[] args) {
		Ex3 c=new Ex3();
		c.brand="innova";
		c.price=1700000;
		c.colour="white";
		String a=c.brand.toUpperCase();
		int b=c.brand.length();
		String d=c.colour.toUpperCase();
		System.out.println("BRAND="+" "+a+"::"+"COLOUR="+" "+d+"::"+"LENGTH="+" "+b);
				}

}
