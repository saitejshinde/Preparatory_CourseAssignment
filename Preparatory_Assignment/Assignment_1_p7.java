class Assignment_1_p7{
    public static void main (String [] args ){
        if (args.length != 1) {
            System.out.println("Please provide a number as command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}