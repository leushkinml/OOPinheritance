import java.util.Objects;

public class Herbivores extends Mammals{

    private String typeOfFood;


    public Herbivores(String name, String nikName, int age, String habitat, int movingSpeed, String typeOfFood) {
        super(name, nikName, age, habitat, movingSpeed);

        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Тип пищи не задан.";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }


    public void eat() {
        System.out.println("Мы едим только растительную пищу.");
    }
    public void go() {
        System.out.println("Мы передвигаемся табунами.");
    }

    public void graze() {
        System.out.println("Нам нужны просторные пастбища.");
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
        if (!(o instanceof Herbivores)) return false;
        Herbivores that = (Herbivores) o;
        return getTypeOfFood().equals(that.getTypeOfFood());
    }

    @Override
    public String toString() {
        return "Травоядное млекопитающее: " + getName() +
                ", Кличка: " + getNikName() +
                ", Возраст: " + getAge() +
                ", Среда проживания: " + getHabitat() +
                ", Скорость перемещения: " + getMovingSpeed() +
                ", Тип пищи: " + getTypeOfFood() +
                '.';
    }
}
