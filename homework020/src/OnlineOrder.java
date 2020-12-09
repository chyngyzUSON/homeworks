public class OnlineOrder {
    private Ozon ozonApp;
    private Alibaba alibabaApp;
    private Amazon amazonApp;
    //public int price;          //стоимость покупки

    //  Constructor
    public OnlineOrder(Ozon ozonApp, Alibaba alibabaApp, Amazon amazonApp) {
        this.ozonApp = ozonApp;
        this.alibabaApp = alibabaApp;
        this.amazonApp = amazonApp;
        //this.price = price;
    }

    //  Methods
    public void buy(String account, int shippingWeight, int period, double tax, int risk){
        int countOzon = 0;
        //a
        int profitableOzon1 = ozonApp.getShippingWeight(account, shippingWeight);
        int profitableOzon2 = ozonApp.getPeriod(account, period);
        double profitableOzon3 = ozonApp.getTax(account, tax);
        int profitableOzon4 = ozonApp.getRisk(account, risk);

        int countAlibaba = 0;
        //b
        int profitableAlibaba1 = alibabaApp.getShippingWeight(account, shippingWeight);
        int profitableAlibaba2 = alibabaApp.getPeriod(account, period);
        double profitableAlibaba3 = alibabaApp.getTax(account, tax);
        int profitableAlibaba4 = alibabaApp.getRisk(account, risk);

        int countAmazon = 0;
        //c
        int profitableAmazon1 = amazonApp.getShippingWeight(account, shippingWeight);
        int profitableAmazon2 = amazonApp.getPeriod(account, period);
        double profitableAmazon3 = amazonApp.getTax(account, tax);
        int profitableAmazon4 = amazonApp.getRisk(account, risk);

        //  Проверка веса
        if (profitableOzon1 < profitableAlibaba1 && profitableOzon1 < profitableAmazon1)
            countOzon++;
        else if (profitableAlibaba1 < profitableOzon1 && profitableAlibaba1 < profitableAmazon1)
            countAlibaba++;
        else
            countAmazon++;

        //  Проверка срока
        if (profitableOzon2 < profitableAlibaba2 && profitableOzon2 < profitableAmazon2)
            countOzon++;
        else if (profitableAlibaba2 < profitableOzon2 && profitableAlibaba2 < profitableAmazon2)
            countAlibaba++;
        else
            countAmazon++;

        //  Проверка НДС
        if (profitableOzon3 < profitableAlibaba3 && profitableOzon3 < profitableAmazon3)
            countOzon++;
        else if (profitableAlibaba3 < profitableOzon3 && profitableAlibaba3 < profitableAmazon3)
            countAlibaba++;
        else
            countAmazon++;

        //  Проверка рискованности
        if (profitableOzon4 < profitableAlibaba4 && profitableOzon4 < profitableAmazon4)
            countOzon++;
        else if (profitableAlibaba4 < profitableOzon4 && profitableAlibaba4 < profitableAmazon4)
            countAlibaba++;
        else
            countAmazon++;


        //  Общая проверка выгодности
        if (countOzon < countAlibaba && countOzon < countAmazon)
            System.out.println("Take advantage of the " + ozonApp + " service");
        else if (countAlibaba < countOzon && countAlibaba < countAmazon)
            System.out.println("Take advantage of the " + alibabaApp + " service");
        else
            System.out.println("Take advantage of the " + amazonApp + " service");
    }
}
