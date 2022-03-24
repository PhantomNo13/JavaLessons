public class InheritanceRound2 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Deer d = new Deer();
        Monkey m = new Monkey();
        Zoo z = new Zoo();
        z.alltogether(t);
        t.movement();
        System.out.println();
        z.alltogether(d);
        d.movement();
        System.out.println();
        z.alltogether(m);
        m.movement();
        Animal a = new Tiger();
        Tiger f = (Tiger)a;
        f.movement();


    }
}
class Animal{
    void eat(){

    }
    void sleep(){
        System.out.println("Sleeping");
    }

}
class Tiger extends Animal{
    void eat(){
        System.out.println("Growl nom nom nom");
    }
    void movement(){
        System.out.println("Crouching");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Peep nom nom nom");
    }
    void movement(){
        System.out.println("Prancing");
    }
}
class Monkey extends Animal{
    void eat(){
        System.out.println("Beep beep");
    }
    void movement(){
        System.out.println("OYEYOYEYOYEYOYEA MY NAME IS TARZAN YOU CAN BE MY FRIEND");
    }
}

class Zoo{
    void alltogether(Animal ref){
        ref.eat();
        ref.sleep();

    }
}