package hooks;

import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void openStand() {
        System.out.println("test stand is opened from Hooks");
    }
}
