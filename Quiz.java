package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Quiz {

public static List<String> returnValuesForKeysStartingWithA(Map<String,String> dictionary) {
	List<String> resultList = new ArrayList<>();
	Set<String> keySet = dictionary.keySet();
	for (String key : keySet) {
		if (key.toLowerCase().charAt(0) == 'a') {
			resultList.add(dictionary.get(key));
		}
	}
	return resultList;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> words = new HashMap<String,String>();
		words.put("Amber", "some girl named Amber");
		words.put("ampersand", "like 'and' but cooler sounding");
		words.put("Phil", "some dude named Phil");
		words.put("Charlie", "That guy from Lost with the heroine problem");
		
		System.out.println(returnValuesForKeysStartingWithA(words));
		System.out.println(words);
	}

}
