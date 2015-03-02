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
	public static Map<Source,Destination> map = new HashMap<Source,Destination>();
	public static Map<Source,Destination> CreateDatabase(){
		map.put(new Source("Bangalore"),new Destination("Singapore"));
		map.put(new Source("Singapore"),new Destination("Seoul"));
		map.put(new Source("Singapore"),new Destination("Dubai"));
		map.put(new Source("Seoul"),new Destination("Beijing"));
		map.put(new Source("Beijing"),new Destination("Tokyo"));
		return map;
	}
}