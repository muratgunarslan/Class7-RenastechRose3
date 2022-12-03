package Day28_InheritanceandAbstraction;

public class Topic3_Abstraction {
    public static void main(String[] args) {
        Cat MyCat = new Cat();
        MyCat.Walk();

        Dolphin MyDolphin = new Dolphin();
        MyDolphin.Swim();

        Lion MyLion = new Lion();
        MyLion.Walk();

        System.out.println("--------------------------");
        TerrestrialAnimals AnAnimal;
        AnAnimal = new Lion();
        AnAnimal.Walk();
    }
}
//The animals which live in water. Examples : Octopus, Fish, Shark
interface AquaticAnimals{
    void Swim(); //This is an ABSTRACT method
}

// The animals which live in land. Examples : Cow, Lion, Deer
interface TerrestrialAnimals{
    void Walk(); //This is an ABSTRACT method
}

class Cat implements TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("Cat is walking.");
    }
}
//What is different between extends and implements keyword.
class Lion extends Cat{
    @Override
    public void Walk() {
        System.out.println("Lion is walking");
    }
}

class Dolphin implements AquaticAnimals{
    @Override
    public void Swim() {
        System.out.println("Dolphin is swimming.");
    }
}
// Can you implement a class from more than one interfaces?
class Penguin implements AquaticAnimals, TerrestrialAnimals{
    @Override
    public void Swim() {
        System.out.println("Penguin is swimming!");
    }

    @Override
    public void Walk() {
        System.out.println("Penguin is walking!");
    }
}


// Can you extend a class from more than one class?
//NO, Class cannot extend multiple classes
/* I cannot write below code
class Tiger extends Cat,Lion{
}
 */

/*

Abstraction can be achieved with either abstract classes or interfaces.
Abstraction is the process of separating ideas from their action.
Interfaces are like skeletons. If you want to build a human, you should use that skeleton.
Abstract classes are like skeletons, but with some meat on them as well.
It's just there to make your work easier.
You can consider an abstract class to be an interface, which already has some implementation.

You do abstraction when deciding what to implement.
You do encapsulation when hiding something that you have implemented.

Interfaces simply create a kind of structure for your classes to denote
that your class should have a defined and agree-upon structure.
For example, all animals eat and make sounds. Thus you can have an interface,
called IAnimal which only mentions that classes should Eat, and MakeSound.

Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body.
 The body is provided by the subclass (inherited from).

 An abstract class can have both abstract and regular methods.
 */