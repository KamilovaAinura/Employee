public class CEO extends Manager {
    private boolean hasCompanyCar;

    public CEO(){
    }

    public CEO(String name, String salary, int age, boolean hasStocks) {
        super(name, salary,age,  hasStocks);
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public void goToDayOff(){
        System.out.println("Причина отпуска: семейный отдых");
    }


}




