package Model;

import java.io.Serializable;
import java.util.Collection;

public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    private String libProduit;
    private String image;
    private int prix;
    private int qteStock;
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Produit() {
    }

    public String getLibProduit() {
        return libProduit;
    }

    public void setLibProduit(String libProduit) {
        this.libProduit = libProduit;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

}