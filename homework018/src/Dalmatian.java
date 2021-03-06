public class Dalmatian extends Dog {
    String breed;
    int height;

    public Dalmatian(String dogName, int dogAge, String breed, int height) {
        super(dogName, dogAge);
        this.breed = breed;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Dalmatian " + breed + ", " + height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
