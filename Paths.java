import java.util.*;

public class Paths{
	static Map<String,List<String>> routes = new Hashtable<String,List<String>>();
	static{
		List<String> bangalore = new ArrayList<String>();
		bangalore.add("singapore");
		List<String> singapore = new ArrayList<String>();
		singapore.add("seoul");
		singapore.add("bangalore");
		singapore.add("dubai");
		List<String> seoul = new ArrayList<String>();
		seoul.add("beijing");
		seoul.add("singapore");
		List<String> beijing = new ArrayList<String>();
		beijing.add("tokyo");
		beijing.add("seoul");
		List<String> tokyo = new ArrayList<String>();
		tokyo.add("beijing");
		List<String> dubai = new ArrayList<String>();
		tokyo.add("singapore");		
		routes.put("bangalore",bangalore);
		routes.put("singapore",singapore);
		routes.put("seoul",seoul);
		routes.put("beijing",beijing);
		routes.put("tokyo",tokyo);
		routes.put("dubai",dubai);
	}

	public static boolean isCityPresent(String city){
		Set<String> cities = routes.keySet();
		return cities.contains(city)?true:false;
	}
}