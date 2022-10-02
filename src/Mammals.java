import java.util.Objects;

public class Mammals extends Animals{

    private String habitat;
    private int movingSpeed;

    public Mammals(String name, String nikName, int age, String habitat, int movingSpeed) {
        super(name, nikName, age);
        this.setHabitat(habitat);
        this.setMovingSpeed(movingSpeed);
    }

    public void eat() {
        System.out.println("Мы едим свежую пищу.");
    }
    public void go() {
        System.out.println("Мы не ходим по одиночке.");
    }
    public void walk() {
        System.out.println("Мы любим гулять вдоль рек.");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Среда обитания не задана.";
        } else {
            this.habitat = habitat;
        }
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
        if (movingSpeed < 0) {
            this.movingSpeed = 0;
        } else {
            this.movingSpeed = movingSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        Mammals mammals = (Mammals) o;
        return getMovingSpeed() == mammals.getMovingSpeed() && getHabitat().equals(mammals.getHabitat());
    }

}
