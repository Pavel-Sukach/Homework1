package homework5.Task0;

public class Triangular extends Shape {
    private double a;
    private double h;

    public Triangular(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    double square() throws SquareIsTooLargeException {
        double result = 1/2 * a * h;
        if(result <= 100){
            return result;
        }
        else {
            throw new SquareIsTooLargeException();
        }
    }
}
