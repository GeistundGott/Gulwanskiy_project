
import java.util.Arrays;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gulwanskiy");
		String reg = "(([0-9]{1,3}), )+([0-9]{1,3})?";
		String s="5, 11, 2, 25, 13, 14";
		if(Pattern.matches(reg, s)) {
			String[] sarr=s.split(", ");
			int[] arr=new int[sarr.length];
			for(int i=0; i<sarr.length; i++) {
				arr[i]=(int)Math.pow(Integer.parseInt(sarr[i]),2);
			}
			System.out.println(Arrays.toString(sarr)+" исходная строка");
			System.out.println(Arrays.toString(arr)+" квадрат исходной строки");
		}else {
			System.out.println("что-то пошло не так");
		}
	}

}
