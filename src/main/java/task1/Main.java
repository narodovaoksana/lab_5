package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("admin1", "admin1@example.com", "password1", "address1"));
        users.add(new User("user1", "user1@example.com", "password1", "address1"));
        users.add(new User("user2", "user2@example.com", "password2", "address2"));

        UserListProcessor userListProcessor = new UserListProcessor(users);

        System.out.println("Processing user list...");
        userListProcessor.processUserList();

        System.out.println("Count of admin users: " + userListProcessor.countAdminUsers());

        User newUser = new User("admin2", "admin2@example.com", "password2", "address2");
        userListProcessor.addUser(newUser);

        User userToEmail = users.get(1);
        userListProcessor.sendEmailToUser(userToEmail);

        User userToDelete = users.get(0);
        userListProcessor.deleteUser(userToDelete);

        System.out.println("Count of users after deletion: " + userListProcessor.users.size());
    }
}