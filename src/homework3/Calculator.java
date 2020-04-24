package homework3;

public class Calculator {
    int oper1;
    int oper2;

    public Calculator(int oper1, int oper2){
        this.oper1 = oper1;
        this.oper2 = oper2;
    }

    public int getOper1(){
        return oper1;
    }
    public void setOper1(int oper1){
        this.oper1 = oper1;
    }
    public int getOper2(){
        return oper2;
    }
    public void setOper2(int oper2){
        this.oper2 = oper2;
    }

    public void addition(){
        System.out.println(oper1 + oper2);
    }
    public void subtraction(){
        System.out.println(oper1 - oper2);
    }
    public void multiplication(){
        System.out.println(oper1 * oper2);
    }
    public void division(){
        System.out.println((double)(oper1 / oper2));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(6, 3);
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
    }
}
