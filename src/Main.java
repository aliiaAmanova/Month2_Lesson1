public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sidet", "Lejat"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Dog dog = new Dog("Rex","Ovcharka", commands, Color.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гав Гав");


        Shelter shelter1 = new Shelter("Priyut", "Kurmandjan Datka 5");
        Dog dog1 = new Dog("Lada"," Corgi", Color.WHITE, shelter1);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Гав Гав");

        Shelter shelter2 = new Shelter("Mir", "Ankara 23");
        Dog dog2 = new Dog("Stella", "Mops",Color.BLACK,shelter2);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("Тяф тяф");
    }
}