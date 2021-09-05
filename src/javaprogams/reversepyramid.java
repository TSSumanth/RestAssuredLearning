package javaprogams;

public class reversepyramid {

	public static void main(String[] args) 
	{
	
		int pyramidsize = 3;
		boolean flag=true;
		for(int i=0;i<pyramidsize;i++)
		{
			int j=i;
			while(j!=0)
			{
				System.out.print(" ");
				j--;
			}
			for(int k=0;k<pyramidsize*2 - i*2;k++) {
				if(flag) {
					System.out.print("*");				
				}else {
					System.out.print(" ");				
				}
				flag=!flag;
			}
			System.out.println();
		}

	}

}
