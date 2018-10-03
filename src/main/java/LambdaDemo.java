import Human.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {
    public static final Function<String, Integer> lengthOfString = String::length;

    public static final Function<String, Character> firstSymbolOfString = (s)->!"".equals(s) ? s.charAt(0) : null;

    public static final Function<String, Boolean> stringWithoutSpace = (s)->!s.contains(" ");

    public static final Function<String, Integer> countOfWordInString = (s)->
    {
        int r = 0;
        if (!s.isEmpty()) {
            char[] c = s.toCharArray();
            if(c[0]!=',') r++;
            for (int i = 1; i < c.length - 1; i++)
                if (',' == c[i] && c[i + 1] != ',') r++;
        }
        return r;
    };

    public static final Function<Human, Integer> ageOfHuman = Human::getAge;

    public static final Function<Human [], Boolean> equalsOfHumans = (h)->
            h[0].getSurname().equals(h[1].getSurname());

    public static final Function<Human, String> fullName = Human::getFullName;

    public static final Function<Human, Human> growUpForAYear = (h)->(new Human(h.getSurname(), h.getName(),
            h.getPatronymic(), h.getAge()+1, h.getGender()));

    public static final BiFunction<Human[], Integer, Boolean> youngerMaxAge = (h, max)->
            h[0].getAge()<max && h[1].getAge()<max && h[2].getAge()<max;
}
