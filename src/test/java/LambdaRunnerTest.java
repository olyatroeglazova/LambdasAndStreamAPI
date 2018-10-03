import Human.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LambdaRunnerTest {
    LambdaDemo lambdaDemo = new LambdaDemo();
    LambdaRunner lambdaRunner = new LambdaRunner();

    @Test
    public void lengthOfStringTest(){
        String s = "Length of string test";
        int length = s.length();
        assertTrue(length == lambdaRunner.executeFunction(lambdaDemo.lengthOfString, s));
    }

    @Test
    public void firstSymbolOfStringTest(){
        String s = "First symbol of string test";
        char c = s.charAt(0);
        assertTrue(c == lambdaRunner.executeFunction(lambdaDemo.firstSymbolOfString, s));
    }

    @Test
    public void firstSymbolOfStringTest2(){
        String s = "";
        assertTrue(null == lambdaRunner.executeFunction(lambdaDemo.firstSymbolOfString, s));
    }

    @Test
    public void stringWithoutSpaceTest(){
        String s = "stringWithoutSpace";
        assertTrue(lambdaRunner.executeFunction(lambdaDemo.stringWithoutSpace, s));
    }

    @Test
    public void countOfWordInStringTest(){
        String s = "Count, of, word, in, string, test";
        int countOfWords = 6;
        assertTrue(countOfWords == lambdaRunner.executeFunction(lambdaDemo.countOfWordInString, s));
    }

    @Test
    public void countOfWordInStringTest2(){
        String s = "test,,";
        int countOfWords = 1;
        assertTrue(countOfWords == lambdaRunner.executeFunction(lambdaDemo.countOfWordInString, s));
    }

    @Test
    public void countOfWordInStringTest3(){
        String s = "";
        int countOfWords = 0;
        assertTrue(countOfWords == lambdaRunner.executeFunction(lambdaDemo.countOfWordInString, s));
    }

    @Test
    public void countOfWordInStringTest4(){
        String s = " ";
        int countOfWords = 1;
        assertTrue(countOfWords == lambdaRunner.executeFunction(lambdaDemo.countOfWordInString, s));
    }

    @Test
    public void countOfWordInStringTest5(){
        String s = ",";
        int countOfWords = 0;
        assertTrue(countOfWords == lambdaRunner.executeFunction(lambdaDemo.countOfWordInString, s));
    }

    @Test
    public void ageOfHumanTest(){
        Human man = new Human("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE );
        int age = man.getAge();
        assertTrue(age == lambdaRunner.executeFunction(lambdaDemo.ageOfHuman, man));
    }

    @Test
    public void ageOfStudentTest(){
        Student man = new Student("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE,
                "OmSU", "IMIT", "Applied Mathematics" );
        int age = man.getAge();
        assertTrue(age == lambdaRunner.executeFunction(lambdaDemo.ageOfHuman, man));
    }

    @Test
    public void equalsOfHumansTest(){
        Human manOne = new Human("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE );
        Human manTwo = new Human("Ivanov", "Petr", "Petrovich", 24, Gender.MALE  );
        Human[] array = {manOne, manTwo};
        assertTrue(lambdaRunner.executeFunction(lambdaDemo.equalsOfHumans, array));
    }

    @Test
    public void equalsOfStudentsTest(){
        Student manOne = new Student("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE,
                "OmSU", "IMIT", "Applied Mathematics" );
        Student manTwo = new Student("Ivanov", "Petr", "Petrovich", 24, Gender.MALE,
                "a", "b", "c");
        Student[] array = {manOne, manTwo};
        assertTrue(lambdaRunner.executeFunction(lambdaDemo.equalsOfHumans, array));
    }

    @Test
    public void fullNameOfHumanTest(){
        Human man = new Human("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE );
        String fullName = "Ivanov Ivan Ivanovich";
        assertTrue(fullName.equals(lambdaRunner.executeFunction(lambdaDemo.fullName, man)));
    }

    @Test
    public void fullNameOfStudentTest(){
        Student man = new Student("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE,
                "OmSU", "IMIT", "Applied Mathematics" );
        String fullName = "Ivanov Ivan Ivanovich";
        assertTrue(fullName.equals(lambdaRunner.executeFunction(lambdaDemo.fullName, man)));
    }

    @Test
    public void growUpForAYearTest(){
        Human man = new Human("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE);
        Human newMan = new Human(man.getSurname(), man.getName(), man.getPatronymic(), man.getAge()+1, man.getGender());
        assertTrue(newMan.equals(lambdaRunner.executeFunction(lambdaDemo.growUpForAYear, man)));
    }

    @Test
    public void youngerMaxAgeTest(){
        Human humanOne = new Human("Ivanov", "Ivan", "Ivanovich", 24, Gender.MALE );
        Human humanTwo = new Human("Petrov", "Petr", "Petrovich", 20, Gender.MALE);
        Human humanThree = new Human("Ivanova", "Vaselisa", "Ivanovna", 2, Gender.FEMALE );
        Human[] array = {humanOne, humanTwo, humanThree};
        int maxAge = 30;
        assertTrue(lambdaRunner.executeBiFunction(lambdaDemo.youngerMaxAge, array, maxAge));
    }
}