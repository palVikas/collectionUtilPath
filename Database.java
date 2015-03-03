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
	public static Map<String,List<String>> map = new HashMap<String,List<String>>();
	public static Map<String,List<String>> CreateDatabase(){
		List<String> bangalore = new ArrayList<String>();
		List<String> singapore = new ArrayList<String>();
		List<String> seoul = new ArrayList<String>();
		List<String> beijing = new ArrayList<String>();
		bangalore.add("Singapore");
		singapore.add("Seoul");
		singapore.add("Dubai");
		seoul.add("Beijing");
		beijing.add("Tokyo");
		map.put("Bangalore", bangalore);
		map.put("Singapore", singapore);
		map.put("Seoul", seoul);
		map.put("Beijing", beijing);
		return map;
	}
}