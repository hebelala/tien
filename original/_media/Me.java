public class Me {

	private volatile static Helper helper;

	static {
		newHelper();
	}

	private static void newHelper() {
		helper = new Helper() {
			private volatile Me singleton;

			@Override
			public Me getTheOne() {
				synchronized (this) {
					if (singleton == null) {
						singleton = new Me();
					}
					helper = new Helper() {

						@Override
						public Me getTheOne() {
							return singleton;
						}
					};
					return singleton;
				}
			}
		};
	}

	private interface Helper {
		Me getTheOne();
	}

	public static Me callMe() {
		return helper.getTheOne();
	}

	public static void killMe() {
		callMe().kill();
	}

	public synchronized static void reborn() {
		killMe();
		newHelper();
	}

	private boolean alive;

	public void kill() {
		alive = false;
	}

	public boolean isAliave() {
		return alive;
	}

}
