package task2;

import java.util.ArrayList;
import java.util.List;

public class FriendsList {
    private List<String> friends;

    public FriendsList() {
        this.friends = new ArrayList<>();
    }

    public void add(String name) {
        friends.add(name);
    }

    public void remove(String name) {
        friends.remove(name);
    }

    public List<String> getFriends() {
        return friends;
    }
}
