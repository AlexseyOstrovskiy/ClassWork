
public class test {
    @codeSmell(author = "bob")
    private  int a;
    private void a(){
    }

    @codeSmell(author = "Pit")
    private  int b;
    private void b(){
    }

    @run
    public void testForRun(){
        System.out.println("Im working");
    }

}
