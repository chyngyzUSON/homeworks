package store;

public class Amazon extends OnlineStores {
    public Amazon(String account){
        super("amazon.com", 35, 14, 15, 5);
    }

    @Override
    public int checkWeight(String account, int shippingWeight) {
        System.out.println("Weight of your item from " + getAccount() + shippingWeight + " kg");
        return getShippingWeight(account, shippingWeight);
    }

    @Override
    public int term(String account, int period) {
        System.out.println("Your delivery time from " + getAccount() + period + " days");
        return getPeriod(account, period);
    }

    @Override
    public double VAT(String account, double tax) {
        System.out.println("VAT from " + getAccount() + tax + " percent");
        return getTax(account, tax);
    }

    @Override
    public int riskOfLoss(String account, int risk) {
        System.out.println("If more expensive 10000$ " + risk + " percent");
        return getRisk(account, risk);
    }
}