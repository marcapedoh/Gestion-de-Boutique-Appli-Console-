import java.util.List;

public class Category {
    private Integer id=0;
    private String code;
    private String designation;
    private List<Article> lArticles;

    public Category(String code, String designation){
        this.id+=1;
        this.code=code;
        this.designation=designation;
    }

    public Integer getId(){
        return this.id;
    }
    
    public String getCode(){
        return this.code;
    }

    public String getDesignation(){
        return this.designation;
    }

    public List<Article> getLArticles(){
        return this.lArticles;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public void setCode(String code){
        this.code=code;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }

    public void setLArticles(List<Article> lArticles){
        this.lArticles=lArticles;
    }
}
