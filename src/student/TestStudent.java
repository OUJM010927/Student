/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Michelle
 */
class TestStudent {

    private String name;
    private String lastName;
    private Long controlNumber;
    private String career;
    private int Semester;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getControlNumber() {
        return controlNumber;
    }

    public String getCareer() {
        return career;
    }

    public int getSemester() {
        return Semester;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setControlNumber(Long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String toString() {
        System.out.println("Los datos del estudiante");
        System.out.println("Nombre:" + getName());
        System.out.println("apellidos:" + getLastName());
        System.out.println("numero de control:" + getControlNumber());
        System.out.println("Carrera:" + getCareer());
        System.out.println("Semestre:" + getSemester());
        return "";
    }
}
