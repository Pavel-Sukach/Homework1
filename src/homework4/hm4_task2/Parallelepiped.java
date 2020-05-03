package homework4.hm4_task2;

public class Parallelepiped extends Shape {
    private double a;
    private double b;
    private double c;
    private double parVolume;

    @Override
    public double calcVolume(){
        parVolume = getA() * getB() * getC();
        return parVolume;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
