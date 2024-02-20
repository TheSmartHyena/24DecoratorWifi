import java.util.HashMap;

public class Appareil {
    private HashMap<EProtocoles, ConnexionDecorateur> connectorList = new HashMap<EProtocoles, ConnexionDecorateur>();
    private HashMap<String, Wifi> wifiList = new HashMap<String, Wifi>();

    private String wifiConnected = "";

    public void addConnector(ConnexionDecorateur item) {
        this.connectorList.put(item.getProtocole(), item);
    }

    public void addWifi(Wifi item) {
        this.wifiList.put(item.getNom(), item);
    }

    public void connectToWifi(String nom, String password) {
        if (this.wifiList.containsKey(nom)) {
            Wifi wifi = this.wifiList.get(nom);
            if (this.connectorList.containsKey(wifi.getProtocole())) {
                if (wifi.connect(this.connectorList.get(wifi.getProtocole()), password)) {
                    this.wifiConnected = nom;
                    System.out.println("La connexion est effectué");
                }else {
                    System.out.println("Le mot de passe est incorrect");
                }
            }else {
                System.out.println("L'appareil n'est pas compatible avec le wifi demandé");
            }
        } else {
            System.out.println("Le wifi demandé n'existe pas");
        }
    }
}
