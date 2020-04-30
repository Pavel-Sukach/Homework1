package homework4.hm4_task2;

import java.util.Scanner;

public class Box{
    private double volBox;
    private String figName;
    private Shape figure;
    private double filledVolume = 0;


    public void setVolBox(double volBox) {
        this.volBox = volBox;
    }


    public String getFigName() {
        return figName;
    }

    public void setFigName(String figName) {
        this.figName = figName.toUpperCase();
    }

    public Shape createFigure(){
        switch (getFigName()){
            case "BALL": figure = new Ball();
            break;
            case "CYLINDER": figure = new Cylinder();
            break;
            case  "PYRAMID": figure = new Pyramid();
            break;
            case "PARALLELIPIPED": figure = new Parallelepiped();
            break;
            default:
                figure = null;
                System.out.println("Name is incorrect. ");
        }
        return figure;
    }

    public boolean addFigure(double volume){
        if(volume <= volBox - filledVolume) {
            filledVolume += volume;
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the volume of the box: ");
        Box box = new Box();
        box.setVolBox(scanner.nextDouble());
        boolean anothFig = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the figure that you want to add to the box: ");
            box.setFigName(sc.nextLine().toUpperCase());
            Shape figure = box.createFigure();
            Scanner sc1 = new Scanner(System.in);
            double volume = 0;
            if (figure instanceof Parallelepiped) {
                System.out.println("Enter parameters a, b and c: ");
                ((Parallelepiped) figure).setA(sc1.nextDouble());
                ((Parallelepiped) figure).setB(sc1.nextDouble());
                ((Parallelepiped) figure).setC(sc1.nextDouble());
                volume = figure.calcVolume();
                if(anothFig = box.addFigure(volume)) {
                    System.out.println(box.filledVolume);
                }
            } else if (figure instanceof Pyramid) {
                System.out.println("Enter parameters h and s: ");
                ((Pyramid) figure).setH(sc1.nextDouble());
                ((Pyramid) figure).setS(sc1.nextDouble());
                volume = figure.calcVolume();
                if(anothFig = box.addFigure(volume)) {
                    System.out.println(box.filledVolume);
                }
            } else if (figure instanceof Cylinder) {
                System.out.println("Enter parameters radius and height: ");
                ((Cylinder) figure).setRadius(sc1.nextDouble());
                ((Cylinder) figure).setHeight(sc1.nextDouble());
                volume = figure.calcVolume();
                if(anothFig = box.addFigure(volume)) {
                    System.out.println(box.filledVolume);
                }
            } else if (figure instanceof Ball) {
                System.out.println("Enter parameters radius: ");
                ((Ball) figure).setRadius(sc1.nextDouble());
                volume = figure.calcVolume();
                if(anothFig = box.addFigure(volume)) {
                    System.out.println(box.filledVolume);
                }
            }
            else if(figure == null){
                System.out.println("Try again!");
            }

        }
        while (anothFig);
        System.out.println("There is not enough space in your box!");
    }
}
