package collSSourc;

public class Review{
private String body;
private String author;
private int noOfStars;
public Review(String body,String author , int noOfStars){

    this.body = body;
    this.author= author;
    this.noOfStars=noOfStars;
}

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }
    public void tostringgg(){
        System.out.println(this.body);
        System.out.println(this.author);
        System.out.println(this.noOfStars);
    }
}
