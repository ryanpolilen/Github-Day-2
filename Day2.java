import java.util.ArrayList;
public class Day2{
	public static void main(String[]args){
		System.out.println("Ryan Polilen");
		System.out.println("Alexandria Bayas");

		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(0);

		System.out.println(convertToInt(list));


	}

	public static int convertToInt(ArrayList<Integer> list){
		int j = 1;
		int c = 0;
		for(int i = list.size()-1; i >= 0; i--){
			c+=(list.get(i)*j);
			j*=10;
		}
		return c;
	}
}