public abstract  class Employee{
    private String name;
    private String salary;
    private int  age;
    public Employee(String name, String salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;

    }
    public Employee() {
    }
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }public void setAge(int age) {
        this.age = age;
    }
    public String getSalary() {
        return salary;
    }public void setSalary(String salary) {
        this.salary = salary;
    }



    public abstract void goToDayOff();
    @Override
    public String toString() {
        return "Имя:"+ name+"\nЗарплата:"+ salary+"\nВозраст:"+age;

    }
}

