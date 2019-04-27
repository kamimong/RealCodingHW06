public class Calculator {
    private int result = 0;
    public int getResult()  {
        return result;
    }
    public void add(int a, int b) {
        this.result = a+b;
    }
//==================================  Money  ========================================
    public int won,dollar,pound,yen ;

    public int getWon() { return this.won; }
    public int getDollar(){ return this.dollar; }
    public int getPound() { return this.pound; }
    public int getYen() { return this.yen; }


    public void wonToDollar() { dollar = getWon() / 1200; }
    public void wonToPound() { pound = getWon() / 1500; }
    public void wonToYen() { yen = getWon() / 10; }

}
