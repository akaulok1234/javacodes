
/*Write a program that calculates the sum of the first 100 natural numbers using a loop.
 (Hint: Use a loop like for or while) 
 */
public class codingchallenge2 {
    public static void main(String[] args) {

        int sum = 0;// initialize first 

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of the first 100 natural numbers is: " + sum);
    }
}
        
    
