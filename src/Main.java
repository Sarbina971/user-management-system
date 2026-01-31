public class Main {
    public static void main(String[] args) {
        UserManager manager = new UserManager();

        manager.addUser(new User("Alice", "alice@mail.com", "Admin"));
        manager.addUser(new User("Bob", "bob@mail.com", "User"));

        manager.updateUser("bob@mail.com", "Bob Smith", "Admin");
        manager.removeUser("alice@mail.com");

        manager.printUsers();
    }
}
