/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class FlightDetails {

    private String FlightId;
    private String From;
    private String To;
    private String StartTimeA;
    private String EndTimeA;
    private String StartTimeB;
    private String EndTimeB;
    private String PlaneId;

    public FlightDetails() {
    }

    public FlightDetails(String FlightId, String From, String To, String StartTimeA, String EndTimeA, String StartTimeB, String EndTimeB, String PlaneId) {
        this.FlightId = FlightId;
        this.From = From;
        this.To = To;
        this.StartTimeA = StartTimeA;
        this.EndTimeA = EndTimeA;
        this.StartTimeB = StartTimeB;
        this.EndTimeB = EndTimeB;
        this.PlaneId = PlaneId;
    }

    public FlightDetails(String From, String To, String StartTimeA, String EndTimeA, String StartTimeB, String EndTimeB, String PlaneId) {
        this.From = From;
        this.To = To;
        this.StartTimeA = StartTimeA;
        this.EndTimeA = EndTimeA;
        this.StartTimeB = StartTimeB;
        this.EndTimeB = EndTimeB;
        this.PlaneId = PlaneId;
    }

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String FlightId) {
        this.FlightId = FlightId;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public String getStartTimeA() {
        return StartTimeA;
    }

    public void setStartTimeA(String StartTimeA) {
        this.StartTimeA = StartTimeA;
    }

    public String getEndTimeA() {
        return EndTimeA;
    }

    public void setEndTimeA(String EndTimeA) {
        this.EndTimeA = EndTimeA;
    }

    public String getStartTimeB() {
        return StartTimeB;
    }

    public void setStartTimeB(String StartTimeB) {
        this.StartTimeB = StartTimeB;
    }

    public String getEndTimeB() {
        return EndTimeB;
    }

    public void setEndTimeB(String EndTimeB) {
        this.EndTimeB = EndTimeB;
    }

    public String getPlaneId() {
        return PlaneId;
    }

    public void setPlaneId(String PlaneId) {
        this.PlaneId = PlaneId;
    }

    @Override
    public String toString() {
        return "FlightDetails{" + "FlightId=" + FlightId + ", From=" + From + ", To=" + To + ", StartTimeA=" + StartTimeA + ", EndTimeA=" + EndTimeA + ", StartTimeB=" + StartTimeB + ", EndTimeB=" + EndTimeB + ", PlaneId=" + PlaneId + '}';
    }
    
}
