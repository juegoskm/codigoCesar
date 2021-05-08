public class Numbers {
    private int NumberOne, NumberTwo;

    public Numbers(int NumberOne, int NumberTwo) {
        this.NumberOne = NumberOne;
        this.NumberTwo = NumberTwo;
    }

    public int getNumberOne() {
        return NumberOne;
    }

    public void setNumberOne(int numberOne) {
        NumberOne = numberOne;
    }

    public int getNumberTwo() {
        return NumberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        NumberTwo = numberTwo;
    }
    public int suma(){
        int suma;
        suma = NumberOne + NumberTwo;
        return suma;
    }
    public int resta(){
        int resta;
        resta = NumberOne - NumberTwo;
        return resta;
    }
    public int multiplicacion(){
        int multiplicacion;
        multiplicacion = NumberOne * NumberTwo;
        return multiplicacion;
    }
}

