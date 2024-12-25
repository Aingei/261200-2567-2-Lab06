public class Duck extends Animal implements Flyable{
// extend only one (action implement)
    String name;
    public Duck(String name){
        this.name = name;
    }
    // การ prirnt แบบเจาะจง

    @Override
    void sound() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }

    @Override
    public void glide() {
        System.out.println("hi-yahhh!");
    }

    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal);
        // this is duck this.toString()
    }

    public String toString(){
        return "เป็ด: "+ this.name;
    }

    // การ print แบบเจาะจง
}
