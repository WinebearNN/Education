package xRep.homework;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    private void Stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;

    }

    private static double getChangePercent(double pCP,double cP){
        return (cP/pCP-1)*100;
    }

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.symbol="SBER";
        stock.name="ПАО Сбербанк";
        System.out.print(stock.symbol+" ");
        System.out.print(" " +stock.name+"  ");
        System.out.print(getChangePercent(281.50,282.87));
    }
}
