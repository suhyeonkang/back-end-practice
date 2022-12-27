public class VipBonusCustomer extends bonusCustomer {

    public VipBonusCustomer(String name) {
        super.name = name;
        super.grade = "VIP";
        super.points = 0;
        super.bonusRatio = 0.3;
    }

    @Override
    public String getCustomerInfo() {
        return "[VIP] 안녕하세요." + name + "회원님. 회원님의 적립률은 " + bonusRatio + "입니다.";
    }

    @Override
    public int calculatePrice(int price) {
        int bonus = (int)(price * bonusRatio);
        points += bonus;
        System.out.println("보너스 포인트" + bonus + "가 적립되었습니다. 현재 보너스 포인트" + points);
        return price;
    }
}
