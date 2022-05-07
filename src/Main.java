public class Main {
    public static void main(String[] args) {

        // Задача 1

        String firstName = "Cемён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName +" "+firstName+" "+middleName;
        System.out.println(fullName);

        // Задача 2

        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullNameUp);

        // Задача 3

        String fullNameNoYo = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullNameNoYo);



    }
}