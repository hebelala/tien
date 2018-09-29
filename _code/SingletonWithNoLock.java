public class SingletonWithNoLock {

	private static class holder {
		static SingletonWithNoLock instance = new SingletonWithNoLock();
	}

	public static SingletonWithNoLock getInstance() {
		return holder.instance;
	}

}
