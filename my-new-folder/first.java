class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);

        alice.sayHello();
        bob.sayHello();

        System.out.println("Older person: " + Person.older(alice, bob).getName());
    }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.printf("Hi, I'm %s and I'm %d years old.%n", name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Person older(Person a, Person b) {
        return (a.age >= b.age) ? a : b;
    }
}