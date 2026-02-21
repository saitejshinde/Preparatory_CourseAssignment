import java.util.*;
class Assignment_1_p6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //For Matrix 1
        System.out.println(" Enter Size of the Matrix 1 ");
        System.out.print(" Enter row Size of the Matrix 1 ");
        int r1 =  sc.nextInt();
        System.out.print("\n Enter Column Size of the Matrix 1 ");
        int c1 = sc.nextInt();
        
        int [][] ma1 = new int[r1][c1];
        
        //For Matrix 2
        System.out.println("\n\n Enter Size of the Matrix 2 ");
        System.out.print(" Enter row Size of the Matrix 2 ");
        int r2 =  sc.nextInt();
        System.out.print("\n Enter Column Size of the Matrix 2 ");
        int c2 = sc.nextInt();
        
        if(c1!= r2 ){
            System.out.println("Does Not Follows the Matrix Multiplication Rule");
            return;
        }
        
        int [][] ma2 = new int[r2][c2];
        
        System.out.println("Enter The Elements of the matrix 1");
        for(int i = 0 ; i < r1 ;i++){
            for(int j = 0 ; j<c1 ; j++){
                System.out.print("\nEnter Element ma1: ");
                ma1[i][j]= sc.nextInt();
            }
        }
        
        System.out.println("Enter The Elements of the matrix 2");
        for(int i = 0 ; i < r2;i++){
            for(int j = 0 ; j<c2 ; j++){
                System.out.print("\nEnter Element ma2: ");
                ma2[i][j]= sc.nextInt();
            }
        }
        
        
        int [][] ans = new int[r1][c2];
        
        for(int i =0 ; i< r1 ; i++){
            
            for(int j =0 ; j< c2; j++){
                int element = 0 ;
                for(int k = 0 ; k < r2 ; k++){
                    element += ma1[i][k] * ma2[k][j] ;
                }
                ans[i][j]=element; 
            }
            
        }
        
        System.out.println("The  Matrix1 is  : ");
        for(int i = 0 ; i < r1 ;i++){
            for(int j = 0 ; j<c1 ; j++){
                System.out.print(" "+ma1[i][j] +" ");
            
            }
            System.out.println();
        }
        
        System.out.println("The  Matrix2 is  : ");
        for(int i = 0 ; i < r2 ;i++){
            for(int j = 0 ; j<c2 ; j++){
                System.out.print(" "+ma2[i][j] +" ");
            
            }
            System.out.println();
        }
        
        
        System.out.println("The Final Matrix is  : ");
        for(int i = 0 ; i < r1 ;i++){
            for(int j = 0 ; j<c2 ; j++){
                System.out.print(" "+ans[i][j] +" ");
            
            }
            System.out.println();
        }
        
        
    }

}