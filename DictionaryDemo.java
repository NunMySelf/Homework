package miniproject;

/**
 *
 * @author Sakdinan Khamnang   5907101013
 */
public class DictionaryDeMo 
{
     private String key;
    private String value;
    

    DictionaryDeMo(String key, String value) {
        this.key = key;
        this.value = value;
        
    }

    public String getKey() {
        return this.key;
    }

    public String getValue(String key) {
        // use string key to move down linked list in case of collision
        // haven't implemented this yet
        return this.value;
    }
}
