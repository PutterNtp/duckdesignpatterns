package L08.AdapterPattern;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberofQuacks;

    public QuackCounter(Quackable duck)
    {
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        numberofQuacks++;
    }

    public static int getQuacks()
    {
        return numberofQuacks;
    }

}
