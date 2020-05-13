package au.org.suqld;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testWords()
    {
        List<String> words = App.words();
        assert(words.size() == 2);
    }
}
