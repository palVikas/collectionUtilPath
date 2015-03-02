import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PathUtilsTest {
	@Test
	public void pathUtils_returns_true_if_direct_flight_between_Seoul_and_Beijing(){
 		PathUtils paths = new PathUtils();
 		assertTrue(paths.isPathMatch("Seoul", "Beijing"));
	}

	@Test
	public void pathUtils_returns_true_if_direct_flight_between_dubai_and_Beijing(){
 		PathUtils paths = new PathUtils();
 		assertTrue(paths.isPathMatch("Dubai", "Singapore"));
	}


}