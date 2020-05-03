package homework4.hm4_task2;

public class Cylinder extends SolidOfRevolution {
    protected double height;
    protected double cylVolume;

    @Override
    public double calcVolume(){
        cylVolume = getHeight() * Math.PI * getRadius() * getRadius();
        return cylVolume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
