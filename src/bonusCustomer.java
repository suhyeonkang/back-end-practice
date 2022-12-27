public abstract class bonusCustomer implements Customer{
    String name;
    String grade;
    int points;
    double bonusRatio;

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public String getGrade() { return grade; }

    public void setGrade(String grade) { this.grade = grade; }

    public int getPoints() { return points; }

    public void setPoints(int points) { this.points = points; }

    public double getBonusRatio() { return bonusRatio;}

    public void setBonusRatio(double bonusRatio) { this.bonusRatio = bonusRatio; }
}
