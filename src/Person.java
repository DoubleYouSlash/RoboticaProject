public class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
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
}
