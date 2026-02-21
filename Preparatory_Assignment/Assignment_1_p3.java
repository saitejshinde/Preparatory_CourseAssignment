import java.util.*;

class Assignment_1_p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev =0 ; 
        int curr = 1;
        System.out.println( "Febonacci series is as follows : \n"+prev+ "\n"+curr);
        for(int i = 0 ; i < n-2 ; i++){
            
            int temp = curr;
            curr = prev + curr ;
            prev = temp ;
            System.out.println(curr);
        }
    }

}