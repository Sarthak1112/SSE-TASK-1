// import java.util.*;

// public class Functions {
//     public static int calcualteSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     // public static void printMyName(String name){
//     //     System.out.println(name);
//     //     return;
//     // }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a =sc.nextInt();
//         int b =sc.nextInt();

//         int sum = calcualteSum(a, b);
//         System.out.println(sum);
//         // printMyName();

//     }
    
// }


import java.util.*;

public class Functions {
    public static void calculateFactorial(int a){
        int factorial =1 ;
        if (a==0) {
            System.out.println(1);
            return; 
        }
        else{
            if(a<0){
                System.out.println("Invalid Input");
                return ;
            }
        else{
            for(int i=a; i>=1; i--){
                 factorial = factorial *i;


            }
        System.out.println(factorial);
        return;

            
        }
    }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);
    }
    
}
