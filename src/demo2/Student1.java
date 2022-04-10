package demo2;

public class Student1 {
    private String name;
    private int age;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int s){
        age=s;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(age+","+name);
    }
}
