import java.io.*;
import java.util.*;


class ReadFile{
	public String readFile(String fileName) {
		String text = null;
		File file = new File(fileName); 
		try {
			FileReader reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			text = new String(chars);
			reader.close();
		} catch (IOException e) {
			System.out.println("Something went wrong.......");
		}

  	 return text;
	}
	
}

