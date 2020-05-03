package homework4.hw4_task1;

public class LabMouse extends Mouse implements IEatable {
    protected int resisToVirus;

    public LabMouse(int legs, int spineLength, int incisorLength, int numOfSqueeksPerMin, int resisToVirus) {
        this.legs = legs;
        this.spineLength = spineLength;
        this.incisorLength = incisorLength;
        this.numOfSqueeksPerMin = numOfSqueeksPerMin;
        this.resisToVirus = resisToVirus;
    }

    @Override
    public void eatable(){
        System.out.println("Can be eaten by a cat");
    }
}
