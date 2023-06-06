package creational_design_patterns.singleton;

import java.io.Serializable;


/**
 * Possibly this is the best approach to create a singleton class which ensures only one instance of a class in the whole application in all scenarios.
 */
public class DemoSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private DemoSingleton() {
        // private constructor
    }

    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }

    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
