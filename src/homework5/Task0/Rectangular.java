package homework5.Task0;

public class Rectangular extends Shape {
    private double a;
    private double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double square() throws SquareIsTooLargeException {
        double result = a * b;
        if(result <= 100){
            return result;
        }
        else {
            throw new SquareIsTooLargeException();
        }
    }
}
