public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.play();
        p.play();
        c.play();
        a.walk();
        e.walk();

    }
}
