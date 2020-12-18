package Day4;

public class checkedSingleton {

    private static volatile checkedSingleton instance;

    public static checkedSingleton getInstance() {
        if (instance == null) {
            synchronized (checkedSingleton.class) {
                if (instance == null) {
                    instance = new checkedSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        checkedSingleton single1 = new checkedSingleton();
        checkedSingleton single2 = new checkedSingleton();
        System.out.println(single1.getInstance() != single2.getInstance());
    }
}
