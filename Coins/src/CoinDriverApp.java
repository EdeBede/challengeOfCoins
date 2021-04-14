public class CoinDriverApp {

    public static void main(String[] args){
        int osszeg = 943;
        Coins c = new Coins(new int[]{1, 2, 5, 10, 20, 50, 100});
        System.out.println(c.calculateNumberOfCoins(osszeg));
    }
}
