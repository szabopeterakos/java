package trick01;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("second");
    }

    public Animal() {
        this("default");
        System.out.println("first");
    }



}

class Another {

    public static void main(String[] args) {
        Animal a = new Animal("Crorodile");
    }

}