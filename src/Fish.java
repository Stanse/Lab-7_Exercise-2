public class Fish extends Animal implements Pet {
    private String name;

    public Fish(){
        super(0);
        name = "Foggy";
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public void play(){
        System.out.println(name + " is playing");
    }
    public void walk(){
        System.out.println(name + " is swimming");
    }public void eat(){
        System.out.println(name + "is eating");
    }

}
