import java.util.*;

class Assignment_1_p2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial Through recursion = " + ans);
        int fact = 1 ; 
        for(int i=n; i>0 ; i--){
            fact*=i;
        }
        System.out.println("Factorial Through Looping = " + fact);
        
    }
    
    
    public static int factorial(int a ){
        if( a ==1 )
            return 1;
        
        return a*factorial(a-1);
    }
}