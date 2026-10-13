import java.util.*;
// type[]arrayName= new type[size];
// public class arrays {
//     public static void main(String[] args) {

//         // // Defining an array type 1
//         // int[] marks = new int[3];
//         // // int marks[] = new int[3];   BOTH WAYS IS ACCEPTABLE
//         // marks[0] = 97;
//         // marks[1] = 98;
//         // marks[2] = 85;

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);



//         // // Defining an array type 2
//         // int marks[] = {97,85,82};

//         // take input from user and make an array
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();


//         int marks[] = new int[n];
//         // By default 0 for int is taken as placeholder if just size is provided.
//         // false for boolean, 0.0 for float


//         for(int i=0; i<n; i++){
//             marks [i] = sc.nextInt();
//         }

//         for(int i=0; i<n; i++){
//             System.out.println(marks[i]);
//         }

//     }
// }

// Take an array input from the user. Search for a given number x and print  the index at which it occurs
// **LINEAR SEARCH**

// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =  sc.nextInt();
//         int num[]= new int[n];

//         for(int i=0; i<n; i++){
//             num[i]= sc.nextInt();
//         }

//         for(int i=0; i<num.length; i++){  //another way to write n
//             if(num[i]==4){
//                 System.out.println("Index is "+ i);
//             }
//         }

//     }

// }




// Find the maximum & minimum number in an array of integers. 


// public class arrays {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         int n = sc.nextInt();

//         int num[] = new int[n];

//         for(int i = 0; i<num.length;i++){
//             num[i]= sc.nextInt();
//         }

//         for(int i=0; i<n; i++){
//             if(num[i]>max){
//                 max = num[i];
//             }
//         }

//         for(int i=0; i<n; i++){
//             if(num[i]<min){
//                 min = num[i];
//             }
//         }
//         System.out.println("max is "+ max);
//         System.out.println("min is "+ min);


//     }
// }

// Take an array of numbers as input and check if it is an array sorted in ascending order.
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num[] = new int[n];

        for(int i = 0; i<n; i++){
            num[i]= sc.nextInt();
        }

        boolean isasc = true;

        for(int i = 1; i<n; i++){
            if (num[i-1]>num[i]){
                isasc = false;
            }
        }

        if(isasc==true){
            System.out.println("series is ascending");
        }
        else{
            System.out.println("series is descending");
        }



    }
    

}
