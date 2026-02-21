class Assignment_1_p1{

	public static void main(String [] args ){

        	if (args.length == 0) {
         	   System.out.println("Please provide numbers as command line arguments.");
        	    return;
        	}

        	int max = Integer.parseInt(args[0]);

        	for (int i = 1; i < args.length; i++) {
            		if (Integer.parseInt(args[i]) > max) {
                		max = Integer.parseInt(args[i]);
            		}
        	}

        	System.out.println("Maximum number is: " + max);

	}

}


// class Main {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number of Entries you want to Enter n = ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         int max = Integer.MIN_VALUE; 
//         int count = 0; 
//         System.out.println("Enter the Numbers");
//         while(arr.length > count ){
//             arr[count] = sc.nextInt();
//             count++;
//         }
        
//         for(int i =0 ; i< arr.length ; i++){
            
//             if(arr[i]> max ){
//                 max = arr[i];
//             }
//         }
        
//         System.out.println("Max number is : "+ max);
        
//     }
// }
