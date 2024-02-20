public class Main {
    public static void main(String[] args) {
        Wifi wifi = new Wifi("Tata", EProtocoles.WPA2, "Toto");
        ConnexionDecorateur wep = new ConnectorWEP(EProtocoles.WEP);
        ConnexionDecorateur wpa = new ConnectorWPA(EProtocoles.WPA);
        ConnexionDecorateur wpa2 = new ConnectorWPA2(EProtocoles.WPA2);

        Appareil iPhone = new Appareil();
        iPhone.addConnector(wep);
        iPhone.addConnector(wpa);
        iPhone.addConnector(wpa2);
        iPhone.addWifi(wifi);

        iPhone.connectToWifi("Tata", "Toto");
    }
}