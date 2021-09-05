package javaprogams;


public class pyramid {

	public static void main(String[] args) {
		int pyramidsize = 4;
		boolean flag=true;
		for(int i=0;i<pyramidsize;i++) {
			int j=pyramidsize-i-1;
			while(j!=0) {
				System.out.print(" ");
				j--;
			}
			for(int k=0;k<=i*2;k++)
			{
				if(flag) {
					System.out.print("*");				
				}else {
					System.out.print(" ");				
				}
				flag=!flag;
			}
			flag=true;
			System.out.println();
			
		}

	}

}
