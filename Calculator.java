//реализация калькулятора

public class Calculator {
    //результат
    private int result;
    //сумма
    public void add(int ... params){
        for (Integer param : params){
            this.result +=param;
        }
    }
    //получить результат
    public int getResult(){
        return this.result;
    }
    
    //очистить результат
    public void cleanResult(){
        this.result = 0;
    }
}