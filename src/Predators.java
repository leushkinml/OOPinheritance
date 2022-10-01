import java.util.Objects;

public class Predators extends Mammals{

    private String typeOfFood;

    public Predators(String name, String nikName, int age,
                     String habitat, int movingSpeed, String typeOfFood) {
        super(name, nikName, age, habitat, movingSpeed);

        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Тип пищи не задан.";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }


    public void eat() {
        System.out.println("Мы едим только мясную пищу.");
    }
    public void go() {
        System.out.println("Мы передвигаемся семьями.");
    }

    public void hunt() {
        System.out.println("Мы охотимся на других животных.");
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Тип пищи не задан.";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        Predators predators = (Predators) o;
        return getTypeOfFood().equals(predators.getTypeOfFood());
    }

    @Override
    public String toString() {
        return "Хищное млекопитающее: " + getName() +
                ", Кличка: " + getNikName() +
                ", Возраст: " + getAge() +
                ", Среда проживания: " + getHabitat() +
                ", Скорость перемещения: " + getMovingSpeed() +
                ", Тип пищи: " + getTypeOfFood() +
                '.';
    }
}
