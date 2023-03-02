package Model;

import java.io.Serializable;

public class Commande implements Serializable {
    private Integer idCmd;
    private String dateCmd;
    private Utilisateur client;
}
