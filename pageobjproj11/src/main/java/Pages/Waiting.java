package Pages;

public class Waiting {
    public static void delay(int n){
        try
        {
            Thread.sleep(n);
        }
        catch (InterruptedException e){

        }
    }
}
