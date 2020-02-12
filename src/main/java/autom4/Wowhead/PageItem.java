package autom4.Wowhead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.URL;

public class PageItem {

	public List<String> recuperationCaracteristiquesFichier(String index) throws FileNotFoundException {
		URL caract = PageItem.class.getClassLoader().getResource("src/test/java/resources/objet" + index + ".txt");
		File caractResource = new File(caract.getFile());
		
	    Scanner s = new Scanner(caractResource, "UTF-8");
	    ArrayList<String> list = new ArrayList<String>();
	    while (s.hasNextLine()){
	        list.add(s.nextLine());
	    }
	    s.close();
	   
	    return list;
	}
	

	
}
