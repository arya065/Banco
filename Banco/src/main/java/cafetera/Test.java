package cafetera;

public class Test {
    public static void main(String[] args) {
        CoffeeMachine machine1= new CoffeeMachine(500,100);
        Person pers1 = new Person("name", 10);
        pers1.hacerCafe(machine1);
        System.out.println(machine1.getVolumeNow());
        pers1.beberCafe(machine1);
        System.out.println(machine1.getVolumeNow());
    }
    
}
