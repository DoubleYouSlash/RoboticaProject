import java.util.ArrayList;

public class Person {
    private static final String FEMALE_GENDER = "f";
    private static final String MALE_GENDER = "m";
    private String name;
    private int age;
    private String gender; //male by default

    public Person(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }

    public Person() {
        name = null;
        age = 0;
        gender = MALE_GENDER;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getFemaleGender() {
        return FEMALE_GENDER;
    }

    public static String getMaleGender() {
        return MALE_GENDER;
    }

    public String toString(){
        return name + "=>" + age + "," + gender;
    }

    public boolean isDefault() {
        return name == null && age == 0 && gender.equals(MALE_GENDER);
    }
}
