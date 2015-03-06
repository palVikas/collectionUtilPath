import java.util.*;

class Paths {
	public static void main(String[] args) {
		String source = args[0];
		String destination = args[1];
 		PathUtils paths = new PathUtils();
		if(!paths.isPresent(source)){
			System.out.println("No city named "+source+ " in database");
			return;
		}
		if(!paths.isPresent(destination)){
			System.out.println("No city named "+destination+ " in database");
			return;
		}
		else
			System.out.println(paths.getFullPath(source,destination));
	}
}