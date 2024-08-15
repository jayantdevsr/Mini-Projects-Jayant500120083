interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

interface Hunter extends Animal {
    void hunt();
}

class Lion implements Hunter {
    @Override
    public void eat() {
        System.out.println("Lion is eating.");
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting.");
    }

    public void roar() {
        System.out.println("Lion is roaring.");
    }
}

public class code2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.play(); 
        myDog.bark(); 

        System.out.println();

        Lion myLion = new Lion();
        myLion.eat();  
        myLion.hunt(); 
        myLion.roar(); 
    }
}
