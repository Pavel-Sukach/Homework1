package homework5.Task3;

public class DifTypes <T extends Object> {
    public T[] data;

    public DifTypes(T[] data){
        this.data = data;
    }
    public <T> T getElementByIndex(int a){
            return (T) data[a];

    }
}
