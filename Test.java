public class Test {
  final int a ;
  public Test (int i) {
      a = i;
  }
    public static void main(String [] args) {
     Test t = new Test(10);
        System.out.println("blank final var = "+t.a);
        //t.a =45;
    }

}
