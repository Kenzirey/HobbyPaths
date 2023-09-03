package emmanes.goalTests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import emmanes.game.Player;
import emmanes.goals.Goal;
import emmanes.goals.InventoryGoal;

class GoalTests {
    Player player = new Player(
        "Tony", 1, 1, 1, 1);


    ArrayList<Goal> goals = new ArrayList<Goal>();
    ArrayList<String> mandatoryItems = new ArrayList<>();

    String testItem = "socks";
    String anotherTestItem = "beans";


    @Test
    void testingItemAddedToMandatoryItems() {
        this.mandatoryItems.add(testItem);
        assertTrue(this.mandatoryItems.contains(testItem));
    }

    @Test
    void testingAddingInventoryGoalCorrectly() {
        this.mandatoryItems.add(testItem);
        InventoryGoal goal = new InventoryGoal(mandatoryItems);
        
        this.goals.add(goal);
        assertTrue(goals.contains(goal));
    }

    @Test
    void testingIfInventoryGoalIsFulfilled() {
        this.mandatoryItems.add(testItem);
        this.player.addToInventory(testItem);
        InventoryGoal goal = new InventoryGoal(mandatoryItems);
        this.goals.add(goal);

        assertTrue(goal.isFulfilled(this.player));
    }
    

}
