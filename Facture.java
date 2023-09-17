import java.time.Instant;
import java.util.List;
import java.util.Random;

public class Facture {
    private String numeroFact;
    private Instant dateInstant;
    private List<Achat> listAchats;

    public Facture(List<Achat> list){
        Random randit=new Random();
        this.numeroFact=randit.nextInt(100)+"DbMkea_Vente -X"+randit.nextInt(10);
        this.dateInstant=Instant.now();
        this.listAchats=list;
    }
    
    public String getNumeroFact(){
        return this.numeroFact;
    }

    public Instant getDateInstant(){
        return this.dateInstant;
    }

    public List<Achat> getListAchats(){
        return this.listAchats;
    }

    public void setNumeroFact(String numero){
        this.numeroFact=numero;
    }
    
    public void setListAchats(List<Achat> liste){
        this.listAchats=liste;
    }

    public List<Achat> ajouterAchat(Achat achat){
        for (Achat achat1 : listAchats) {
            if(achat.getArticle().getCode()==achat1.getArticle().getCode() && achat.getArticle().getDesignation()==achat1.getArticle().getDesignation()){
                return listAchats;
            }else{
                break;
            }
        }
        this.listAchats.add(achat);
        return this.listAchats;
    }

    public double montantTotalFacture(){
        double montantTotaux=0;
        for (Achat achat : listAchats) {
            montantTotaux+=achat.getArticle().getPrix()*achat.getQuantiteAchat();
        }
        return montantTotaux;
    }

    public void detailFacture(){
        System.out.println("     -----------------Gestion de boutique--------------------");
        System.out.println("                          Votre facture                       ");
        System.out.println("       Numero facture "+this.numeroFact+" date facture "+this.dateInstant);
        System.out.println("                         Liste des achats                     ");
        System.out.println("     Désignation          prix(en cfa)         quantité        prixTotal");
        for (Achat achat : listAchats) {
            System.out.println("     "+achat.getArticle().getDesignation()+"        "+achat.getArticle().getPrix()+"                   "+achat.getQuantiteAchat()+"              "+ (achat.getArticle().getPrix()*achat.getQuantiteAchat()));
        }
        System.out.println("       Montant de la Facture: "+montantTotalFacture());
    }
}
