package homework4.hm4_task3;


public class KelvinConverter implements Converter{
    @Override
    public void convert(float val, String scale) {
        if(scale.equals("ЦЕЛЬСИЙ")){
            float kelVal1 = (float) (val + 273.15f);
            System.out.printf("%.2f градуса по Цельсию - это %.2f по Кельвину.", val, kelVal1);
        }
        else if(scale.equals("ФАРЕНГЕЙТ")){
            float kelVal2 = (float)(((val - 32)*5/9) + 273.15f);
            System.out.printf("%.2f градуса по Фаренгейту - это %.2f по Кельвину.", val, kelVal2);
        }
    }
}
