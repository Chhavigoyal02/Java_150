package lec02;

public class pattern25 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		int c=1;
		while(row<=n) {
			int i=1;

			//space
			while(i<=space) {
			System.out.print("\t");
			i++;
			}
			// star
			int j=1;
			while(j<=star) {
				System.out.print(c++ +"\t");
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}