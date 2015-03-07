import java.util.*;

public class PathUtils {

	private Map<String,List<String>> map = new HashMap<String,List<String>>();

	public PathUtils(String content){
		this.map = Database.pathStoreInDb(content);
	}

	Queue<String> path = new LinkedList<String>();

	public boolean isCityPresent(String city) {
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

	public boolean isDirectPath(String from,String to) {
			path.add(from);
		return (getPath(from,to));
	}

	public boolean getPath(String source,String destination){
		Set<String> cities = map.keySet();
		if(isCityPresent(source) && isCityPresent(destination)){

			if(map.get(source).contains(destination)){
				path.add(destination);
				return true;
			}

			if(!map.get(source).contains(destination)){
				for(String city : cities){
					if(city.equals(source)) {
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
		}
		return false;
	}

	public String getFullPath(String from,String to) {
		String fullpath = ""; 
		isDirectPath(from,to);
		int length = path.size();
		for(int i=0;i<length;i++){
			if(i==0)
				fullpath +=""+path.poll();
			else
				fullpath +="-->"+path.poll();
		}
		return fullpath;
	}

}