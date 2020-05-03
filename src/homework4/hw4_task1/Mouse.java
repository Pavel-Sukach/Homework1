package homework4.hw4_task1;

public abstract class Mouse extends Rodents implements IMove, MakeNoises{
    protected int numOfSqueeksPerMin;

    @Override
    public void move(){
        System.out.println("Move like a mouse");
    }

    @Override
    public void makeNoises(){
        System.out.println("Mouse is squeaking");
    }
}
