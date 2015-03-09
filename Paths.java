import java.util.*;

public class Paths{
	static Map<String,List<String>> routes=new Hashtable<String,List<String>>();
	static{
		List<String> bangalore=new ArrayList<String>();
		bangalore.add("singapore");
		List<String> singapore=new ArrayList<String>();
		singapore.add("seoul");
		singapore.add("bangalore");
		singapore.add("dubai");
		List<String> seoul=new ArrayList<String>();
		seoul.add("beijing");
		seoul.add("singapore");
		List<String> beijing=new ArrayList<String>();
		beijing.add("tokyo");
		beijing.add("seoul");
		List<String> tokyo=new ArrayList<String>();
		tokyo.add("beijing");
		List<String> dubai=new ArrayList<String>();
		tokyo.add("singapore");		
		routes.put("bangalore",bangalore);
		routes.put("singapore",singapore);
		routes.put("seoul",seoul);
		routes.put("beijing",beijing);
		routes.put("tokyo",tokyo);
		routes.put("dubai",dubai);
	}

	public static boolean isCityPresent(String city){
		Set<String> cities=routes.keySet();
		return cities.contains(city)?true:false;
	}

	public static boolean hasDirectPath(String fromCity, String toCity){
		List<String> startCity=routes.get(fromCity);
		return (startCity!=null)?startCity.contains(toCity):false;
	}

	public static void giveStatus(String fromCity, String toCity){
		if(!isCityPresent(fromCity)){ System.out.println("No city named "+fromCity+" in database");return;};
		if(!isCityPresent(toCity)){ System.out.println("No city named "+toCity+" in database");return;}
		System.out.println(hasDirectPath(fromCity,toCity));
	}

	public static void main(String[] args) {
		String fromCity=args[0].toLowerCase();
		String toCity=args[1].toLowerCase();
		giveStatus(fromCity,toCity);
	}
}