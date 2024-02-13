class A{
    synchronized void foo(B b){
        String name=Thread.currentThread().getName();
        System.out.println(name+"entered a.foo");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("exception occured");
        }
        System.out.println(name+"entering b.last()");
        b.last();

    }
    void last(){
        System.out.println("inside a last");
    }
}

class B
