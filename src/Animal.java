public class Animal {
    protected int legs;

    protected Animal(int aLegs){
        legs = aLegs;
    }

    public void walk(){
        System.out.println("The animal walks on " + legs + " legs.");
    }

    public void eat(){
        System.out.println("The animal eating on " + legs + " legs.");
    }
}
