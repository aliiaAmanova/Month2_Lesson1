import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor(Color color) {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter(Shelter shelter) {
        return this.shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(12)+ 1;
    }
    public final String getInfo(){
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }
}
