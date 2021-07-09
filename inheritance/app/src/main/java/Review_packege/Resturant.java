package Review_packege;

import java.util.ArrayList;
import java.util.HashMap;

public class Resturant<T> extends Review implements outputInterface {
    private String name;
    private int noOfStars;
    private String priceCategory;
    HashMap<String, ArrayList<String>> clientRev=new HashMap<>();
    ArrayList<String> myrev= new ArrayList<>();
    public Resturant(String body, String author, int stars) {
        super(body, author, stars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }
    public String tostring(){
        String result;
        result= "the Restaurant "+this.name + " has " +this.noOfStars +"  stars  " + this.priceCategory +" $";
        return  result;
    }
    public Object addReview(Review review){
        myrev.add(review.getAuthor());
        myrev.add(review.getBody());
        myrev.add(String.valueOf(review.getStars()));
        return null;
    }

    @Override
    public void output() {
        clientRev.put(this.name,myrev);
        System.out.println(clientRev);
    }
}
