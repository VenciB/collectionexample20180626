package by.htp.collectionexample.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.htp.collectionexample.entity.User;

public class MainAppMap {

	public static void main(String[] args) {
		
		List<User> users1 = new ArrayList<>();
		users1.add( new User( 20, "Kate" ) );
		users1.add( new User( 21, "Olga" ) );
		users1.add( new User( 23, "Mary" ) );
		
		List<User> users2 = new ArrayList<>();
		users2.add( new User( 18, "Petr" ) );
		users2.add( new User( 24, "Igor" ) );
		users2.add( new User( 20, "Ivan" ) );
		
		Map<Integer, List<User>> map = new HashMap<>();
		
		map.put( 1, users1 );
		map.put( 2,  users2 );
		//map.put( 1, users2 );
		
		System.out.println("=========================");
		
		int sizeofMap = map.size();
		System.out.println("Lists in map: " + sizeofMap);
		System.out.println("===================");
		int sizeofUser = 0;
		for( int w = 0; w < sizeofMap; w++ ) {
			System.out.println( "List " + (w + 1) + ":" );
			System.out.println("---------");
			sizeofUser =  map.get(w+1).size();
			System.out.println("Records in list " + (w + 1) + ": " + sizeofUser );
			System.out.println("--------------------");
				for( int q = 0; q < sizeofUser; q++ ) {
					System.out.print( "Name: " + map.get(w+1).get(q).getName() );
					System.out.println( ", age: " + map.get(w+1).get(q).getAge() );
				} // end inner for loop
				System.out.println("===================");
				
		} // end outer for loop
		System.out.println("=========================");
		
	} // end main
	
} // end class