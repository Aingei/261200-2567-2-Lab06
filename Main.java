public class Main {
    public static void main(String[] args) {
//      Animal animal = new Animal();
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwig = new Owl();
//        wagyu.sound();
//        donald.sound();
//        burin.sound();
//        hedwig.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        Duck jiatongheng = new PekingDuck("JTH");
        // Duck jia = new PekingDuck("JTH") = can do it because PekingDUck is Duck Peking extend Duck
        // but PEkingDuck jia = new Duck("JTH") = can't because all duck aren't PekingDuck
        jiatongheng.clean(daisy);
        jiatongheng.fly(); // ทำไรก็ได้ที่เป็นเป็ด
        // polymorphism


        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());

    }
}