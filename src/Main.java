public class Main {
    public static void main(String[] args) {
        System.out.println("Strings");
        // Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        // Задача 2

        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);

        // Задача 3

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}