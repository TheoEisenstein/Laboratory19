package co.grandcircus.lists;

public class Lab19Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] algorithmMe = {1,2,3,2,2,4,5,5,7,8,4,4,1,0,10};
		
		int[] findNumbers = new int[11];
		
		for(int i = 0; i < findNumbers.length; i++) {
			int nextItem = 0;
			int p = 0;
					for (int j = 0; j< findNumbers.length; j++) {
						
						if (algorithmMe[i] == p) {
							nextItem++;
							
						}
						findNumbers[i] = nextItem;
						p++;
					}
			
				
			
			

	}
for(int k = 0; k< findNumbers.length; k++) {
	System.out.println(k +": " +findNumbers[k]);
}

}
}
