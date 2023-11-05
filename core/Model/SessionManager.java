package core.Model;

public class SessionManager {
    private static Users currentUser;

    public static void createSession(Users user) {
        currentUser = user;
    }

    public static Users getCurrentUser() {
        return currentUser;
    }

    public static void invalidateSession() {
        currentUser = null;
    }
}
