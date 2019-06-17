public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String aName){
        super(4);
        name = aName;
    }

    public Cat(){
        super(4);
        name = "Murzik";
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public void play(){
        System.out.println("The " + name + " is playing");
    }
}
