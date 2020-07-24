import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ResourceCentre_Student {
	
	@Test
	public static void addChromebookTest() {
		//fail("Not yet implemented");
		//write your code here
		//Lauranda
		assertNotNull("Test if there is a valid Chromebook arraylist to add to " , chromebookList);
		ResourceCentre.addChromebook(chromebookList,  cb1);
		assertEquals("Test if that Chromebook arraylist size is 1?" , 1, chromebookList.size() );
		assertSame("Test that the Chromebook is added same as 1st item of the list? ");
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test Chromebook arraylist size is 2?", 2, chromebookList.size());

	}

}
