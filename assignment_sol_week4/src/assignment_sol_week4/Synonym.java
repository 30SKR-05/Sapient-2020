package assignment_sol_week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Synonym {
	private static Map<String,ArrayList<String>> synonymMap = new HashMap<>(); 
	
	public Synonym() {
		//Storing some synonyms at the start
		synonymMap.putIfAbsent("GoodMorning", new ArrayList<String>(Arrays.asList("GoodMorning", "Shubhodaya", "Shubhohday", "Bonjour")));
		synonymMap.putIfAbsent("GoodEvening", new ArrayList<String>(Arrays.asList("GoodEvening", "Shubhasange", "Susandhya", "Bonsoir")));
	}
	
	public boolean checkKey(String key){
		return (synonymMap.containsKey(key)); 
	}
	
	public void setter(String key, List<String> list) {
		synonymMap.put(key, new ArrayList<String>(list));
	}
	
	public void toString(String key) {
		System.out.println(key+" Synonyms are:"+synonymMap.get(key));
	}
}
