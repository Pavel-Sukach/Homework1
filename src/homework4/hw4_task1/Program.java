package homework4.hw4_task1;

public class Program {
    public static void main(String[] args) {
        PersianCat persianCat = new PersianCat(4,35,7,9,10,1);
        persianCat.makeNoises();
        persianCat.move();
        persianCat.eatable();
        persianCat.eat();
        System.out.println();

        GermanShepherd germanShepherd = new GermanShepherd(4,77,"Howlers",10, 10, 11);
        germanShepherd.makeNoises();
        germanShepherd.move();
        germanShepherd.eat();
        System.out.println();

        LabMouse labMouse = new LabMouse(4,5,3,111, 9);
        labMouse.makeNoises();
        labMouse.move();
        labMouse.eatable();
    }
}
