public class Person{
    private int age;
    private String name;
    private static int numberOfPeople = 0;

    public Person(int ageParam, String nameParam){
        age = ageParam;
        name = nameParam;
        numberOfPeople++;
    }

    public static int peopleCount(){
        return numberOfPeople;
        //static methods can only call static methods 
    }
}