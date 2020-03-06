package model;
public class Player {
    private String navn, email, telefon, scoringer, kontaktspiller;
    public Player(String navn){
        this.navn = navn;
    }
    @Override
    public String toString() {
        return "Player: " + navn;
    }
    public String getNavn() {
        return this.navn;
    }
    public String getemail() {
        return this.email;
    }
    public String gettelefon() {
        return this.telefon;
    }
    public String getscoringer() {
        return this.scoringer;
    }
    public String getkontaktspiller() {
        return this.kontaktspiller;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setScoringer(String scoringer) {
        this.scoringer = scoringer;
    }
    public void setKontaktspiller(String kontaktspiller) {
        this.kontaktspiller = kontaktspiller;
    }
}