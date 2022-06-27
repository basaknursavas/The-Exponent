import java.util.Scanner ;

public class theExponent {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number ;
        System.out.print("Enter the limit number : ");
        number = inp.nextInt();

        for (int i = 1 ; i <= number ; i *= 4){
            System.out.println("The exponent of 4 is : " + i);
        }

        for (int k = 1 ; k <= number ; k *= 5){
            System.out.println("The exponent of 5 is : " + k);
        }
    }
}
