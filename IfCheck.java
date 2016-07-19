import java.util.Scanner;

public class IfCheck {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int age;
		System.out.println("Enter your Age");
		age=s.nextInt();
		if(age>18 && age<100){
			System.out.println("Eligeble for Vote");
		}
		else if(age>100){
			System.out.println("INvalid Age");
		}
		else{
			System.out.println("Not eligeble for Vote");
		}
	}

}
