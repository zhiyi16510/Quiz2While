
public class ExerciseWhile{

	public static void main(String[] args) {
		//Convert each of the following for loops into an equivalent while loop. 
		//(You might need to rename some variables for the code to compile, since all four parts a-d are in the same scope.)
		
		// 1.
		//System.out.println("1.");
		//int max = 5;
		//for (int n = 1; n <= max; n++) {
		    //System.out.println(n);
		//}
		//System.out.println();
		
		int a=0;
		while(a<5) {
			int n=1;
			while(n<=a) {
				System.out.print("n");
				n++;
			}
			System.out.println("");
			a++;
		}

		// 2.
		//System.out.println("2.");
		//int total = 25;
		//for (int number = 1; number <= (total / 2); number++) {
		    //total = total - number;
		    //System.out.println(total + " " + number);
		//}
		//System.out.println();
		
		int b=25;
		int c=1;
		while(c<=(b/2)) {
			b = b - c;
			System.out.println(b + " " + c);
			c++;
		}
		System.out.println("");
		
		//3. 
		//System.out.println("3.");
		//for (int i = 1; i <= 2; i++) {
		    //for (int j = 1; j <= 3; j++) {
		        //for (int k = 1; k <= 4; k++) {
		            //System.out.print("*");
		        //}
		       //System.out.print("!");
		    //}
		    //System.out.println();
		//}
		//System.out.println();
		
		int i=1;
		while(i<=2) {
			int j=1;
			while(j<=3) {
				int k=1;
				while(k<=4) {
					System.out.print("*");
					k++;
				}
				System.out.print("!");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		//4. 
		//System.out.println("4.");
		//int number = 4;
		//for (int count = 1; count <= number; count++) {
		    //System.out.println(number);
		    //number = number / 2;
		//}
		
		int num=4;
		int count=1;
		while(count<num) {
			System.out.println(num);
			num = num/2;
			count++;
		}
		
	}

}
