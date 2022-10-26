public class Spesialist extends Employee{

    public Spesialist(){
    }

    private int levevl;

    public int getLevevl() {
        return levevl;
    }

    public void setLevevl(int levevl) {
        this.levevl = levevl;
    }

    public Spesialist(String name, String salary, int age, int levevl) {
        super(name, salary, age);
        this.levevl = levevl;
    }

    public Spesialist(int levevl) {
        this.levevl = levevl;
    }

    public void goToDayOff(){
        System.out.println("Причина отпуска: заболел гриппом");
    }


}

