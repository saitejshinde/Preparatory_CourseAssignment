import java.util.*;
class Assignment_1_p15{
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine().toUpperCase();

        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            }
        }

        System.out.println("Output:");
        for(int i = 0; i < 26; i++) {
            if(count[i] > 0) {
                System.out.println((char)(i + 'A') + " : " + count[i]);
            }
        }
        
    }
}