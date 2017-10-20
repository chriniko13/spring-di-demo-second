package spring.di.demo.factory;

import spring.di.demo.domain.Balloon;

public class BalloonFactory {

    private final static Object MUTEX = new Object();
    private static Boolean MAKE_BLUE = true;

    public Balloon createBalloon() {

        synchronized (MUTEX) {

            if (MAKE_BLUE) {
                MAKE_BLUE = false;
                return new Balloon("blue");
            }

            MAKE_BLUE = true;
            return new Balloon("red");

        }


    }

}
