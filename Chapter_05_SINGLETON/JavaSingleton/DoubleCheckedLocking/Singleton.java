package Chapter_05_SINGLETON.JavaSingleton.DoubleCheckedLocking;

public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

    public String getDescription() {
		return "I'm a double-checked locking Singleton!";
	}
}
