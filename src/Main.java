public class Main {
    public static void main(String[] args) {

        // Травоядные
        Herbivores gazelle = new Herbivores("Газель", "Красотка", 12, "Пастбище", 60, "Травы и молодые побеги");
        Herbivores giraffe = new Herbivores("Жираф", "Длинноший", 8, "Пастбище", 45, "Молодые листья деревьев");;
        Herbivores horse = new Herbivores("Лошадь", "Быстрая нога", 15, "Пастбище", 70, "Травы и молодые побеги");;

        // Хищники
        Predators hyena = new Predators("Гиена", "Пакостник", 3, "Саванна", 30, "Падаль");
        Predators tiger = new Predators("Тигр", "Красавчик", 8, "Саванна", 100, "Свежее мясо");
        Predators bear = new Predators("Медведь", "Косолапый", 11, "Леса", 50, "Всеядный");

        // Земноводные
        Amphibians frog = new Amphibians("Лягушка", "Зелёный", 1, "Болота");
        Amphibians freshwaterGrasSnake = new Amphibians("Уж пресноводный", "Шнурок", 2, "Реки");

        // Нелетающие
        Flightless peacock = new Flightless("Павлин", "Ухожор", 3, "Тропические леса", "Пешком");
        Flightless penguin = new Flightless("Пингвин", "Король", 5, "Антарктида", "Пешком и вплавь");
        Flightless dodo = new Flightless("Додо", "Соня", 2, "Тропические леса", "Впрыпрыжку и пешком");

//      Летающие

        Flying gull = new Flying("Чайка", "Малышка", 2, "Прибрежные зоны", "Летаю");
        Flying albatross = new Flying("Альбатрос", "Здоровяк", 5, "Прибрежные зоны", "Летаю");
        Flying falcon = new Flying("Сокол", "Задира", 4, "Степи", "Летаю и пикирую");


        System.out.println(gazelle);
        gazelle.sleep();
        gazelle.eat();
        gazelle.go();
        gazelle.walk();
        gazelle.graze();
        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println();
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        bear.eat();
        bear.go();
        bear.hunt();

        System.out.println();
        System.out.println(frog);
        System.out.println(freshwaterGrasSnake);
        frog.eat();
        frog.sleep();
        frog.go();
        frog.hunt();

        System.out.println();
        System.out.println(peacock);
        peacock.eat();
        peacock.go();
        peacock.walk();
        System.out.println(penguin);
        System.out.println(dodo);

        System.out.println();
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        gull.eat();
        albatross.go();
        falcon.fly();
    }
}