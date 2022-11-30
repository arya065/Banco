package cafetera;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
     
    public void hacerCafe(CoffeeMachine maq1){
        maq1.agregarCafe(500.0);
    }
    public void beberCafe(CoffeeMachine maq1){
        maq1.servirTaza(200.5);
    }
}
