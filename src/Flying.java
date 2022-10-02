import java.util.Objects;

public class Flying extends Birds{

    private String movementType;

    public Flying(String name, String nikName, int age,
                      String habitat, String movementType) {
        super(name, nikName, age, habitat);
        this.setMovementType(movementType);
    }


    public void eat() {
        System.out.println("Мы едим то, что подберём и охотимся.");
    }
    public void go() {
        System.out.println("Мы быстро летаем.");
    }

    public void fly() {
        System.out.println("Мы летаем с помощью крыльев.");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isBlank()) {
            this.movementType = "Тип передвижения не задан.";
        } else {
            this.movementType = movementType;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return getMovementType().equals(flying.getMovementType());
    }

    @Override
    public String toString() {
        return "Летающие птицы: " + getName() +
                ", Кличка: " + getNikName() +
                ", Возраст: " + getAge() +
                ", Среда проживания: " + getHabitat() +
                ", Тип передвижения: " + getMovementType() +
                '.';
    }
}
