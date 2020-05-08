package homework5.Task0;

public class Program {
    public static void main(String[] args) {
        Shape round = new Round(8);
        try {
            round.square();
        }
        catch (SquareIsTooLargeException e){
            e.squareIsTooLarge();
        }

        Shape triangular = new Triangular(15, 20);
        try {
            triangular.square();
        } catch (SquareIsTooLargeException e) {
            e.squareIsTooLarge();
        }

        Shape rectangular = new Rectangular(11, 12);
        try {
            rectangular.square();
        } catch (SquareIsTooLargeException e) {
            e.squareIsTooLarge();
        }
    }
}
