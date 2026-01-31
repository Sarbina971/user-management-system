import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
    }

    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.update(newName, newRole);
                return;
            }
        }
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
