public class SilverSalesCustomer extends salesCustomer{

    // 생성자 정의 : 객체가 생성될 때 필드를 초기화 하는 역할을 수행함
    public SilverSalesCustomer(String name){
        super.name = name;
        super.grade = "Silver";
        super.salesRatio = 0.1;


    }


    @Override
    public String getCustomerInfo() {
        return "[Silver] 안녕하세요. " + name + "회원님. 회원님의 할인율은 " + salesRatio + "입니다.";
    }

    @Override
    public int calculatePrice(int price) {
        int cost = (int)(price * (1- salesRatio));
        return cost;
    }
}
