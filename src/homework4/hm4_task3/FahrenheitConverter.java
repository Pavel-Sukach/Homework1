package homework4.hm4_task3;


public class FahrenheitConverter implements Converter{
    @Override
    public void convert(float val, String scale) {
        if(scale.equals("ЦЕЛЬСИЙ")){
            float fahrVal1 = (float) (val * 9/5 + 32);
            System.out.printf("%.2f градуса по Цельсию - это %.2f по Фаренгейту.", val, fahrVal1);
        }
        else if(scale.equals("КЕЛЬВИН")){
            float fahrVal2 = (float)((val - 273.15f) * 9/5 + 32);
            System.out.printf("%.2f градуса по Кельвину - это %.2f по Фаренгейту.", val, fahrVal2);
        }
    }
}
