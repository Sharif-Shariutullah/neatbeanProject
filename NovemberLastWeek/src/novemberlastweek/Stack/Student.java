
package novemberlastweek.Stack;


public class Student {
    
    
    private String name;
    private String school;
    private int Age;

    public Student() {
    }

    
    
    public Student(String name, String school, int Age) {
        this.name = name;
        this.school = school;
        this.Age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", school=" + school + ", Age=" + Age + '}';
    }
    
    
    
    
    
    
    
}
