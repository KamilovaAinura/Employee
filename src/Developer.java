public class Developer extends Employee {
    private String rang;
    public Developer() {
    }
    @Override
    public void goToDayOff(){
        System.out.println("Причина отпуска: по уважительной  причине");
    }

}
