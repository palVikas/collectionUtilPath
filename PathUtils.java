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
		return (getPath(from,to));
	}

	public static boolean getPath(String source,String destination){
		Set<String> cities = map.keySet();
		if(isCityPresent(source) && isCityPresent(destination)){

			if(map.get(source).contains(destination)){
				return true;
			}

			if(!map.get(source).contains(destination)){
				for(String city : cities){
					if(city.equals(source)) {
						List<String> lists = map.get(city);
						for(String list:lists){
							return getPath(list,destination);
						}
					}
				}
			}
		}
		return false;
	}

}