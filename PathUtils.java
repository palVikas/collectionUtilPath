import java.util.*;

public class PathUtils {

	public static Map<String,List<String>> map = Database.CreateDatabase();
	
	public static boolean isCityPresent(String city) {
		Set<String> keys = map.keySet();
		if(keys.contains(city))
			return true;
		else {
			for(String source : keys){
				List<String> destination = map.get(source);
				if(destination.contains(city))
					return true;
			}
		return false;
		}
	}

	public static boolean isDirectPath(String from,String to) {
		return map.get(from).contains(to) ;
	}

}