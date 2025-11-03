public class UserService {

    // Fake DB with 2 users
    private User[] database = {
        new User(1, "Marco"),
        new User(2, "Alino")
    };

    public User findUserById(int id) {
        for (User user : database) {
            if (user.getId() == id) {
                return user;
            }
        }

        // Null if not found
        return null;
    }
}
