package task2;

public class InfoDisplay {
    private LargeClass largeClass;

    public InfoDisplay(LargeClass largeClass) {
        this.largeClass = largeClass;
    }

    public String displayInfo() {
        String info = "Name: " + largeClass.name + "\n";
        info += "Age: " + largeClass.age + "\n";
        info += "Gender: " + largeClass.gender + "\n";
        info += "Friends:\n";
        for (String friend : largeClass.getFriends()) {
            info += friend + "\n";
        }
        info += "Enemies:\n";
        for (String enemy : largeClass.getEnemies()) {
            info += enemy + "\n";
        }
        info += "Tasks:\n";
        for (String task : largeClass.getTasks()) {
            info += task + "\n";
        }
        return info;
    }
}