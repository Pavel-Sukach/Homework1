package homework4.hm4_task2;

public class Ball extends SolidOfRevolution {
    protected double volumeBall;

    @Override
    public double calcVolume(){
        volumeBall = (double)4/3 * Math.PI * getRadius()*getRadius()*getRadius();
        return volumeBall;
    }
}
