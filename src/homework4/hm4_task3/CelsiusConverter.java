package homework4.hm4_task3;


public class CelsiusConverter implements Converter {
    @Override
    public void convert(float val, String scale) {
        if(scale.equals("КЕЛЬВИН")){
            float kelVal = (float) (val - 273.15f);
            System.out.printf("%.2f градуса по Кельвину - это %.2f по Цельсию.", val, kelVal);
        }
        else if(scale.equals("ФАРЕНГЕЙТ")){
            float fahrVal = (float)((val - 32)*5/9);
            System.out.printf("%.2f градуса по Фаренгейту - это %.2f по Цельсию.", val, fahrVal);
        }
    }
}
