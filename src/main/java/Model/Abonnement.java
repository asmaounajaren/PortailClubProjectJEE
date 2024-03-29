package Model;

import java.io.Serializable;
import java.util.Date;

public class Abonnement implements Serializable {

    private  int code_abonnement;
    private String libelle;
    private String description_abonnement;
    private double tarif;
    private String date_debut;
    private String date_fin;
    private  boolean etat;
    public Abonnement(){}
    public Abonnement(String libelle, String description_abonnement, double tarif, String date_debut, String date_fin) {
        this.libelle = libelle;
        this.description_abonnement = description_abonnement;
        this.tarif = tarif;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public int getCode_abonnement() {
        return code_abonnement;
    }

    public void setCode_abonnement(int code_abonnement) {
        this.code_abonnement = code_abonnement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription_abonnement() {
        return description_abonnement;
    }

    public void setDescription_abonnement(String description_abonnement) {
        this.description_abonnement = description_abonnement;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Abonnement{" +
                "code_abonnement=" + code_abonnement +
                ", libelle='" + libelle + '\'' +
                ", description_abonnement='" + description_abonnement + '\'' +
                ", tarif=" + tarif +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                ", etat=" + etat +
                '}';
    }

    public Abonnement( String libelle, String description_abonnement, double tarif) {
        this.libelle = libelle;
        this.description_abonnement = description_abonnement;
        this.tarif = tarif;
//        this.date_debut = date_debut;
//        this.date_fin = date_fin;
    }
}
