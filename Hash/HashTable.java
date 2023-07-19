import java.util.Hashtable;
import java.util.Map;
public class HashTable {
    public static void main(String[] args) {

        Map<Integer,String> studentData = new Hashtable<>();
        studentData.put(1,"Ram");
        studentData.put(2, "Shiva");
        studentData.put(3,"Rakesh");
        studentData.put(4,"Mohit");
        studentData.put(5,"Suresh");


        int searchIndex = 2;
        String outputName = studentData.get(searchIndex);
        System.out.println(outputName);

    }    
}





// put(K key, V value): Inserts a key-value mapping into the Hashtable. If the key already exists, the value is overwritten.

// get(Object key): Retrieves the value associated with the specified key. Returns null if the key is not found.

// containsKey(Object key): Checks if the Hashtable contains the specified key. Returns true if the key is found.

// containsValue(Object value): Checks if the Hashtable contains the specified value. Returns true if the value is found.

// remove(Object key): Removes the key-value mapping associated with the specified key from the Hashtable.

// size(): Returns the number of key-value mappings in the Hashtable.

// isEmpty(): Checks if the Hashtable is empty. Returns true if the Hashtable contains no mappings.
