public interface Test {
    int m();
    String v();

    default  void test(){
        System.out.println("im default funcitons");
    }

}
