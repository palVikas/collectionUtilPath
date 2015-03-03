import java.util.*;

public class PathUtils {

	public static Map<String,List<String>> map = Database.CreateDatabase();

	public static List<String> path = new ArrayList<String>();
	
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
		path.add(from);
		return (getPath(from,to) == 1);
	}

	public static int getPath(String source,String destination){
		Set<String> cities = map.keySet();
		if(map.get(source).contains(destination)){
			path.add(destination);
			return 1;
		}

		if(!map.get(source).contains(destination)){
			for(String city : cities){
				if(city == source) {
					List<String> lists = map.get(city);
					for(String list:lists){
						if(!path.contains(list)){
							path.add(list);
							return getPath(list,destination);
						}
					}
				}
			}
		}
		return 0;
	}

}