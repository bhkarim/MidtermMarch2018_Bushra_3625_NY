package datastructure;

import databases.ConnectDB;
//import parser.Student;

import java.io.IOException;

import java.util.*;
import java.sql.SQLException;

//import java.util.List<Student>;

public class UseArrayList extends ConnectDB {

	public static void main(String[] args)  throws IOException, SQLException, ClassNotFoundException  {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		// Connection to database

		ConnectDB db = new ConnectDB();
       //db.connectToMySql()  ;

		// To add elements
		//List<Integer> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(2);
		list.add(5);
		list.add(4);

		// For retrieve
		System.out.println("For loop with iterator.............");
		//for (Integer it: list) {
		for (Integer it: list) {
			System.out.println(it);
		}
		System.out.println("While loop with iterator........");

		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		db.InsertDataFromArrayListToMySqlUseArrayList( list,"UseArrayList","ID");

		}
}
