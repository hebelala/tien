public class SingletonWithNoLock {

	private static class Holder {
		static SingletonWithNoLock instance = new SingletonWithNoLock();
	}

	public static SingletonWithNoLock getInstance() {
		return Holder.instance;
	}

}
