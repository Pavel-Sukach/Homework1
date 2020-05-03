package homework4.hw4_task1;

public abstract class Cat extends Feline implements IMove, MakeNoises {
    protected int numOfLives;

    @Override
    public void move(){
        System.out.println("Moving like cat");
    }

    @Override
    public void makeNoises(){
        System.out.println("Cat is mewing");
    }
}
