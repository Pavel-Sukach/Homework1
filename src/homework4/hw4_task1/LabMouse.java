package homework4.hw4_task1;

public class LabMouse extends Mouse implements CanBeEaten {
    protected int resisToVirus;

    public LabMouse(int legs, int spineLength, int incisorLength, int numOfSqueeksPerMin, int resisToVirus) {
        this.legs = legs;
        this.spineLength = spineLength;
        this.incisorLength = incisorLength;
        this.numOfSqueeksPerMin = numOfSqueeksPerMin;
        this.resisToVirus = resisToVirus;
    }

    @Override
    public void canBeEaten(){
        System.out.println("Can be eaten by a cat");
    }
}
