import java.util.*;
class Assignment_1_p14{
    public static void main (String [] args ){
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (Character.toLowerCase(str.charAt(i)) !=
                Character.toLowerCase(str.charAt(len - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}


