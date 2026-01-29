class Reverse_String_Without_StrFun_q5 {
	public static void main(String[] args) {

		String str = "Java";// avaJ

		// char arr = str.toCharArray();// [J,a,v,a]

		for (int i = str.length() - 1; i >= 0; i--) {

			IO.print(str.charAt(i));
		}

	}
}
