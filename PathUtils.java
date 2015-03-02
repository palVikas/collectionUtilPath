import java.util.*;

public class PathUtils {
	public static Map<Source,Destination> map = Database.CreateDatabase();
	
	public static boolean isPathMatch(String src,String dest) {
		Set<Source> keys = map.keySet();
		if(keys.contains(new Source(src)))
			return true;
		else {
			for(Source source : keys){
				String destination = map.get(source).toString();
				if(dest == destination)
					return true;
			}
		return false;
		}
	}
}