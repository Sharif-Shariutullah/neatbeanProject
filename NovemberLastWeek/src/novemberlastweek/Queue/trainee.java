package novemberlastweek.Queue;

public class trainee {

    private String name;
    private String University;
    private int Age;

    public trainee(String name, String University, int Age) {
        this.name = name;
        this.University = University;
        this.Age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "trainee{" + "name=" + name + ", University=" + University + ", Age=" + Age + '}';
        
    }

}
