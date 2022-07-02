package Day3;

public class UseExtra {
	public static void main(String[] args) {
		Extra e1=new Extra();
		e1.name="Balaji";
		e1.age=26;
		e1.id=247;
		e1.std="X" ;
		e1.attendancePercentage=95;
		e1.numberOfDaysPresentInSchool=(240*e1.attendancePercentage/100);
		System.out.println("Number of days present :"+e1.numberOfDaysPresentInSchool);
		
	}

}
