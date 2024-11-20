public class Main {
    public static void main(String[] args) {

        // Строки.
        System.out.println("Строки");

        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("«Ф. И. О. сотрудника — " + fullName + "»");

        System.out.println("Задание №2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("«Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase + "»");

        System.out.println("Задание №3");
        String firstNameNew = "Семён";
        String middleNameNew = "Семёнович";
        String lastNameNew = "Иванов";
        String fullNameNew = lastNameNew + " " + firstNameNew + " " + middleNameNew;
        String correctedFullName  = fullNameNew.replace('ё', 'е');
        System.out.println("«Данные Ф. И. О. сотрудника — " + correctedFullName  + "»");
    }
}