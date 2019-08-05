package VerhovnaRada;

public class Human {
    double weight;
    double height;

   public Human() {
    }

   public Human(double weight, double height) {
       this.weight= weight;
       this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) { this.height = height; }


    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
