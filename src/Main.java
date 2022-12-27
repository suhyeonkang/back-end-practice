import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 고객 객체 생성
        Customer customerLee = new SilverSalesCustomer("이순신");
        Customer customerShin = new GoldSalesCustomer("신사임당");
        Customer customerHong = new VipSalesCustomer("홍길동");
        Customer customerYul  = new SilverBonusCustomer("이율곡");
        Customer customerYou = new GoldBonusCustomer("김유신");
        Customer customerkwon = new VipBonusCustomer("권율");

        // 고객 리스트 생성, 추가

        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerYou);
        customerList.add(customerkwon);

        // 고객 정보 조회 & 가격 계산

        int price = 10000;
        for(Customer customer : customerList){
            String msg = customer.getCustomerInfo();
            System.out.println(msg);
            System.out.println("지불할 금액:" + customer.calculatePrice(price));
        }


    }
}