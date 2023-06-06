package Chapter_05_SINGLETON.JavaSingleton.Classic;

public class SingletonClient {
    public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
