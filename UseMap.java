package datastructure;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;


import databases.ConnectDB;

public class UseMap extends ConnectDB {

	public static void main(String[] args)  throws IOException, SQLException, ClassNotFoundException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		ConnectDB db = new ConnectDB();
		List<String> listofUSAGames=new ArrayList<>();
			     listofUSAGames.add("Basketball");
			     listofUSAGames.add("Baseball");
			     listofUSAGames.add("laccross");
		List<String> listofAsiaGames=new ArrayList<>();
			      listofAsiaGames.add("cricket");
			      listofAsiaGames.add("Football");
			      listofAsiaGames.add("Hockey");
		List<String> listofEuropeGames=new ArrayList<>();
				   listofEuropeGames.add("soccer");
				   listofEuropeGames.add("wrestling");
				   listofEuropeGames.add("swimming");

		Map<String,List<String>> map1=new HashMap<String, List<String>>();
		map1.put("USA",listofUSAGames);
		map1.put("ASIA",listofAsiaGames);
		map1.put("EUROPE",listofEuropeGames);
		System.out.println(" HashMap Using For Loop...........................   ");
		for(Map.Entry  entry:map1.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());



		}
		System.out.println("  HashMap Using While Loop......... ............................");

		Map.Entry map1entry=null;
		Iterator map1iter=map1.entrySet().iterator();
		while ( map1iter.hasNext()){
			map1entry=(Map.Entry)  map1iter.next();
			System.out.println(map1entry.getKey()+" "+map1entry.getValue());
 		//db.InsertDataFromArrayListToMySqlUseMap( map1entry.getKey(),"UseMAP","KEYVAL");

		}
	  //db.InsertDataFromArrayListToMySqlUseMap( entry,"UseMAP","KEYVAL");
		// db.InsertDataFromArrayListToMySqlUseMap( listofUSAGames,"UseMAP","KEYVAL");

	}

}
