package lecc36;
import java.util.Stack;
public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		String str="IIIDIDDD";
		System.out.println(Construct(str));

	}
	public static String Construct(String str) {
		int[] ans=new int[str.length()+1];
		Stack<Integer> st=new Stack<>();
		int count=1;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=count;
				count++;
				while(!st.isEmpty()) {
					ans[st.pop()]=count;
					count++;
				}
			}
			else {
				st.push(i);
			}
		}
		String s="";
		for(int i=0;i<ans.length;i++) {
			s+=ans[i];
		}
		return s;
	}

}
