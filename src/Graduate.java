class Graduate implements StudentInterface, TeacherInterface {
    private final String name;
    private final String sex;
    private final int age;
    private double fee;
    private double pay;

    public Graduate(String name, String sex, int age, double fee, double pay) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fee = fee;
        this.pay = pay;
    }

    // 实现 StudentInterface 接口的方法
    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double getFee() {
        return fee;
    }

    // 实现 TeacherInterface 接口的方法
    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double getPay() {
        return pay;
    }
}
