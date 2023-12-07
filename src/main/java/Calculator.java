public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b != 0){
            return a / b;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        return div(add(-22, -3), add(15, 10));
    }
}
