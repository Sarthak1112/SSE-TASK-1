// // solid Rectangle
// public class Patterns {
//     public static void main(String[] args){
//         for(int j = 1; j < 5; j++){
//             System.out.println("");
//             for(int i =1; i<5; i++){
//                 System.out.print("*");
//             }
//         }
        
//     }
// }

// // hollow rectangle
// public class Patterns {
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5; 

//         //outer loop
//         for (int i=1; i<=n; i++ ){
//             //inner loop
//             System.out.println("");
//             for(int j =1; j<=m; j++){
//                 if (i==1 || j==1 || i==n || j==m) {
//                     System.out.print("*");

//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
// }

// // print the half pyramid * pattern

// public class Patterns {
//     public static void main(String[] args){
//         for(int i=1; i<5; i++){
//             System.out.println("");
//             for(int j = 1; j<=i; j++)
//                 System.out.print("*");
//         }
//     }  
// }


// // reverse pyramid 
// public class Patterns {
//     public static void main(String[] args){
//         int n = 4;

//         for(int i=n; i>=1; i--){
            
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
        
//             }
//         System.out.println("");
//         }
//     }
    
// }


// // print pyramid with other half
// public class Patterns {
//     public static void main(String[] args){
//         int n = 4;

//         for(int i=1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//     }
//     }
    
// }

// // print a number pyramid
// public class Patterns {
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
// }


// // reverse number pyramid
// public class Patterns {
// public static void main(String[] args){
//     int n = 5;
//     for(int i=n; i>=1; i--){
//         for(int j =1; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println("");
//     }
// }
    
// }

// // make number pyramid with always increasing(floyd's triangle)
// public class Patterns {
//     public static void main(String[] args){
//         int n = 5;
//         int number = 1;
//         for(int i =1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println("");
//         }
//     }
    
// }


// // 0-1 triangle
// public class Patterns {
//     public static void main(String[] args){
//         int n = 5;
//         int number = 0;
//         for(int i =1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if(number==0){
//                     number++;
//                     System.out.print(number);
                
//                 }else{
//                     number--;
//                     System.out.print(number);
//                 }   
//             }
//             System.out.println();
//         }
//     }
// }

// 0-1 triangle

public class Patterns {
    public static void main(String[] args){
        int n = 5;

         for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if (i%2!=0 && j%2 != 0) {
                    System.out.print(1);
                }else{
                    if (i%2==0 && j%2 == 0) {
                        System.out.print(1);
                    }else{
                    System.out.print(0);
                    }
                }
           }   
           System.out.println();
         }
    }
}