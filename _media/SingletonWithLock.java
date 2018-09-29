public class SingletonWithLock {
	
	private static SingletonWithLock instance;
	
	public static SingletonWithLock getInstance() {
		if(instance == null) {
			synchronized (SingletonWithLock.class) {
				if(instance == null) {
					instance = new SingletonWithLock();
				}
			}
		}
		return instance;
	}

}
