import java.util.Objects;

public class Flightless extends Birds{

    private String movementType;

    public Flightless(String name, String nikName, int age,
                      String habitat, String movementType) {
        super(name, nikName, age, habitat);
        this.setMovementType(movementType);
    }

    public void eat() {
        System.out.println("Мы едим то, что подберём.");
    }
    public void go() {
        System.out.println("Мы передвигаемся медленно и важно.");
    }

    public void walk() {
        System.out.println("Мы гуляем парами.");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isBlank()) {
            this.movementType = "Тип пищи не задан.";
        } else {
            this.movementType = movementType;
        }
    }

    @Override
    public String toString() {
        return "Нелетающие птицы: " + getName() +
                ", Кличка: " + getNikName() +
                ", Возраст: " + getAge() +
                ", Среда проживания: " + getHabitat() +
                ", Тип передвижения: " + getMovementType() +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return getMovementType().equals(that.getMovementType());
    }
}
