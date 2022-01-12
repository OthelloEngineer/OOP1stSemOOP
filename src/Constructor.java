public class Constructor {
    public static void main(String[] args) {
         TestClass test = new TestClass();
         TestClass test1 = new TestClass("toaster");

         Integer cake = 2;
         Integer cake1 = 2;

         Integer bloop = new Integer(2);
         Integer bloop1 = new Integer(2);

        System.out.println(cake == cake1);
        System.out.println(bloop == bloop1);
        test1.printThingie();

        OuterClass outerClass = new OuterClass(true, "cake123");
        OuterClass outerClass1 = new OuterClass(true, "cake123");
        System.out.println(outerClass.innerClass.getCake());
        outerClass.innerClass.setCake("good cake");
        System.out.println(outerClass.innerClass.getCake());
        System.out.println(outerClass1.innerClass.getCake());
    }
}


class TestClass{
    private String foo;
    private int bar;

    TestClass(String foo, int bar){
        this.bar = bar;
        this.foo = foo;
    }

    TestClass(String foo){
        this(foo, 15);
    }

    TestClass(){
        this("toast");
    }


    public void printThingie(){
        System.out.println(foo + " " +  bar);
    }
}

class OuterClass{
    InnerClass innerClass;
    InnerClass innerClass2;
    String test;

    OuterClass(Boolean hasInnerClass, String test){
        this.test = test;
        if(hasInnerClass) {
            this.innerClass = new InnerClass();
            this.innerClass2 = new InnerClass();
        }
    }

    static class InnerClass{
        private String cake = "cake";

        public String getCake(){
            return this.cake;
        }
        public void setCake(String cake){
            this.cake = cake;
        }
    }
}
