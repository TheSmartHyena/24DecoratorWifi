public class Wifi {
    private String nom = "";
    private EProtocoles protocole;
    private String paswword = "";

    public Wifi(String nom, EProtocoles protocole, String password) {
        this.nom = nom;
        this.protocole = protocole;
        this.paswword = password;
    }

    public String getNom() {
        return this.nom;
    }

    public EProtocoles getProtocole() {
        return this.protocole;
    }

    public boolean connect(ConnexionDecorateur conector, String password) {
        return this.paswword == conector.connecter(password);
    }
}
