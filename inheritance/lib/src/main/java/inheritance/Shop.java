package inheritance;

public class Shop extends Company{
    private String priceCategory ;
    private String description;

    public Shop(String name,String priceCategory,String description) {
        super(name);
        this.priceCategory = priceCategory;
        this.description= description;
    }

    @Override
    public String toString() {
        return "Shop{" +"name='" + this.getName() + '\'' +
                ", stars=" + this.getStars() + '\'' +
                "priceCategory='" + priceCategory + '\'' +
                ", description='" + description + '\'' +
                ", reviews=" + this.getReviews() +
                '}';
    }
}
