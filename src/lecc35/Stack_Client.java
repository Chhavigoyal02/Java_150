package lecc35;

public class Stack_Client {

	public static void main(String[] args) throws Exception{
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
//		st.push(60);//this will give error 
		System.out.println(st.peek());
		st.dsiplay();
		System.out.println(st.pop());
		st.dsiplay();
		
	}

}
