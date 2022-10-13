final class p13 {
    final int no = 10; // final variable must be initialized

    final void display() {
        System.out.println("Method final class");
    }
}
// class p13_1 extends p13 // can not inherit the final class
// {
//     void display() // can not override final method
//     {
//         no = 20; // final variable can not be change
//         System.out.println("Method of subclass");
//     }
//     public static void main(String[] args) {
//         p13_1 d = new p13_1();
//         d.display();
//     }
// }