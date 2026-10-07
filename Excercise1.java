import java.util.*;


// // Enter 3 numbers from the user & make a function to print their average.

// public class Excercise1 {
//     public static int average(int a, int b, int c){
//         int avg = (a+b+c)/3;
//         return avg;
//     }   
//     public static void main(String[] args) {
//         Scanner i = new Scanner(System.in);
//         int a = i.nextInt();
//         int b = i.nextInt();
//         int c = i.nextInt();

//         int avg= average(a, b, c);
//         System.out.println(avg);
//     }
// }




// // Write a function to print the sum of all odd numbers from 1 to n.

// public class Excercise1 {
//     public static void oddNumber(int n){
//         for(int i =1; i<=n; i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }
//         }
    
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         oddNumber(n);
        
//     }
    
// }

// // Write a function which takes in 2 numbers and returns the greater of those two.

// public class Excercise1 {
//     public static void greaterNumber(int a,int b){
//         if(a>b){
//             System.out.println(a);
//         }else{
//             if (b>a) {
//                 System.out.println(b);;
//             }else{
//                 System.out.println("a and b are equal");
//             }
//         }

//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();

//         greaterNumber(a, b);
//     }
    
// }


// // Write a function that takes in the radius as input and returns the circumference of a circle.
// public class Excercise1 {
//     public static double calculateCircumference(int a){
//         double circumference = (Math.PI)*2*a;
//         return circumference;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int r = in.nextInt();
//         double circumference = calculateCircumference(r);
//         System.out.println(circumference);
//     }
    
// }


// // Write a function that takes in age as input and returns if that person is eligible to vote or not.
// // A person of age > 18 is eligible to vote.
// public class Excercise1 {
//     public static void eligibleCriteria(int a){
//         if (a>=18) {
//             System.out.println("eligible");
//         }else{
//             System.out.println("Not eligible");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int age = in.nextInt();
//         eligibleCriteria(age);
//     }
    
// }


// // Write an infinite loop using do while condition.
// public class Excercise1 {
//     public static void main(String[] args) {

//         int n=1;
//         do{
//             System.out.println("hello");
//         }while(n>0);
//     }
    
// }


// // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power
// // of another i.e. xn.
// public class Excercise1 {
//     public static void exponent(int a, int b){
//         System.out.println(Math.pow(a, b));
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         exponent(a, b);
//     }
// }


// // Write a program to enter the numbers till the user wants and at the end it should display the count of
// // positive, negative and zeros entered. 
// public class Excercise1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();

//         int positive = 0;
//         int negative = 0;
//         int zeros = 0;

//         for(int i=1; i<=n; i++ ){
//             int num = in.nextInt();
//             if (num>0) {
//                 positive++;
//             }else{
//                 if(num == 0){
//                     zeros++;
//                 }else{
//                     negative++;
//                 }

            
//             }
//         }
//         System.out.println("total positive number entered "+ positive);
//         System.out.println("total negative number entered "+ negative);
//         System.out.println("total zeros entered "+ zeros);
//     }
    
// }



// // Write a program to print Fibonacci series of n terms where n is input by user :
// // 0 1 1 2 3 5 8 13 21 ..... 
// // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

// public class Excercise1 {
//     public static void main(String[] args) {
//         Scanner in =  new Scanner(System.in);
//         int n = in.nextInt();
        
//         int a = 0;
//         int b = 1;

//         for(int i = 1; i<=n; i++){
//             int c = a+b;
//             System.out.println(a);

//             a=b;
//             b=c;
            
//         }
//     }
    
// }


// Write a function that calculates the Greatest Common Divisor of 2 numbers
public class Excercise1 {
    public static int GCD(int a, int b){
        int gcd = 1;
        for(int i = 1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i == 0){
                gcd =i;
            }
        }

        return gcd;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int gcd = GCD(a, b);
        System.out.println(gcd);

    }
    
}

