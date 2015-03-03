import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PathUtilsTest {
	@Test
	public void pathUtils_returns_true_if__Seoul_is_present_in_database(){
 		PathUtils paths = new PathUtils();
 		assertTrue(paths.isCityPresent("Seoul"));
	}

	@Test
	public void pathUtils_returns_true_if__dubai_is_present_in_database(){
 		PathUtils paths = new PathUtils();
 		assertTrue(paths.isCityPresent("Dubai"));
	}

	@Test
	public void pathUtils_returns_false_if__India_is_not_in_database(){
 		PathUtils paths = new PathUtils();
 		assertFalse(paths.isCityPresent("India"));
	}

	@Test
	public void isDirectpath_returns_true_if_direct_flight_between_seoul_to_bejing(){
 		PathUtils paths = new PathUtils();
 		assertTrue(paths.isDirectPath("Seoul", "Beijing"));
	}

	@Test
	public void isDirectpath_returns_true_if_direct_flight_between_Singapore_to_Dubai(){
 		PathUtils paths = new PathUtils();
 		assertTrue(paths.isDirectPath("Singapore","Dubai"));
	}

	@Test
	public void isDirectpath_returns_false_if_no_direct_flight_between_Singapore_to_Chennai(){
 		PathUtils paths = new PathUtils();
 		assertFalse(paths.isDirectPath("Singapore","Chennai"));
	}
}