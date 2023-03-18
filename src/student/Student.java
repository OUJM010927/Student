/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author Michelle
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestStudent student = new TestStudent();
        student.setName("Michelle");
        System.out.println("Nombre:" + student.getName());

        student.setLastName("Orduño Jimenez");
        System.out.println("Apellidos:" + student.getLastName());

        student.setControlNumber(Long.valueOf("22670367"));
        System.out.println("Numero de control:" + student.getControlNumber());

        student.setCareer("Ingenieria Informatica");
        System.out.println("Carrera:" + student.getCareer());

        student.setSemester(Integer.parseInt("2"));
        System.out.println("Semestre:" + student.getSemester());

        student.toString();
    }

}
