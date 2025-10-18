package quiz;

/*Don't worry about this class being an abstract class, you can
use inheritance like normal! :) */
public abstract class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /*Don't worry about this method being abstract, you can override it normally! :)*/
    public abstract void increaseAge();
}
