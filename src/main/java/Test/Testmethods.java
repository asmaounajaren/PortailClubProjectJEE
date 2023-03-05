package Test;

import Controller.AbonnementController;
import Model.Abonnement;

import java.util.ArrayList;
import java.util.Date;

public class Testmethods {
    public static void main(String[] args){
        Abonnement abnm=  AbonnementController.Ajouter(new Abonnement("Abonnement prem","Accès aux cours VIRTUAL TRAINING,overall results",150,new Date("03/03/2023"),new Date("04/03/2023")));
        Abonnement abnm2= AbonnementController.Ajouter(new Abonnement("Abonnement basic","Accès aux cours VIRTUAL TRAINING,overall results",150,new Date("03/02/2023"),new Date("03/03/2023")));

        System.out.println(abnm);
        System.out.println(abnm2);

        ArrayList<Abonnement> ls= AbonnementController.getList();
        for (Abonnement ab:ls) {
            System.out.println("item"+ab);
        }
    }
}
