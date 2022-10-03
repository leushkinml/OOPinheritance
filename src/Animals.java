import java.util.Objects;

public abstract class Animals {
    private final String name;
    private final String nikName;
    private int age;

    public Animals(String name, String nikName, int age) {
        this.name = name;
        this.nikName = nikName;
        this.setAge(age);
    }
    public abstract void eat();
    public abstract void go();
    public void sleep() {
        System.out.println("Как правило, мы спим по ночам.");
    }
    public String getName() {
        return name;
    }
    public String getNikName() {
        return nikName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getAge() == animals.getAge() && getName().equals(animals.getName()) && getNikName().equals(animals.getNikName());
    }
}
