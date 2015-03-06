import java.util.*;

class Source{
	public String source;
	public Source(String source){
		this.source = source;
	}
	public String toString(){
		return source;
	}
	public boolean equals(Object other) {
		return source.equals(((Source) other).source);
	}
	public int hashCode(){
		return source.hashCode();
	}
}

class Destination{
	public String destination;

	public Destination(String destination){
		this.destination = destination;
	}

	public String toString(){
		return destination;
	};
	public boolean equals(Object other) {
		return destination.equals(((Destination) other).destination);
	}
	public int hashCode(){
		return destination.hashCode();
	}

}

class Database{
	public static Map<String,List<String>> pathStoreInDb(String line){
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		String[] lines = line.split("\r\n");
		for(String singleLine:lines){
			String path[] = singleLine.split(",");
			List<String> destinations = map.get(path[0]);
			if(destinations == null){
				destinations = new ArrayList<String>();
				destinations.add(path[1]);				
				map.put(path[0],destinations);
			}
			else{
				destinations.add(path[1]);
			}
		}
		return map;
	}

}

