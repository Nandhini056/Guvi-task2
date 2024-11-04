public class person {
    private String name;
    private int age;
    public person(String name){
        this.name = name;
        this.age = 18;
    }
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayAge(){
        System.out.println(name+"'s age is" + age);
    }

    public String getName() {
        return name;
    }
public void SetName(String Name){
    this.name = name;
}
public int getAge(){
        return age;
}
public void setAge(int age){
        this.age = age;
}
    public static void main(String[] args){
        person person1 = new person("bob");
        person person2 = new person("Tom,",25);
        person1.displayAge();
        person2.displayAge();

    }

}
