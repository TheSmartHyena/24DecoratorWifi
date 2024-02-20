public abstract class ConnexionDecorateur {
    protected EProtocoles protocole;

    public ConnexionDecorateur(EProtocoles protocole) {
        this.protocole = protocole;
    }

    public EProtocoles getProtocole() {
        return this.protocole;
    }

    public String connecter(String password) {
        return password;
    }
}
