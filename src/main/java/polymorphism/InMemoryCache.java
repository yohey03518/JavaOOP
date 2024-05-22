package polymorphism;


import com.google.gson.Gson;

import java.util.HashMap;

public class InMemoryCache {

    private final HashMap<String, String> stringStore;
    private final HashMap<String, String> objectStore;
    private final HashMap<String, Integer> intStore;
    private final Gson gson;

    public InMemoryCache()
    {
        stringStore = new HashMap<>();
        intStore = new HashMap<>();
        objectStore = new HashMap<>();
        gson = new Gson();
    }

    public void set(String key, String value) {
        stringStore.put(key, value);
    }
    public void set(String key, int value) {
        intStore.put(key, value);
    }
    public void set(String key, Object obj) {
        objectStore.put(key, gson.toJson(obj));
    }

    public <T> T get(String key, Class<T> type) {
        if (type == Integer.class) {
            return (T) intStore.get(key);
        }
        if (type == String.class) {
            return (T) stringStore.get(key);
        }
       String val = objectStore.get(key);
        return gson.fromJson(val, type);
    }
}

