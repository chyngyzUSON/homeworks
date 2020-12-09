package store;

public class OnlineStores {
    private String account;         //интернет магазин
    private int shippingWeight;     //доставка в кг
    private int period;             //срок доставки товара
    private double tax;             //НДС
    private int risk;               //риск при покупке больше 10000$
    //private int price;              //стоимость покупки


    //Constructors
    public OnlineStores(String account, int shippingWeight, int period, double tax, int risk) {
        this.account = account;
        this.shippingWeight = shippingWeight;
        this.period = period;
        this.tax = tax;
        this.risk = risk;
        //this.price = price;
    }


    //Methods
    public int checkWeight(String account, int shippingWeight){
        System.out.println("Weight of your item: " + shippingWeight);
        return getShippingWeight(account, shippingWeight);
    }
    public int term(String account, int period){
        System.out.println("Your delivery time: " + period);
        return getPeriod(account, period);
    }
    public double VAT(String account, double tax){
        System.out.println("VAT: " + tax);
        return getTax(account, tax);
    }
    public int riskOfLoss(String account, int risk){
        System.out.println("If more expensive 10000$: " + risk);
        return getRisk(account, risk);
    }
//    public int purchasePrice(String account, int price){
//        System.out.println("The total cost of your purchase " + price);
//        return getPrice(account, price);
//    }


    public int getShippingWeight(String account, int shippingWeight){
        if (account.equals(this.account)) return 0;
        else return shippingWeight;
    }
    public int getPeriod(String account, int period){
        if (account.equals(this.account)) return 0;
        else return period;
    }
    public double getTax(String account, double tax){
        if (account.equals(this.account)) return 0;
        else return tax;
    }
    public int getRisk(String account, int risk){
        if (account.equals(this.account)) return 0;
        else return risk;
    }
//    public int getPrice(String account, int price){
//        if (account.equals(this.account)) return 0;
//        else return price;
//    }


    //Getters and Setters
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public int getShippingWeight() {
        return shippingWeight;
    }
    public void setShippingWeight(int shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public int getPeriod() {
        return period;
    }
    public void setPeriod(int period) {
        this.period = period;
    }

    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getRisk() {
        return risk;
    }
    public void setRisk(int risk) {
        this.risk = risk;
    }

//    public int getPrice() {
//        return price;
//    }
//    public void setPrice(int price) {
//        this.price = price;
//    }
}
