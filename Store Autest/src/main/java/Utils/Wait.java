package Utils;

import java.util.concurrent.TimeUnit;

public final class Wait {

    // Prevents this class from being instantiated
    private Wait() {
    }
    
     /*
       We should use Explicit, Implicit or Fluent wait to handle Selenium interactions.
       Using Thread.sleep or TimeUnit.X.sleep will unnecessary increase execution time
     */

    public static void until(final int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep((long) seconds);
    }
}
