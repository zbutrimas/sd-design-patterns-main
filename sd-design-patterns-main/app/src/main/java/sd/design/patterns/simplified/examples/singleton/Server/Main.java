package sd.design.patterns.simplified.examples.singleton.Server;

import sd.design.patterns.simplified.examples.singleton.nonthreadsafe.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
