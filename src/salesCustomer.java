public abstract class salesCustomer implements Customer {

    String name;
    String grade;
    double salesRatio;

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}
    public String getGrade() {return grade;}
    public void setGrade(String grade) {this.grade = grade;}
    public double getSalesRatio() { return salesRatio;}
    public void setSalesRatio(double salesRatio) {this.salesRatio = salesRatio;}


}
