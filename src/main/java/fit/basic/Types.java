package fit.basic;

public class Types {
    public static void variaveis() {
        System.out.println("Iniciando variáveis");
        String name = "prof emilio";
        int age = 32;
        double height = 1.78;
        double weight = 90;
        // Non primitive
        Integer ageOrNull = null;

        // if odd, then zero
        if (age % 2 != 0) age = 0;

        // boxing!!! (auto wrapping)
        if (ageOrNull == null) ageOrNull = age;

        System.out.printf("%s %d %.2f %.2f %d %n", name, age, height, weight, ageOrNull);
    }
}
