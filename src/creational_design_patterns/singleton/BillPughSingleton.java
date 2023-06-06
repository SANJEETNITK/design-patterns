package creational_design_patterns.singleton;

/**
 * Bill Pugh was main force behind the java memory model changes.
 * His principle "Initialization-on-demand holder idiom" also uses the static block idea, but in a different way.
 * It suggests to use static inner class.
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
