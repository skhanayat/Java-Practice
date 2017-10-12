import java.util.Scanner;

public class Ass1_3 {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first number");
		byte first_number = a.nextByte();
		byte second_number = a.nextByte();
		a.close();
		byte result;
		result=(byte)(first_number&second_number);
		System.out.println("The result of logical AND"+result);
		if(first_number>0&&second_number>0){
			  result=1;                       // proper indentation is also followed
			  System.out.println(result);
	}
	}
}
