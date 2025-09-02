class Animal
{
void makeSound()
{
System.out.println("Animal sound");
}
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("Bow");
}
}
public class Myclass1
{
public static void main(String[] args)
{
Animal obj1=new Animal();
obj1.makeSound();
Dog obj2=new Dog();
obj2.makeSound();
}
}
