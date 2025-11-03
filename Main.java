public class Main {

    public static void main(String[] args) {
        
        System.out.println("UserFinder activation...");
        UserService service = new UserService();

        // --- TEST ---
        System.out.println("Looking for specific user...");
        User utente = service.findUserById(3);

        if (utente != null) { 
            // TESTING BUG HERE BY ADDING/REMOVING METHOD CALL
            System.out.println("User found: " + utente.getName());
        } else {
            System.out.println("ERROR: User not found.");
        }

        System.out.println("Done Searching, player!");
    }
}

// for debugging purposes and as scope of this lab, User utente = service.findUserById(3) was left unhandled for cases where User is null. 
// The code above now includes a null check to prevent a NullPointerException when trying to access getName() on a null User object.