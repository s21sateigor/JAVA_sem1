import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SixthExercise
{
    public static void main(String[] args) {
        byte[] byteArray = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101, 32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};

        String str = new String(byteArray, StandardCharsets.UTF_8);

        System.out.println(str);
    }
}
