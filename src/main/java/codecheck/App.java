package codecheck;

public class App {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[args.length-1]);
		StringBuilder sb = new StringBuilder();

		for (int i = 0, l = args.length-1; i < l; i++) {
			String[] str = args[i].split(":");
			int key = Integer.parseInt(str[0]);
			String value = str[1];

			if (num % key == 0) {
				sb.append(value);
			}
		}
		if (sb.toString().isEmpty()) {
			System.out.println(num);
		} else {
			System.out.println(sb);
		}
	}
}
