package org.whgc.util;

import org.whgc.model.User;

public class Application {
    private  static User u;
    public static User getU() {
        return u;
    }

    public static void setU(User u) {
        Application.u = u;
    }
}
