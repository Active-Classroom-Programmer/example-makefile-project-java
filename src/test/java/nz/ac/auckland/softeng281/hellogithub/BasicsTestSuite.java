package nz.ac.auckland.softeng281.hellogithub;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import nz.ac.auckland.softeng281.hellogithub.Basics;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@SuiteClasses({
	BasicsTestSuite.BasicTest.class
})

public class BasicsTestSuite {

	@FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public static class BasicTest {
        
        @Test
        public void testMinimum() {
            assertEquals(-3, Basics.min(-3, 2));
            assertEquals(0, Basics.min(0, 0));
            assertEquals(0, Basics.min(0, 7));
            assertEquals(0, Basics.min(5, 0));
            assertEquals(12, Basics.min(29, 12));
            assertEquals(-87, Basics.min(-32, -87));
            assertEquals(25, Basics.min(25, 92));
        }
        
        @Test
        public void testMaximum() {
            assertEquals(2, Basics.max(-3, 2));
            assertEquals(0, Basics.max(0, 0));
            assertEquals(7, Basics.max(0, 7));
            assertEquals(5, Basics.max(5, 0));
            assertEquals(29, Basics.max(29, 12));
            assertEquals(-32, Basics.max(-32, -87));
            assertEquals(92, Basics.max(25, 92));
        }
        
    }

}

