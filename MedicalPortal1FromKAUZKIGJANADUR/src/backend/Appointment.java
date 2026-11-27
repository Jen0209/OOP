/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Jennel
 */
public class Appointment implements Trackable {
    private String patientName;
    private int age;
    private String dateTime;
    private String status;
    private String reason;

    public Appointment(String patientName, int age, String dateTime, String status, String reason) {
        this.patientName = patientName;
        this.age = age;
        this.dateTime = dateTime;
        this.status = status;
        this.reason = reason;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getDateTime() { return dateTime; }
    public String getStatus() { return status; }
    public String getReason() { return reason; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public void trackAppointment() {
        System.out.println("Tracking in-person appointment for patient: " + patientName);
    }
}
