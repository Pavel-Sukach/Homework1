package homework4.hw4_task1;

public class GermanShepherd extends Dog implements IEat{
    protected int numOfCrimCaught;

    public GermanShepherd(int legs, int spineLength, String packName, int howlingVolume, int loyalty, int numOfCrimCaught) {
        this.legs = legs;
        this.spineLength = spineLength;
        this.packName = packName;
        this.howlingVolume = howlingVolume;
        this.loyalty = loyalty;
        this.numOfCrimCaught = numOfCrimCaught;
    }

    @Override
    public void eat() {
        System.out.println("Can eat mice and cats");
    }
}
