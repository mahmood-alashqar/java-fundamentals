package Inheritance.com;

public class Restaurant {
    private String name;
    private int noOfStars;
    private String priceCategory;
    public Restaurant(String name ,int noOfStars ,String priceCategory){
        this.name=name;
        this.noOfStars=noOfStars;
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
}
