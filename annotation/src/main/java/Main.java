import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Field[] fields = test.class.getDeclaredFields();


        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            Boolean q = field.isAnnotationPresent(codeSmell.class);
            if (q) {
                System.out.println("class " + test.class.getName() + "smell, author " + field.getAnnotation(codeSmell.class).author());
            }

        }

       /* test bas = new test();
        bas.testForRun();*/

        Method[] declaredMethods = test.class.getDeclaredMethods();

        for (Method m : declaredMethods) {

            if (m.isAnnotationPresent(run.class)){
                try {
                    m.invoke(new test() );
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

     /*   Field[] fieldsRun = (Field[]) declaredMethods;
        for (int i = 0; i < fieldsRun.length; i++) {
            Field fieldRun = fieldsRun[i];
            Boolean q = fieldRun.isAnnotationPresent(codeSmell.class);
            if (q) {
                fie
            }

        }*/
    }
}
