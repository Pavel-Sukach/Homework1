package homework5.Task0;

public class Round extends Shape {
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    double square() throws SquareIsTooLargeException {
        double result = Math.PI * radius * radius;
        if(result <= 100){
            return result;
        }else {
            throw new SquareIsTooLargeException();
        }
    }
}

