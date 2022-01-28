package some;

public class Main {
    public static void main(String[] args) {
        MyBuilder myBuilder = MyBuilder
                .getBuilder()
                .setFullName("Bobby Worker")
                .setPosition("plumber")
                .setSalary(2000)
                .build();
        System.out.println(myBuilder.getFullName() + " " + myBuilder.getPosition() + " " + myBuilder.getSalary());

        MyBuilder myBuilder1 = MyBuilder
                .getBuilder()
                .setKpi(1)
                .build();
        myBuilder1.getKpi().printKpi();
    }
}
