import java.util.HashMap;
import java.util.HashSet;

public class HashMaps {
    public static void main(String[] args) {

        int a = 10;
        int b = 33;

        // HashMap
        HashMap<String, Integer> happy = new HashMap<>();
        happy.put("a", 10);
        happy.put("b", 33);

        System.out.println(happy); // prints out HashMap
        System.out.println(happy.get("a")); // can get value by inputting key

        HashMap<String, String> login = new HashMap<>();

        // user info
        login.put("LMiller2002", "cat123");
        login.put("jrMiller", "cat3");
        login.put("LMiller0116", "cat");

        login.remove("jrMiller"); // removes user and password from HashMap

        System.out.println(login.containsKey("LMiller2002")); // see if key is in HashMap return true, otherwise false
        System.out.println(login.containsKey("jrMiller"));
        System.out.println(login.containsValue("cat")); // see if value is in HashMap true, otherwise false

        // System.out.println(login.size()); // get size of HashMap

        // System.out.println(login.replace("LMiller0116", "dog")); // replace key and value from HashMap

        System.out.println(login.values()); // get all values in HashMap
        System.out.println(login.keySet()); // get all keys in HashMap

        System.out.println(login); // prints all user info
    }
}
