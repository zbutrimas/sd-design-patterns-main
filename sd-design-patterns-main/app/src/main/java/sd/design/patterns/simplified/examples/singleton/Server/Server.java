package sd.design.patterns.simplified.examples.singleton.Server;

import sd.design.patterns.simplified.examples.singleton.nonthreadsafe.Singleton;

public class Server {

    private static Singleton serverName;



    public static Singleton getInstance() {
        if (serverName == null) {
            serverName = new Singleton();
        }
        return serverName;
    }
    public String getDescription() {
        return "duplicated name is impossible";
    }
}

