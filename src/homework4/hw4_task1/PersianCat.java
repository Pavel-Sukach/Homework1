package homework4.hw4_task1;

public class PersianCat extends Cat implements IEatable, IEat{
    protected int lenOfMuzzle;

    public PersianCat(int legs, int spineLength, int purVolume, int stepSoftness, int numOfLives, int lenOfMuzzle) {
        this.legs = legs;
        this.spineLength = spineLength;
        this.purVolume = purVolume;
        this.stepSoftness = stepSoftness;
        this.numOfLives = numOfLives;
        this.lenOfMuzzle = lenOfMuzzle;
    }

    @Override
    public void eat(){
        System.out.println("Can be eaten by a Wolf");
    }

    @Override
    public void eatable() {
        System.out.println("Cat eats mice");
    }
}
