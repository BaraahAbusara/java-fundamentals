package inheritance;
import java.util.ArrayList;

public class Restaurant extends Company{

    private String priceCategory ;// and a price category (i.e. number of dollar signs).

    public Restaurant(String name, String priceCategory) { //Implement a Restaurant constructor.
        super(name);
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + this.getName() + '\'' +
                ", stars=" + this.getStars() +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + this.getReviews() +
                '}';
    }


}
