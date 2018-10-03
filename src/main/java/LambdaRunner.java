import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaRunner{
    public static <T, V> V executeFunction(Function<T, V> function, T argument){
        return function.apply(argument);
    }

    public static <T, V, R> R executeBiFunction(BiFunction<T, V, R> function, T argumentOne, V argumentTwo){
        return function.apply(argumentOne, argumentTwo);
    }
}
