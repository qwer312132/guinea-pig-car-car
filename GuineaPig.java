package models.guineaPig;
import java.util.ArrayList;
import java.util.List;

public class GuineaPig {
    private String name;
    private List<String> foodList;

    public GuineaPig(String name) {
        this.name = name;
        this.foodList = new ArrayList<>();
    }

    public String noise() {
        return "PUI PUI";
    }

    public void eat(String food) {
        foodList.add(food);
    }

    public String pupu() {
        String food = String.join(", ", foodList);
        foodList.clear();
        return name + ": 棒出了 " + food;
    }

    public String checkAndPupuIfNeeded() {
        if (foodList.size() > 5) {
            return pupu();
        }
        return "";
    }

    public String getName() {
        return name;
    }
}
