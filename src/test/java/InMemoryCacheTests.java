import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import polymorphism.InMemoryCache;

public class InMemoryCacheTests {

    @Test
    public void int_set_get()
    {
        InMemoryCache inMemoryCache = new InMemoryCache();
        inMemoryCache.set("key", 123);

        int result = inMemoryCache.get("key", Integer.class);

        assertEquals(123, result);
    }

    @Test
    public void string_set_get()
    {
        InMemoryCache inMemoryCache = new InMemoryCache();
        inMemoryCache.set("key", "abc");

        String result = inMemoryCache.get("key", String.class);

        assertEquals("abc", result);
    }

    @Test
    public void object_set_get()
    {
        InMemoryCache inMemoryCache = new InMemoryCache();
        MyData obj = new MyData();
        obj.Text1 = "cba";
        inMemoryCache.set("key", obj);

        MyData result = inMemoryCache.get("key", MyData.class);

        assertEquals("cba", result.Text1);
    }
}
