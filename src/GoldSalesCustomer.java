public class GoldSalesCustomer extends salesCustomer{

    public GoldSalesCustomer(String name) {
        super.name = name;
        super.grade = "Gold";
        super.salesRatio = 0.2;
    }


    @Override
    public String getCustomerInfo() {
        return "[Gold] 안녕하세요. " + name + "회원님. 회원님의 할인율은 " + salesRatio + "입니다.";
    }

    @Override
    public int calculatePrice(int price) {
        int cost = (int)(price * (1- salesRatio));
        return cost;
    }
}
