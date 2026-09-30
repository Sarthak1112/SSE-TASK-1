// import java.util.*;

// public class Conditions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age>18){
//             System.out.println("Adult");
//         } else{
//             System.out.println("Not Adult");
//         }
//     }
// }

// import java.util.*;

// public class Conditions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x%2==022){
//             System.out.println("Even");
//         } else{
//             System.out.println("Odd");
//         }
//     }
// }

import java.util.*;

// public class Conditions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a==b){
//             System.out.println("Equal");
//         } else{
//             if(a>b){
//                 System.out.println("a is greater than b");
//         }
//         else{
//                 System.out.println("a is lesser than b");
//         }
//         }
//     }
// }




public class Conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid Button");
        }
    }
}