public class SilverBonusCustomer  extends bonusCustomer{

    public SilverBonusCustomer(String name) {
        super.name = name;
        super.grade = "Silver";
        super.points = 0;
        super.bonusRatio = 0.1;
    }

    @Override
    public String getCustomerInfo() {
        return "[Silver] 안녕하세요" + name + "회원님. 회원님의 할인율은 " + bonusRatio + "입니다.";
    }

    @Override
    public int calculatePrice(int price) {
        int bonus = (int)(price * bonusRatio);
        points += bonus;
        System.out.println("보너스 포인트" + bonus + "가 적립되었습니다. 현재 보너스 포인트 " + points);
        return price;
    }
}
