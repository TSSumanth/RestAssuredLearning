package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Photos {

	public static void main(String[] args) throws IOException
	{
		File textfile = new File("EngagementList.txt");
		FileReader fr=new FileReader(textfile);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		Set<String> al = new TreeSet<String>();
		while((line=br.readLine())!=null)  
		{  
			al.add(line);		
		}  
		fr.close();    
		System.out.println("Size of arraylist: "+ al.size());
		System.out.println("Contents of File: ");
		
		Set<String> available = new TreeSet<String>();
		int count =0;
		File dir = new File("D:\\ENGAGEMENT");
		  File[] directoryListing = dir.listFiles();
		  if (directoryListing != null) {
		    for (File child : directoryListing) {
		      String filename = child.getName();	
		      available.add(filename);		      
//		      if(!al.contains(filename)) {
//		    	  child.delete();
//		    	  System.out.println("File Deleted: "+ filename);
//		    	  count ++;
//		      }
		    }
		  }
		  System.out.println("Size of available: "+ available.size());
		  System.out.println(count);
		  
		  Iterator<String> itr = al.iterator();
		  
			while(itr.hasNext()) {
				String name = itr.next();
				Iterator<String> avl = available.iterator();
				while(avl.hasNext()) {
					if(name.equals(avl.next())) {
						itr.remove();
					}
				}
			}
			
			System.out.println("Size of remaining: "+ al.size());
			
			itr = al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
	}
}
