/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package collSSourc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Resturant res = new Resturant("Zanjbeel",7,"$$");
        Review rev = new Review("its goood","judy",7);
        Resturant res1 = new Resturant("its goood","judy",7);
        Resturant castingObj = (Resturant) res1;
        System.out.println("//////////");
castingObj.setName("nnn");
castingObj.
        castingObj.tostringgg();
        castingObj.tostringg();
        // Review rev2 = (Review) rev1;
        //    Restaurant rev1 = new Review(" very goood", "Qusai Alamarat",5 );


    }


}