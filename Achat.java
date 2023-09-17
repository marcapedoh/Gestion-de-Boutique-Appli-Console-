
import java.util.Random;

public class Achat {
    private String numberAchat;
    private Article Article;
    private Integer quantiteAchat;

    public Achat(Article Article, Integer quantiteAchat){
        Random randit= new Random();
        this.numberAchat=randit.nextInt(100)+"DbMkea -X"+randit.nextInt(10);
        this.Article=Article;
        this.quantiteAchat=quantiteAchat;
    }

    public String getNumberAchat(){
        return this.numberAchat;
    }
    public Article getArticle(){
        return this.Article;
    }

    public int getQuantiteAchat(){
        return this.quantiteAchat;
    }

    public void setNumberAchat(String nuumberAchat){
        this.numberAchat=nuumberAchat;
    }
    public void setListArticles(Article Article){
        this.Article=Article;
    }

    public Integer modifierQuantite(Integer quantite){
        if(quantite<0 || quantite ==0){
            return this.quantiteAchat;
        }
        return this.quantiteAchat=quantite;
    }
}
