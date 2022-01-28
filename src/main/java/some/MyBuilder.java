package some;

public class MyBuilder {
    private String fullName;
    private String position;
    private int salary;
    private KPI kpi;

    private MyBuilder() {
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public KPI getKpi() {
        return kpi;
    }

    public static Builder getBuilder() {
        return new MyBuilder().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setFullName(String employeeName) {
            fullName = employeeName;
            return this;
        }

        public Builder setSalary(int employeeSalary) {
            salary = employeeSalary;
            return this;
        }

        public Builder setPosition(String employeePosition) {
            position = employeePosition;
            return this;
        }

        public Builder setKpi(int employeeKpi){
            kpi = new KPI(employeeKpi);
            return this;
        }

        public MyBuilder build() {
            return MyBuilder.this;
        }
    }
}
