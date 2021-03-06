package com.paths;

import java.io.IOException;
import java.util.*;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class Paths{
	static Map<String,List<String>> routes=new Hashtable<String,List<String>>();
	Queue<String> pathQueue=new LinkedList<String>();
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

	public  boolean isCityPresent(String city){
		Set<String> cities=routes.keySet();
		return cities.contains(city);
	}

	public boolean hasDirectPath(String fromCity, String toCity){
		List<String> startCity=routes.get(fromCity);
		return (startCity!=null) && startCity.contains(toCity);
	}

	public void addInPathQueueIfDirectPath(String fromCity, String toCity){
		if(routes.get(fromCity).contains(toCity)){
            pathQueue.add(toCity);
        }
	}

	public void addCitiesInPathQueue(String fromCity, String toCity){		
		if(fromCity==null || toCity==null){System.out.println("write man"); return;}
		pathQueue.add(fromCity);
		if(hasDirectPath(fromCity,toCity)){addInPathQueueIfDirectPath(fromCity, toCity);return;}
        for(int i=0; i<routes.get(fromCity).size(); i++){
            if(!pathQueue.contains(routes.get(fromCity).get(i))){
                addCitiesInPathQueue(routes.get(fromCity).get(i),toCity);
            	return;
            }
        }
	}

	public  void printPath(){
		System.out.println(String.join("->",this.pathQueue));
	}

	public int giveStatus(String fromCity, String toCity){
		if(!isCityPresent(fromCity)){ System.out.println("No city named "+fromCity+" in database");return 0;}
		if(!isCityPresent(toCity)){ System.out.println("No city named "+toCity+" in database");return 0;}
		System.out.println("direct_path="+hasDirectPath(fromCity,toCity));return 1;
	}



	public static void main(String[] args) throws IOException {
        String fromCity=args[0].toLowerCase();
        String toCity=args[1].toLowerCase();
        if(args[0].equals("-f")){
            String filePath=args[1];
            String content=ReadFileAndMap.getFileContent(filePath);
            String[] sc = ReadFileAndMap.splitContentAtNewLine(content);
            ReadFileAndMap.mapToRoute(sc);
            fromCity=args[2].toLowerCase();
            toCity=args[3].toLowerCase();
        }
		Paths p =new Paths();
		if(p.giveStatus(fromCity, toCity)==0){return;}
		p.addCitiesInPathQueue(fromCity, toCity);
		p.printPath();
	}
}