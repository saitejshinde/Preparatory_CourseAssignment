import java.util.*;


class Assignment_1_p5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = 0, lower = 0, number = 0 ;
        
        System.out.print("Enter the String to be Evaluated : ");
        String str = sc.nextLine();
        
        for(char a : str.toCharArray()){
            
            if(Character.isLowerCase(a)){
                lower++;
            }
            else if (Character.isUpperCase(a)){
                upper++;
            }
            else if (Character.isDigit(a)){
                number++;
            }
        }
        
        System.out.println("The Upper case letter "+upper);
        
        System.out.println("The lower case letter "+lower);
        
        System.out.println("The digit letter "+number);
        
    }

}
