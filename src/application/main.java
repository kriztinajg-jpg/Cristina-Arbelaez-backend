package application;

import java.util.ArrayList;
import java.util.List;

public class main {
    final static int CURRENT_YEAR = 2026;
    static List<Integer> agesStudentList = new ArrayList<>();
    public static void main(String[] args) {

        final String GREETING_MESSAGE = "Saludo Estudiantes de Java";
        String [] namesStudents = {"Juan", "Maria", "Pedro", "Ana", "Luis"};
        int [] birthYears = {2000, 1998, 2002, 1995, 2001};

// 1. Mostramos el saludo
        showMessage(GREETING_MESSAGE);

// 2. Llenamos la lista de edades usando el arreglo de años
        fillAgesList(birthYears);

// 3. Mostramos la lista final combinando nombres y edades
        listStudents(namesStudents, agesStudentList);
    }
    static void showMessage(String message){
        System.out.println(message);
    }

    static int calculatedAge (int birthYear) {
        return CURRENT_YEAR - birthYear;
    }
    static List<Integer> fillAgesList( int[] birthYears) {
        for (int birthYear : birthYears) {
            int age = calculatedAge(birthYear);
            agesStudentList.add(age);
        }
        return agesStudentList;
    }
    static void listStudents(String [] namesStudents, List <Integer> agesStudents) {
        showMessage("lista de estudiantes:");
        for (int i = 0; i < namesStudents.length; i++){
            showMessage(namesStudents[i] + " - Edad: " + agesStudents.get(i));
        }
    }

}