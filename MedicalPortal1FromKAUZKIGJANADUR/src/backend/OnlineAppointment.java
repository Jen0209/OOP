/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Jennel
 */
public class OnlineAppointment extends Appointment {
    private String platformLink;

    public OnlineAppointment(String patientName, int age, String dateTime, String status, String reason, String platformLink) {
        super(patientName, age, dateTime, status, reason);
        this.platformLink = platformLink;
    }

    public String getPlatformLink() { return platformLink; }

    @Override
    public void trackAppointment() {
        System.out.println(platformLink);
    }
}
