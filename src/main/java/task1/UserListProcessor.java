package task1;

import java.util.ArrayList;
import java.util.List;

public class UserListProcessor {
    public List<User> users;

    public UserListProcessor(List<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.getUsername());
        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        return (int) users.stream().filter(User::isAdmin).count();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully!");
    }

    public void sendEmailToUser(User user) {
        System.out.println("Sending email to " + user.getEmail() + "...");
        System.out.println("Email sent successfully!");
    }
    public void deleteUser(User user) {
        int index = users.indexOf(user);
        if (index != -1) {
            users.remove(index);
        } else {
            System.out.println("User not found");
        }
    }
}