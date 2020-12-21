package Utils;

import java.util.concurrent.TimeUnit;

public final class Wait {

    // Prevents this class from being instantiated
    private Wait() {
    }

    public static void until(final int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep((long) seconds);
    }
}
