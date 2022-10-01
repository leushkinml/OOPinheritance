import java.util.Objects;

public class Amphibians extends Animals {

    private String habitat;


    public Amphibians(String name, String nikName, int age, String habitat) {
        super(name, nikName, age);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Среда обитания не задана.";
        } else {
            this.habitat = habitat;
        }
    }

    public void eat() {
        System.out.println("Мы едим насекомых.");
    }
    public void go() {
        System.out.println("Мы передвигаемся по одиночке.");
    }
    public void hunt() {
        System.out.println("Мы охотимся неожиданно для жертвы.");
    }

     public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Среда обитания не задана.";
        } else {
            this.habitat = habitat;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return getHabitat().equals(that.getHabitat());
    }

    @Override
    public String toString() {
        return "Земноводное: " + getName() +
                ", Кличка: " + getNikName() +
                ", Возраст: " + getAge() +
                ", Среда проживания: " + getHabitat() +
                '.';
    }
}
