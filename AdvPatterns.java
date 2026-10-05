// // Butterfly pattern
// public class AdvPatterns {
//     public static void main(String[] args){
//         int n=5;
//         for(int i = 1; i<=n; i++ ){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             for(int j = (n-i); j>=1; j--){
//                 System.out.print("  ");
//             }
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
        
//         for(int i = n; i>=1; i-- ){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             for(int j = (n-i); j>=1; j--){
//                 System.out.print("  ");
//             }
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }


// // solid rhombus
// public class AdvPatterns {
//     public static void main(String[] args){
//         int n = 4;
//         for(int i = n; i>=0; i-- ){
//             for(int j =1; j<=i; j++){
//                 System.out.print(" ");

//             }
//             System.out.print("*****");
//             System.out.println();
//         }
//     }
    
// }


// // number pyramid full
// public class AdvPatterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j =1; j<=i; j++){
//                 System.out.print(i+" ");
//             }

//             System.out.println();
//         }
//     }
    
// }


// // Palindromic Pattern
// public class AdvPatterns {
//     public static void main(String[] args) {
//         int n =5;
//         for (int i = 1; i<=n;  i++) {
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = i; j>=1; j--){
//                 System.out.print(j);
//             }
//             for(int j = 2; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// Diamond pattern
public class AdvPatterns {
    public static void main(String[] args) {
        int n =4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=(2*i)-1; j++){
                System.out.print("*");
            }
                       
            
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=(2*i)-1; j++){
                System.out.print("*");   
            }
            System.out.println();
        }   
    }
}