import java.util.Objects;

public class Birds extends Animals{

    private String habitat;


    public Birds(String name, String nikName, int age, String habitat) {
        super(name, nikName, age);
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Среда обитания не задана.";
        } else {
            this.habitat = habitat;
        }
    }

    public void eat() {
        System.out.println("Мы едим насекомых, рыбу, земноводных и семена растений.");
    }
    public void go() {
        System.out.println("Мы передвигаемся стаями.");
    }
    public void hunt() {
        System.out.println("Мы охотимся открыто.");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return getHabitat().equals(birds.getHabitat());
    }

}
