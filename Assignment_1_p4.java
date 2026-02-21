import java.util.*;
  
class  Assignment_1_p4{
    public static void main(String[] args) {
	if( args.length == 0 ){
		System.out.println("Marks Not Provided");
		return ;
	}
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int totalMarks = 0 ;
        for(int i = 0; i< 5 ; i++){
            //System.out.print("Enter the Marks of Subject "+i+" : ");
            
	    int marks = Integer.parseInt(args[i]) ;//sc.nextInt();
            if(marks > 100){
                System.out.println("Enter appropriate Marks of Subject "+i+" Marks > 100 is not allowed ");
                i--;
                continue;
            }
            totalMarks += marks;
        }
 
        int avg = totalMarks / 5;
         
        boolean t = avg >= 90? true:false;
         
        if(t){
            System.out.print("Grade: Ex" );
        }
        else if(90>avg && avg >=80){
            System.out.print("Grade: A" );
        }
        else if(80>avg && avg >=70){
            System.out.print("Grade: B");
        }
        else if(70>avg && avg >=60){
            System.out.print("Grade: C" );
        }
        else if(60>avg){
            System.out.print("Grade: F" );
        }
        
    }
 
}

