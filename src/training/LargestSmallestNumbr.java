package training;

public class LargestSmallestNumbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[] {55,32,45,98,82,11,9,39,50};
		int small=num[0];
		int larg=num[0];
		
		for(int i=1;i<num.length;i++){
			if(num[i]>larg)
				larg=num[i];
			else if(num[i]<small)
				small=num[i];
		}
		System.out.println("Largest Number is:"+larg);
		System.out.println("Smallest Number is:"+small);

	}

}
