abstract class Bird{
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird{
void fly(){
    System.out.println("eagle soars high in the sky");
}
void makeSound(){
    System.out.println("eagle makes screeching sound");
}
}

class Hawk extends Bird{
    void fly(){
        System.out.println("hawk glides gracefully in air");
    }
    void makeSound(){
        System.out.println("hawk makes distinct cry");
    }
    }

class AbstractMain{
    public static void main(String args[]){
        Eagle e=new Eagle();
        Hawk h=new Hawk();
        e.fly();
        e.makeSound();
        h.fly();
        h.makeSound();
        
    System.out.println("name:sohan t sanjeev usn:2023bms02532");
    }
}