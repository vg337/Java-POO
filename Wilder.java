public class Wilder {

    // attributs
    private String firstName;
    private boolean aware;

    // constructeurs
    public Wilder(String firstName) {
        this.firstName = firstName;
        this.aware = true;
    }

    // méthode statique
    public static String bonus() {
        return "42!";
    }

    // méthode instanciée
    public String whoAmI() {
        if (this.isAware()){
            return "Je m'appelle " + this.getName() + " et je suis aware.";
        }
        else {
            return "Je m'appelle " + this.getName() + " et je ne suis pas aware.";
        }
    }
    
    // accesseurs (getters)
    public String getName() {
        return this.firstName;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // mutateurs (setters)
    
    public void setName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}