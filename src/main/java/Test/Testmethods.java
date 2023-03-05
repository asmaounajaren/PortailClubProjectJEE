package Test;

import Database.AbonnementDAO;
import Database.ContactDao;
import Database.inscriptionDao;
import Model.Abonnement;
import Model.Contact;
import Model.Membre;
import Model.inscription;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Testmethods {
    public static void main(String[] args) throws ClassNotFoundException {
        AbonnementDAO ab=new AbonnementDAO();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String d = sdf.format("2023-03-1");
        int r=ab.Ajouter(new Abonnement("Abonnement prem","Accès aux cours VIRTUAL TRAINING,overall results",150.00));


        if(r>0) System.out.println("bien ajouter ab");
        else System.out.println("echec");


        ArrayList<Abonnement> ls= ab.getList(1);
        for (Abonnement abn:ls) {
            System.out.println("item "+abn);
        }
////        Contact c=new Contact(3,"asma","asma@gmail.com","heeeee","0600000");
////        ContactDao contactDao= new ContactDao();
////        int n=contactDao.registerEmployee(c);
////        if(n>0) System.out.println("bien ajouter");
////        else System.out.println("echec");
//
//        inscription user =new inscription();
//        user.setFirstName("asma");
//        user.setPassword("1234");
//        user.setEmail("saama@gmail.com");
//        inscriptionDao inscriptionDao=new inscriptionDao();
//        int i=inscriptionDao.registerEmployee(user);
//        if(i>0) System.out.println("bien ajouter");
//        else System.out.println("echec");
    }
}
