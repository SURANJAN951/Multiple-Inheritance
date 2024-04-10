package Inheritance;

class Multi1
{
    void Biology(){
        System.out.println("This is Boilogy");
    }
}
class Multi2{
 void disp(){
     System.out.println("I am display");
 }
}

class Man1 extends Multi1{ // Error

}
class Man1 extends Multi2{ // Error

}


public class Multiple {
    Multi1 s = new Multi1();
    s.disp();
}
