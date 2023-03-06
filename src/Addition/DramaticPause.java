package Addition;

import java.util.concurrent.TimeUnit;

public class DramaticPause {
    public void turnOn() throws InterruptedException {
        System.out.printf("\nProcessing");
        TimeUnit.SECONDS.sleep(1);
        System.out.printf(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.printf(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.printf(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.printf(" .");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("The result of the expression is: ");
    }
    public void turnOff()
    {
        System.out.println("--------------No drama detected!--------------");
        System.out.printf("The result of the expression is: ");
    }
}
