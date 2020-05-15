package homework5.Task0;

public class Program {
    public static void main(String[] args) {
        Shape round = new Round(8);
        Shape triangular = new Triangular(2, 20);
        Shape rectangular = new Rectangular(3, 12);
        try {
            round.square();
            triangular.square();
            rectangular.square();
        } catch (SquareIsTooLargeException e) {
            e.squareIsTooLarge();
        }
    }
}
