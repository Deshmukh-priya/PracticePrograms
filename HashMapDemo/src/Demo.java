
import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {

		// Create a HashMap object called people
		HashMap<String, Integer> people = new HashMap<String, Integer>();


		// keys and values (Name, Age)
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);
		//people.remove("John");

		for (String i : people.keySet()) {
			System.out.println("key: " + i + " value: " + people.get(i));
		}
		for(int value:people.values()) {
			System.out.println(value);
		}
		for(String key:people.keySet()) {
			System.out.println(key);
		}

		System.out.println(people.size());
	}
}