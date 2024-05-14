package task2;

import java.util.List;

public class LargeClass {
    public String name;
    public int age;
    public String gender;
    private FriendsList friendsList;
    private EnemiesList enemiesList;
    private TasksList tasksList;
    private InfoDisplay infoDisplay;

    public LargeClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friendsList = new FriendsList();
        this.enemiesList = new EnemiesList();
        this.tasksList = new TasksList();
        this.infoDisplay = new InfoDisplay(this);
    }

    public void addFriend(String name) {
        friendsList.add(name);
    }

    public void removeFriend(String name) {
        friendsList.remove(name);
    }

    public List<String> getFriends() {
        return friendsList.getFriends();
    }

    public void addEnemy(String name) {
        enemiesList.add(name);
    }

    public void removeEnemy(String name) {
        enemiesList.remove(name);
    }

    public List<String> getEnemies() {
        return enemiesList.getEnemies();
    }

    public void addTask(String description) {
        tasksList.add(description);
    }

    public void removeTask(String description) {
        tasksList.remove(description);
    }

    public List<String> getTasks() {
        return tasksList.getTasks();
    }

    public InfoDisplay getInfoDisplay() {
        return infoDisplay;
    }

    public void displayInfo() {
        String info = "Name: " + name + "\n";
        info += "Age: " + age + "\n";
        info += "Gender: " + gender + "\n";
        info += "Friends:\n";
        for (String friend : friendsList.getFriends()) {
            info += friend + "\n";
        }
        info += "Enemies:\n";
        for (String enemy : enemiesList.getEnemies()) {
            info += enemy + "\n";
        }
        info += "Tasks:\n";
        for (String task : tasksList.getTasks()) {
            info += task + "\n";
        }
        System.out.println(info);
    }
}