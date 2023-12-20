package examples.calculator;

public class CalcLogger implements Loggable{
    @Override
    public void saveLog(String str) {
        System.out.println(Colors.red + "История операций: " + str + Colors.reset);
    }
}
