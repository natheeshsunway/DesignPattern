//Used for Single instance
public class Singleton {
    public static Singleton instance;

    private Singleton() {
        //private is used for protect other people use the instance...
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
