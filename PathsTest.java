import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class PathsTest {
    @Test
    public void test_isCityPresent_gives_true_for_bangalore(){
        Paths path = new Paths();
        assertTrue(path.isCityPresent("bangalore"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_singapore(){
        Paths path = new Paths();
        assertTrue(path.isCityPresent("singapore"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_tokyo(){
        Paths path = new Paths();
        assertTrue(path.isCityPresent("tokyo"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_beijing(){
        Paths path = new Paths();
        assertTrue(path.isCityPresent("beijing"));
    }
}