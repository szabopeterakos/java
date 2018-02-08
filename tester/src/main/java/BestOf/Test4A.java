package BestOf;

// LINK ANOTHER EXAMPLE: https://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html#jls-12.5

public class Test4A {
//    int f(){return 0;}
//    static   int f(){return 0;}


}

//            Can I explain the reason, why the value 4 has not been assigned to variable i when the superconstructor calls the overridden print() method, like this?
//            I. All instance variables are initialized with their default values when their class is loaded. Thus, i is initialized with 0, when class B is loaded.
//            II. The actual initialization with concrete values happens in this order:
//
//            1. all static initializer blocks and static variables are initialized down the class hierarchy, i.e. from the uppermost superclass first down to the calling subclass last - in our mock question there are no static block or variable at all;
//
//            2. all instance initializer blocks and instance variables of the uppermost superclass are initialized (in whatever order they appear in the code) - in our mock question we don't have such.
//
//            3. the constructor of the uppermost superclass is initialized - in our mock question this is class' A no-arg constructor that calls the overridden print() method of (sub)class B:
//            Since class' B instance variables have only been assigned to default values so far (here i=0;), 0 is printed to the console. This is, why we see 0 instead of 4!
//
//            4. all instance initializer blocks and instance variables of the second uppermost superclass are initialized - as in our mock question there is only one superclass A, we've just arrive at our base class B: NOW i is set to 4 - but not printed out yet!
//
//            5. the constructor of the second uppermost superclass is initialized - again we arrive at the base class B and its default constructor. NOW main() calls the overridden print() method which prints 4 to the console.
//
//            Summary: As step 4 has not run by the time the superconstructor calls the overridden print() method, which at this point can only return the default value of 0 for variable i, we get an console output of 0 4 instead of 4 4.
//
//            Step 1 is executed first upon class loading for all classes. After that the instance initialization and constructor execution is done together per class down the class hierarchy - (NOT instance initialization of all classes followed by constructor execution of all classes)! This is why i has not been set to 4 but is still 0 when the superconstructor calls the overridden print() method.
//


class A {
    A() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class B extends A {
    int i = 4;

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
