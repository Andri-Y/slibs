import java.util.Map;

public class SlibsKernel {
    public static void main(String[] args) {
        Map<String, String> environment = System.getenv();
        environment.forEach((String key, String value)->{
            System.out.println("\nk:"+key+"; v:"+value);
        });
    }
}
