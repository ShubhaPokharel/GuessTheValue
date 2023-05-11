import java.util.Scanner;
class GuessPractice{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		 int guess = 25;
        
         while(true){
         	System.out.println("Enter your guess number");
         	 int number = s.nextInt();

         	if(number > guess){
         		System.out.println("Your number is greater than the guess number");
         	}
            else if(number < guess){
                System.out.println("Your number is less than the guess number");
            }
            else{
                System.out.println("Correct!");
                break;
            }
         }
        s.close();

	}
}