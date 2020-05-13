package au.org.suqld;

import java.util.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static List<String> words() {
        List<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("world!");
        return words;
    }

    public static void main( String[] args )
    {
        List<String> words = words();
        System.out.println(String.join(" ", words));
    }
}
