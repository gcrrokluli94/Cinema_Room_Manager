class Cat {

    // write static and instance variables
    private String name;
    private int age;
    private static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        // do not forget to check the number of cats
        if(counter > 5){
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
       return counter;
    }
}
