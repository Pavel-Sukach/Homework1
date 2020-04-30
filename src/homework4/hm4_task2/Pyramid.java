package homework4.hm4_task2;

public class Pyramid extends Shape {
    protected double s;
    protected double h;
    protected double pyrVolume;

    @Override
    public double calcVolume(){
        pyrVolume = (double)1/3 * getH() * getS();
        return pyrVolume;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
