package test;

public abstract class Test {
	public abstract void initialiser() throws Exception;
	public abstract void terminer();
	public abstract void tester() throws Exception;
	
	protected static void verifierEquals(double d1, double d2, double p) throws Exception {
		if (d1 == d2) {
			return;
		}
		if (Math.abs(d1 - d2) >= p) {
			throw new Exception("BUG");
		}
	}
	
	protected static void verifierEquals(Object o1, Object o2) throws Exception {
		if (! o1.equals( o2)) {
			throw new Exception("BUG");
		}
	}
	
	protected static void verifierFalse(boolean b) throws Exception {
		if (b) {
			throw new Exception("BUG");
		}
	}

	protected static void verifierTrue(boolean b) throws Exception {
		verifierFalse(!b);
	}
}
