package com.paths;

import static org.junit.Assert.*;
import org.junit.Test;


public class PathsTest {
    @Test
    public void test_isCityPresent_gives_true_for_bangalore(){
        Paths path=new Paths();
        assertTrue(path.isCityPresent("bangalore"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_singapore(){
        Paths path=new Paths();
        assertTrue(path.isCityPresent("singapore"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_tokyo(){
        Paths path=new Paths();
        assertTrue(path.isCityPresent("tokyo"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_beijing(){
        Paths path=new Paths();
        assertTrue(path.isCityPresent("beijing"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_seoul(){
        Paths path=new Paths();
        assertTrue(path.isCityPresent("seoul"));
    }

    @Test
    public void test_isCityPresent_gives_true_for_dubai(){
        Paths path=new Paths();
        assertTrue(path.isCityPresent("dubai"));
    }

    @Test
    public void test_isCityPresent_gives_false_for_bakari(){
        Paths path=new Paths();
        assertFalse(path.isCityPresent("bakari"));
    }

    @Test
    public void test_isCityPresent_gives_false_for_newZeland(){
        Paths path=new Paths();
        assertFalse(path.isCityPresent("newZeland"));
    }

    @Test
    public void test_isCityPresent_gives_false_for_chennai(){
        Paths path=new Paths();
        assertFalse(path.isCityPresent("chennai"));
    }

    @Test
    public void test_hasDirectPath_gives_true_for_bangalore_to_singapore(){
        Paths path=new Paths();
        assertTrue(path.hasDirectPath("bangalore","singapore"));
    }

    @Test
    public void test_hasDirectPath_gives_true_for_singapore_to_seoul(){
        Paths path=new Paths();
        assertTrue(path.hasDirectPath("singapore","seoul"));
    }

    @Test
    public void test_hasDirectPath_gives_true_for_singapore_to_bangalore(){
        Paths path=new Paths();
        assertTrue(path.hasDirectPath("singapore","bangalore"));
    }

    @Test
    public void test_hasDirectPath_gives_true_for_seoul_to_beijing(){
        Paths path=new Paths();
        assertTrue(path.hasDirectPath("seoul","beijing"));
    }

    @Test
    public void test_hasDirectPath_gives_true_for_beijing_to_tokyo(){
        Paths path=new Paths();
        assertTrue(path.hasDirectPath("beijing","tokyo"));
    }

    @Test
    public void test_hasDirectPath_gives_true_for_tokyo_to_beijing(){
        Paths path=new Paths();
        assertTrue(path.hasDirectPath("tokyo","beijing"));
    }

    @Test
    public void test_hasDirectPath_gives_false_for_dubai_to_mumbai(){
        Paths path=new Paths();
        assertFalse(path.hasDirectPath("dubai","mumbai"));
    }

    @Test
    public void test_hasDirectPath_gives_false_for_karanchi_to_islamabad(){
        Paths path=new Paths();
        assertFalse(path.hasDirectPath("karachi","islamabad"));
    }

    @Test
    public void test_hasDirectPath_gives_false_for_bangalore_to_rampur(){
        Paths path=new Paths();
        assertFalse(path.hasDirectPath("bangalore","rampur"));
    }

    @Test
    public void test_hasDirectPath_gives_false_for_bakari_to_tiger(){
        Paths path=new Paths();
        assertFalse(path.hasDirectPath("bakari","tiger"));
    }

    @Test
    public void test_hasDirectPath_gives_false_for_india_to_america(){
        Paths path=new Paths();
        assertFalse(path.hasDirectPath("india","america"));
    }
}