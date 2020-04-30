package homework4.hw4_task1;

public abstract class Dog extends Canine implements AbletoMove, MakeNoises{
    protected int loyalty;

    @Override
    public void move(){
        System.out.println("Move like a dog");
    }

    @Override
    public void makeNoises(){
        System.out.println("Dog is barking");
    }
}
