
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gulwanskiy");
		String reg = "(([0-9]{1,3}), )+([0-9]{1,3})?";
		String s = "5, 11, 2, 25, 13, 14";
		if (Pattern.matches(reg, s)) {
			String[] sarr = s.split(", ");
			int[] arr = new int[sarr.length];
			for (int i = 0; i < sarr.length; i++) {
				arr[i] = (int) Math.pow(Integer.parseInt(sarr[i]), 2);
			}
			System.out.println(Arrays.toString(sarr) + " исходная строка");
			System.out.println(Arrays.toString(arr) + " квадрат исходной строки");
		} else {
			System.out.println("что-то пошло не так");
		}
		System.out.println("=======================");
		String reg1 = "(([0-1][0-9])|([2][0-3])):([0-5][0-9])";
		String t = "12:59, 23:41, 00:12, 00:00, 09:15, 24.00, 25.00, 12.60, 12.93, 41.93";
		String[] st = t.split(", ");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i] + " формат времени " + Pattern.matches(reg1, st[i]));

		}
	}

}
