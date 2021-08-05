public class Repl {
	public static void main (String args[]) {
	
		System.out.println(repl("hello",3));
		
	}
	
	public static String repl(String str, int times) {
		String tmp = "";
		for (int i = 0 ; i < times; i++) {
			tmp = tmp + str;
			//tmp += str;
		}
		return tmp;
	}
}

