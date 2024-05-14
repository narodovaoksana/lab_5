package task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargeClassTest {

    @Test
    public void testAddFriend() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addFriend("Jane Doe");
        assertTrue(largeClass.getFriends().contains("Jane Doe"));
    }

    @Test
    public void testRemoveFriend() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addFriend("Jane Doe");
        largeClass.removeFriend("Jane Doe");
        assertFalse(largeClass.getFriends().contains("Jane Doe"));
    }

    @Test
    public void testAddEnemy() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addEnemy("Jane Doe");
        assertTrue(largeClass.getEnemies().contains("Jane Doe"));
    }

    @Test
    public void testRemoveEnemy() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addEnemy("Jane Doe");
        largeClass.removeEnemy("Jane Doe");
        assertFalse(largeClass.getEnemies().contains("Jane Doe"));
    }

    @Test
    public void testAddTask() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addTask("Buy groceries");
        assertTrue(largeClass.getTasks().contains("Buy groceries"));
    }

    @Test
    public void testRemoveTask() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addTask("Buy groceries");
        largeClass.removeTask("Buy groceries");
        assertFalse(largeClass.getTasks().contains("Buy groceries"));
    }

    @Test
    public void testDisplayInfo() {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addFriend("Jane Doe");
        largeClass.addEnemy("Jack Doe");
        largeClass.addTask("Buy groceries");
        StringBuilder expected = new StringBuilder();
        expected.append("Name: John Doe\n");
        expected.append("Age: 30\n");
        expected.append("Gender: Male\n");
        expected.append("Friends:\n");
        expected.append("Jane Doe\n");
        expected.append("Enemies:\n");
        expected.append("Jack Doe\n");
        expected.append("Tasks:\n");
        expected.append("Buy groceries\n");
        assertEquals(expected.toString(), largeClass.getInfoDisplay().displayInfo());
    }
}