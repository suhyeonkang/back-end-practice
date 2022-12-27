public class GoldBonusCustomer extends bonusCustomer{

    public GoldBonusCustomer(String name) {
        super.name = name;
        super.grade = "Gold";
        super.points = 0;
        super.bonusRatio = 0.2;

    }

    @Override
    public String getCustomerInfo() {
        return "[Gold] 안녕하세요" + name + "회원님. 회원님의 적립률은" + bonusRatio + "입니다.";
    }

    @Override
    public int calculatePrice(int price) {
        int bonus = (int)(price * bonusRatio);
        points += bonus;
        System.out.println("보너스 포인트 " + bonus + "가 적립되었습니다. 현재 보너스 포인트" + points);
        return price;
    }
}
