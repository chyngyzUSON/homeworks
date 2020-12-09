public class Main {

    public static void main(String[] args) {
	// write your code here
        Ozon ozon = new Ozon("Ozon");
        Alibaba alibaba = new Alibaba("alibaba");
        Amazon amazon = new Amazon("amazon");

        OnlineOrder onlineOrder = new OnlineOrder(ozon, alibaba, amazon);

        onlineOrder.buy("", 50, 14, 5, 15);


        // Выдает вот такой результат: "Take advantage of the Amazon@3941a79c service". Подозреваю что с аннотациями что то не так, но смог исправить.



    }
}
