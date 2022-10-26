public class Manager extends Employee{

    private boolean hasStocks;

    public Manager() {

    }

    public void Manager(){

    }public Manager(String name, String salary, int age, boolean hasStocks) {
        super(name, salary, age);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void goToDayOff(){
        System.out.println("Причина отпуска: по семейным обстоятельствам");
    }


}


