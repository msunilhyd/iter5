package designPatterns;

public class SingletonExample {

    public static void main(String[] args) {


        SingletonSynchronized instance = SingletonSynchronized.getInstance();
        System.out.println(instance);

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
        System.out.println(instance1);

//        SingletonSynchronizedMethod instance = SingletonSynchronizedMethod.getInstance();
//        System.out.println(instance);
//
//        SingletonSynchronizedMethod instance1 = SingletonSynchronizedMethod.getInstance();
//        System.out.println(instance1);

//        Singleton instance = Singleton.getInstance();
//        System.out.println(instance);
//
//        Singleton instance1 = Singleton.getInstance();
//        System.out.println(instance1);

//        SingletonEager instance = SingletonEager.getInstance();
//        System.out.println(instance);
//
//        SingletonEager instance1 = SingletonEager.getInstance();
//        System.out.println(instance1);
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {};

    public static SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized(SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}
