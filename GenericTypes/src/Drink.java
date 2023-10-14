public abstract class Drink {
    public String name;

    public Drink(String name) {
        this.name = name;
    }

    public void showDrink(){
        System.out.println(name);
    }
}
