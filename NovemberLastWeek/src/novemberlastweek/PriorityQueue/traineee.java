package novemberlastweek.PriorityQueue;

public class traineee implements Comparable<PriorityQueue> {

    private String name;
    private String University;
    private int Age;

    public traineee(String name, String University, int Age) {
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

    @Override
    public int compareTo(PriorityQueue o) {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
};
    
}
