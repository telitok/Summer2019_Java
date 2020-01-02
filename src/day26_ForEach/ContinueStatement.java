package day26_ForEach;

public class ContinueStatement {
	
	/*
	 continue statement: used to skip the current iteration
	 
	 */
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			if (i>2) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		int [] numers = {1,2,3,4,5};
		for (int i = 0; i< numers.length; i++) {
			if (numers[i]<3) {
				continue;
			}
			System.out.print(numers[i]+ " ");
		}
		System.out.println();	
		
	}

}
