package devices;

import java.util.ArrayList;

public class Phone extends Device {
    static final String appName = "Aplikacja";
    static final String appVersion = "1.0";
    static final String serverAddress = "urlbase";

    public ArrayList<Application> apps = new ArrayList<>();

    @Override
    public void turnOn() {
    }

    public boolean installAnnApp(String appName) {
    }

    public boolean installAnnApp(String appName, String appVersion) {
    }

    public boolean installAnnApp(String appName, String appVersion, String serverAddress) {
    }

    public double installAnnApp(double money, double appVersion, String appName, double appPrice) {
        var application = new Application();
        application.appVersion = appVersion;
        application.appName = appName;
        application.appPrice = appPrice;

        if (application.appPrice > money) {
            System.out.println("Wlasciciel telefonu nie ma dosc pieniedzy");
            return money;
        } else {
            this.apps.add(application);
            System.out.println("Wystarczylo pieniedzy na aplikacje");
            return money - application.appPrice;
        }
    }

    public boolean isAppInstalled(String appName) {
            if (appName.equals(appName)) {
                System.out.println("Aplikacja jest juz zainstalowana");
                return true;
            }
            else {
                System.out.println("Aplikacja nie jest zainstalowana");
                return false;
            }
    }

    public void freeApps() {
        for (int i=0 ; i < apps.size() ; i++) {
            if (apps.get(i).appPrice == 0) {
                System.out.println("Znalezione bezplatne aplikacje");
                System.out.println(apps.get(i).appName);
            }
        }
    }

    public void appsValue() {
        double appsValue = 0;
        for (int i = 0 ; i < apps.size() ; i++) {
            appsValue = appsValue + apps.get(i).appPrice;
            System.out.println("Wartosc aplikacji");
            System.out.println(appsValue);
        }
    }
}
