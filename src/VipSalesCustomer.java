public class VipSalesCustomer extends salesCustomer{

    public VipSalesCustomer(String name) {
        super.name = name;
        super.grade = "VIP";
        super.salesRatio = 0.3;
    }

    @Override
    public String getCustomerInfo() {
        return "[VIP] 안녕하세요. " + name + "회원님. 회원님의 할인율은 " + salesRatio + "입니다.";
    }

    @Override
    public int calculatePrice(int price) {
        int cost = (int)(price * (1- salesRatio));
        return cost;
    }
}
