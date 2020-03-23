public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, Boolean aware) {
        this.firstname = firstname; 
        this.aware = aware;
    }
    // Getters // 
    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }
    // Setters // 
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    } 

    public String whoIam() {
        if (this.isAware()) {
            return "Je m'appelle " + getFirstName() + " et je suis aware"; 
        } 
        else {
            return "Je m'appelle " + getFirstName() + " et je ne suis pas aware";
        }

    }


}
