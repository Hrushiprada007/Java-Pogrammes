// Superclass (Base class)
class Animal3 {
    String name;

    // Constructor
    public Animal3(String name) {
        this.name = name;
    }

    // Method
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass (Derived class)
class Dog extends Animal3 {  // Inherits from Animal
    // Constructor
    public Dog(String name) {
        super(name);  // Call the superclass constructor
    }

    // Override the speak method
    @Override
    public void speak() {
        System.out.println(name + " barks!");
    }
}

// Subclass (Derived class)
class Cat extends Animal3 {  // Inherits from Animal
    // Constructor
    public Cat(String name) {
        super(name);  // Call the superclass constructor
    }

    // Override the speak method
    @Override
    public void speak() {
        System.out.println(name + " meows!");
    }
}

// Main class
class Don {
    public static void main(String[] args) {
        // Create objects
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Call methods
        dog.speak();  // Output: Buddy barks!
        cat.speak();  // Output: Whiskers meows!
    }
}