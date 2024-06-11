

public class FruitShop {
    // 定义水果的价格
    static   double applePrice = 8.0; // 每斤8元
    static   double strawberryPrice = 13.0; // 每斤13元
    static   double mangoPrice  = 20.0; // 每斤20元

    /**
     * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param applesWeight 多少斤苹果
     * @param strawberriesWeight 多少斤草莓
     * @return 结算
     */
    public static double calculateTotalPriceA(int applesWeight, int strawberriesWeight) {
        double totalApplePrice = applesWeight * applePrice;
        double totalStrawberryPrice = strawberriesWeight * strawberryPrice;
        return totalApplePrice + totalStrawberryPrice;
    }

    /**
     * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
     * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param applesWeight 多少斤苹果
     * @param strawberriesWeight 多少斤草莓
     * @param mangoesWeight 多少斤芒果
     * @return 结算
     */
    public static double calculateTotalPriceB(int applesWeight, int strawberriesWeight, int mangoesWeight) {
        double totalApplePrice = applesWeight * applePrice;
        double totalStrawberryPrice = strawberriesWeight * strawberryPrice;
        double totalMangoPrice = mangoesWeight * mangoPrice;
        return totalApplePrice + totalStrawberryPrice + totalMangoPrice;
    }

    /**
     * 3、超市做促销活动，草莓限时打 8 折。
     * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param applesWeight 多少斤苹果
     * @param strawberriesWeight 多少斤草莓
     * @param mangoesWeight 多少斤芒果
     * @return 结算
     */
    public static double calculateTotalPriceC(int applesWeight, int strawberriesWeight, int mangoesWeight) {
        double totalApplePrice = applesWeight * applePrice;
        double totalStrawberryPrice = strawberriesWeight * strawberryPrice*0.8;//草莓限时打 8 折
        double totalMangoPrice = mangoesWeight * mangoPrice;
        return totalApplePrice + totalStrawberryPrice + totalMangoPrice;
    }

    /**
     * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
     * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param applesWeight 多少斤苹果
     * @param strawberriesWeight 多少斤草莓
     * @param mangoesWeight 多少斤芒果
     * @return 结算
     */
    public static double calculateTotalPriceD(int applesWeight, int strawberriesWeight, int mangoesWeight) {
        double totalApplePrice = applesWeight * applePrice;
        double totalStrawberryPrice = strawberriesWeight * strawberryPrice*0.8;//草莓限时打 8 折。
        double totalMangoPrice = mangoesWeight * mangoPrice;
        double totalPrice = totalApplePrice + totalStrawberryPrice + totalMangoPrice;

        // 如果总价超过100元，应用满减优惠
        if (totalPrice >= 100) {
            totalPrice -= 10;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        int applesWeightA = 5;
        int strawberriesWeightA = 3;
        double totalPriceA = calculateTotalPriceA(applesWeightA, strawberriesWeightA);
        System.out.println("顾客A购买的总价为：" + totalPriceA + "元");
        int applesWeightB = 5;
        int strawberriesWeightB = 3;
        int mangoesWeightB = 2;
        double totalPriceB = calculateTotalPriceB(applesWeightB, strawberriesWeightB, mangoesWeightB);
        System.out.println("顾客B购买的总价为：" + totalPriceB + "元");
        int applesWeightC = 5;
        int strawberriesWeightC = 3;
        int mangoesWeightC = 2;
        double totalPriceC = calculateTotalPriceC(applesWeightC, strawberriesWeightC, mangoesWeightC);
        System.out.println("顾客C购买的总价为：" + totalPriceC + "元");
        int applesWeightD = 5;
        int strawberriesWeightD = 3;
        int mangoesWeightD = 2;
        double totalPriceD = calculateTotalPriceD(applesWeightD, strawberriesWeightD, mangoesWeightD);
        System.out.println("顾客D购买的总价为：" + totalPriceD + "元");
    }

}

