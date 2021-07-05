package collSSourc;
import java.lang.Math;
public class Resturant extends Review {
    private static final String body="" ;
    private static final String author=""  ;
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    private int noOfStars;
    private String priceCategoty;

    public Resturant(String body, String author, int noOfStars) {
        super(body, author, noOfStars);
    }
    public Resturant(String name,int noOfStars,String priceCategoty){
        super(body, author, noOfStars);

        this.name = name;
        this.noOfStars=noOfStars;
        this.priceCategoty=priceCategoty;
    }


//
//    public Resturant(String name, int noOfStars, String priceCategoty) {
//        this.name = name;
//        this.noOfStars = noOfStars;
//        this.priceCategoty = priceCategoty;
//    }



    public String getName() {
        return name;
    }

    public int getNoOfStars() {

        return noOfStars;
    }

    public void setNoOfStars(int noOfStars) {
        if(noOfStars>0 || noOfStars<6){
            this.noOfStars = noOfStars;
        }
        else {
            int range = (5 - 0) + 1;
            noOfStars=  (int)(Math.random() * range) + 0;

        }

    }

    public String getPriceCategoty() {
        return priceCategoty;
    }

    public void setPriceCategoty(String priceCategoty) {
        this.priceCategoty = priceCategoty;
    }
    public void tostringg(){
        System.out.println(this.name);
        System.out.println(this.noOfStars);
        System.out.println(this.priceCategoty);


    }
}
