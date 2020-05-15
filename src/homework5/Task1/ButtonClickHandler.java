package homework5.Task1;

public class ButtonClickHandler implements EventHandler {
    @Override
    public void execute() {
        while (true) {
            try {
            Thread.sleep(10000);
                System.out.println("10 seconds have passed");
        } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
