/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Review_packege;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Review rev1 = new Resturant("judy","good",5);
        Resturant reviewCasting = (Resturant) rev1;
        reviewCasting.setName("shawarmaji");
        reviewCasting.addReview(rev1);
        reviewCasting.output();
        System.out.println(reviewCasting.tostring());

    }
}
