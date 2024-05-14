package task2;

import java.util.ArrayList;
import java.util.List;

public class EnemiesList {
    private List<String> enemies;

    public EnemiesList() {
        this.enemies =new ArrayList<>();
    }

    public void add(String name) {
        enemies.add(name);
    }

    public void remove(String name) {
        enemies.remove(name);
    }

    public List<String> getEnemies() {
        return enemies;
    }
}