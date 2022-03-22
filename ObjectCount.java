public class ObjectCount
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        System.out.println(Dog.objects);
        Dog d2 = new Dog();
        System.out.println(Dog.objects);

        Dog d3 = new Dog("A", "B", 3);
        System.out.println(Dog.objects);

    }
}
class Dog
{
    String name;
    String color;
    int cost;
    static int objects;
    {
        objects+=1;
    }
    Dog()
    {

    }
    Dog(String name, String color, int cost)
    {
        this.name=name;
        this.color=color;
        this.cost=cost;
    }

}