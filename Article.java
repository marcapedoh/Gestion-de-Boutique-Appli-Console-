public class Article{
    private Integer idArticle=0;
    private String code;
    private String designation;
    private double prix;
    private Category category;
    private Integer quantiteStock;

    public Article(String code, String designation, double prix, Category category, int quantiteStock ){
        this.idArticle+=1;
        this.code=code;
        this.prix=prix;
        this.designation=designation;
        this.category=category;
        this.quantiteStock=quantiteStock;
    }

    public Integer getIdArticle(){
        return this.idArticle;
    }

    public String getCode(){
        return this.code;
    }

    public String getDesignation(){
        return this.designation;
    }

    public double getPrix(){
        return this.prix;
    }
    
    public Category getCategory(){
        return this.category;
    }

    public Integer getQuantiteStock(){
        return this.quantiteStock;
    }

    public void setIdArticle(Integer id){
        this.idArticle=id;
    }

    public void setCode(String code){
        this.code=code;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }

    public void setPrix(double prix){
        this.prix=prix;
    }
    public void setCategory(Category category){
        this.category=category;
    }

    public void setQuantiteStock(Integer quantiteStock){
        this.quantiteStock=quantiteStock;
    }

    public String afficher(){
        return "idArticle: "+this.idArticle+"\ncode: "+this.code+"\ndesignation: "+this.designation+"\nprix: "+this.prix+"\nidCategory: "+this.category.getId()+"\nCategoryDesignation: "+this.category.getDesignation()+"\nquantité Stock: "+this.quantiteStock;
    }

    public boolean comparer(Article article1){
        if(this.code==article1.code && this.designation==article1.designation && this.prix==article1.prix){
            return true;
        }
        return false;
    }

}
