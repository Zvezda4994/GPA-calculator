import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Component> components;

    public Course(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(double weight, double score) {
        components.add(new Component(weight, score));
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }
}
