import java.util.*;
// Declaration
// type [][] arrayName = new type[rows][columns] 
// eg --> int[][]numbers = new int[3][5] 

public class Arrays2d {
    public static void main(String[] args){
        // int[][] numbers = new int[3][5];
        Scanner sc =  new Scanner(System.in);
        int rows =  sc.nextInt();
        int columns= sc.nextInt();
        int [][] matrix = new int[rows][columns];

         for(int i =0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
         }
        //  for(int i=0; i<rows; i++){
        //     for(int j=0; j<columns; j++){
        //         System.out.print(matrix[i][j]+ " ");
        //     }
        //     System.out.println();

        //  }

        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if (x==matrix[i][j]) {
                    System.out.println((i+1) + ", " + (j+1));
                }
            }
        }

    }    
}
