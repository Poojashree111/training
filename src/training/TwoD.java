package training;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[][]matrix= {
				{1,3,4},{5,7,6},{9,3,2}
		};
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j =0; j<matrix.length;j++) {
				
		System.out.print(matrix[i][j]+"");
			}
			System.out.println();
			
		}

	}

}

