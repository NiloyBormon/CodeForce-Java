import java.util.*;
public class Watermelon{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		
		if (w%2==0 && w>2){
			System.out.print("YES");
		}else{
			System.out.print("NO");
		}
	}
}