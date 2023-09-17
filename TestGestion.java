import java.util.ArrayList;
import java.util.List;

public class TestGestion {
    public static void main(String[] args){
        Category c1=new Category("informatique", "ordinateur");
        Category c2=new Category("Telephone", "Samsung");
        //Category c3=new Category("Serveur", "Cisco");
        Article pcAcer=new Article("IT-Tools", "Acer Aspire 5", 350000, c1, 10);
        Article myPhone=new Article("Mobile", "Samsung Galaxy A40", 110000, c2, 32);
        Achat achatPc=new Achat(pcAcer, 1);
        Achat achatPhone= new Achat(myPhone, 2);
        achatPc.modifierQuantite(5);
        List achatList= new ArrayList<>();
        achatList.add(achatPc);
        achatList.add(achatPhone);
        Facture facture1= new Facture(achatList);
        facture1.detailFacture();
    }
}
