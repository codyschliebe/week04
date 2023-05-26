package week04;
import java.util.List;
import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cars = new ArrayList<String>();
		cars.add("Ford F150");
		cars.add("Nissan Rogue");
		cars.add("Chevy Malibu");
		cars.add("Ferrari Testerosa");
		
		System.out.println(cars);
		
		String shortest = "";
		int length = 9999;
		
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).length() < length) {
				shortest = cars.get(i);
				length = cars.get(i).length();
			}
		}
		
		System.out.println(shortest);
	}

}
