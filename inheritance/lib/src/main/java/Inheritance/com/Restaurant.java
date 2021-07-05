package Inheritance.com;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    public String name;
    private int noOfStars;
    private String priceCategory;
    public Restaurant(String name ,int noOfStars ,String priceCategory){
        this.name=name;
        this.noOfStars=noOfStars;
        this.priceCategory=priceCategory;
    }

    public Restaurant(int noOfStars) {

        this.noOfStars=noOfStars;
    }
    public Restaurant(String priceCategory) {

        this.priceCategory=priceCategory;
    }

    // dont forget to put tostring method
    public String toString(){
      System.out.println(this.name);
      System.out.println(this.noOfStars);
      System.out.println(this.priceCategory);
return "";
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

    /**
     *
     * @param "object" from review
     */
    public void addReview(Review review){
        HashMap<String, ArrayList<String>> allreviews = new HashMap<>();
        ArrayList<String> rev = new ArrayList<>();
        review.setName(this.name);
       rev.add(String.valueOf(review.getNoOfStars()));
       rev.add(review.getAuthor());
       rev.add(review.getBody());
       rev.add(getPriceCategory());
        System.out.println(this.noOfStars);
       allreviews.put(this.name,rev);
       System.out.println(allreviews);
    }
}
