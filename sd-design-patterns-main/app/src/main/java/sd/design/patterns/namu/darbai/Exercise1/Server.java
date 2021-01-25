package sd.design.patterns.namu.darbai.Exercise1;

import sd.design.patterns.all.examples.singleton.chocolate.ChocolateBoiler;

public class Server {
    private boolean http;
    private boolean https;
    private static Server serverAddress;

    private Server() {
        http = true;
        https = true;
    }
    public static Server getInstance() {
        if (serverAddress == null) {
            System.out.println("Server has been added to the list");
            serverAddress = new Server();
        }
        System.out.println("Duplicated name is impossible");
        return serverAddress;
    }
    public void serverImposible() {
        if(isHttp() && isHttps()) {
            http = false;
            https = false;
        }
    }
    public boolean isHttp() {
        return http;
    }

    public boolean isHttps() {
        return https;
    }
}
