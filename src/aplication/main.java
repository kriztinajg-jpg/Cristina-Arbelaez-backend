package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // 2. Definición de constantes
    final static int CURRENT_YEAR = 2026;

    public static void main(String[] args) {

        // Mensaje de saludo
        final String GREETING_MESSAGE = "Welcome to the Java student system";

        // 3. Arreglo de estudiantes y años de nacimiento
        String[] namesStudents = {"Laura", "Pablo", "Maria", "Juan", "Ana"};
        int[] birthYears = {2000, 2004, 2008, 1991, 1997};

        // 4. Lista de edades
        List<Integer> agesStudentList = new ArrayList<>();

        // 5. Implementación de lógica
        showMessage(GREETING_MESSAGE);

        // Llenar la lista de edades
        fillAgesList(agesStudentList, birthYears);

        // Listar estudiantes
        listStudents(namesStudents, agesStudentList);
    }

    // --- MÉTODOS ---

    static void showMessage(String message) {
        System.out.println(message);
    }

    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;
    }

    static void fillAgesList(List<Integer> agesList, int[] birthYears) {
        for (int year : birthYears) {
            agesList.add(calculateAge(year));
        }
    }

    static void listStudents(String[] names, List<Integer> ages) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student: " + names[i] + " - Age: " + ages.get(i));
        }
    }
}