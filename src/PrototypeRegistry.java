//If 1000+ copy of object is needed, giving clonable object with different object address, LIKE DEEP COPY

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<ClassType, Item> itemMap = new HashMap<ClassType, Item>();

    public PrototypeRegistry() {
        loadData();
    }

    private void loadData() {
        Movie movie = new Movie();
        movie.setTitle("Thiruvilaiyadal");
        movie.setUrl("defaultUrl");
        movie.setPrice("defaultPrice");
        movie.setRuntime(2);

        itemMap.put(ClassType.Movie, movie);

        Book book = new Book();
        book.setTitle("Thiruvilaiyadal");
        book.setUrl("defaultUrl");
        book.setPrice("defaultPrice");
        book.setGetNumberOfPage(20);
        itemMap.put(ClassType.Book, book);
    }

    public Item createItem(ClassType classType) {
        Item item = null;
        try {
            item =(Item) itemMap.get(classType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}
