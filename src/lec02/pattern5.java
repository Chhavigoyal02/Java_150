package lec02;

public class pattern5 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=5;
		int space=0;
		while(row<=n) {
			int i=1;
			//space
			while(i<=space) {
			System.out.print("  ");
			i++;
			}
			// star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star--;
			space++;
			System.out.println();
		}
	}

}
