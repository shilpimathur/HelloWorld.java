public class HelloWorld {

    public static void main(String[] args)
    {
        LunchSession anotherclass = new LunchSession();
        MyMathClass myMathClass = new MyMathClass();
        int num1 = 2;
        int num2 = 3;
        String name1= "SHILPI";

        System.out.println("Hello sweet Shilpi");
        System.out.println("today");

       anotherclass.printsomething();
       System.out.println(myMathClass.addtwonumbers(num1,num2));


       for (int v=0;v<5;v++) {
           System.out.println(v);
           System.out.println("Hello " + name1);
       }
    }
}
