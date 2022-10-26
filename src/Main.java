
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Adamson");
        developer.setAge(18);
        developer.setSalary("45000");
        System.out.println(developer);
        developer.goToDayOff();
        System.out.println("------");

        Spesialist spesialist = new Spesialist();
        spesialist.setName("John");
        spesialist.setAge(23);
        spesialist.setSalary("50000");
        System.out.println(spesialist);
        spesialist.goToDayOff();
        System.out.println("------");

        Manager manager = new Manager();
        manager.setName("Alex");
        manager.setAge(25);
        manager.setSalary("48000" );
        System.out.println(manager);
        manager.goToDayOff();
        System.out.println("------");

        CEO ceo = new CEO();
        ceo.setName("Baby Boss");
        ceo.setAge(32);
        ceo.setSalary("76000" );
        System.out.println(ceo);
        ceo.goToDayOff();
        System.out.println("------");

      }
}

