public class Ver {
    private String name;
    private int age;

    //constructor
    public Ver(String name, int age) {
        this.name = name;
        name = "Kram";
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void ver(){
        System.out.println("Ver");
    }
}
