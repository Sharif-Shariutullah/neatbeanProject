/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-5
 */
public class ChapterNine {

    private double value;  
    private String name;
  

    // Setter method to set the value
    public void setValue(double value, String name) {
        this.value = value;
        this.name = name;
    }

  
    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        ChapterNine example = new ChapterNine();

        example.setValue(10.5);

        double retrievedValue = example.getValue();
          System.out.println("The retrieved value is: " + retrievedValue);
    }

    private void setValue(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

