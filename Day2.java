import java.util.ArrayList;

public class Day2{
	public static void main(String[]args){
		System.out.println("Ryan Polilen");
		System.out.println("Alexandria Bayas");

		System.out.println(convertToArrayList(8950));
	}
	public static ArrayList<Integer> convertToArrayList(int i){
		ArrayList<Integer> list = new ArrayList<>();

		while (i!=0){
			list.add(0, i%10);
			i/=10;
		}



		return list;
	}

}