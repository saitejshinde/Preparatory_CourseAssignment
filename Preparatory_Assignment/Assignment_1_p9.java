import java.util.*;
class Assignment_1_p9{
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.println("Given Number :" + num);

        System.out.print("Binary equivalent :");
        printBinary(num);

        System.out.print("\nOctal equivalent :");
        printOctal(num);

        System.out.print("\nHexadecimal equivalent :");
        printHex(num);

    }



    static void printBinary(int n) {
        if (n > 1)
            printBinary(n / 2);
        System.out.print(n % 2);
    }

    static void printOctal(int n) {
        if (n >= 8)
            printOctal(n / 8);
        System.out.print(n % 8);
    }

    static void printHex(int n) {
        if (n >= 16)
            printHex(n / 16);

        int rem = n % 16;
        if (rem < 10)
            System.out.print(rem);
        else
            System.out.print((char)(rem - 10 + 'A'));
    }
}