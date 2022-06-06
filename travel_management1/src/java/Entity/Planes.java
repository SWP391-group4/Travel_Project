/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Planes {
    private String PlaneId ;
    private String PlaneName ;
    private String PlaneCate ;
    private String PlaneBrand ;
    private int PlaneRole ;
    private String ServiceId ;
    private String AirportId ;

    public Planes() {
    }

    public Planes(String PlaneId, String PlaneName, String PlaneCate, String PlaneBrand, int PlaneRole, String ServiceId, String AirportId) {
        this.PlaneId = PlaneId;
        this.PlaneName = PlaneName;
        this.PlaneCate = PlaneCate;
        this.PlaneBrand = PlaneBrand;
        this.PlaneRole = PlaneRole;
        this.ServiceId = ServiceId;
        this.AirportId = AirportId;
    }

    public Planes(String PlaneName, String PlaneCate, String PlaneBrand, int PlaneRole, String ServiceId, String AirportId) {
        this.PlaneName = PlaneName;
        this.PlaneCate = PlaneCate;
        this.PlaneBrand = PlaneBrand;
        this.PlaneRole = PlaneRole;
        this.ServiceId = ServiceId;
        this.AirportId = AirportId;
    }

    public String getPlaneId() {
        return PlaneId;
    }

    public void setPlaneId(String PlaneId) {
        this.PlaneId = PlaneId;
    }

    public String getPlaneName() {
        return PlaneName;
    }

    public void setPlaneName(String PlaneName) {
        this.PlaneName = PlaneName;
    }

    public String getPlaneCate() {
        return PlaneCate;
    }

    public void setPlaneCate(String PlaneCate) {
        this.PlaneCate = PlaneCate;
    }

    public String getPlaneBrand() {
        return PlaneBrand;
    }

    public void setPlaneBrand(String PlaneBrand) {
        this.PlaneBrand = PlaneBrand;
    }

    public int getPlaneRole() {
        return PlaneRole;
    }

    public void setPlaneRole(int PlaneRole) {
        this.PlaneRole = PlaneRole;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public String getAirportId() {
        return AirportId;
    }

    public void setAirportId(String AirportId) {
        this.AirportId = AirportId;
    }

    @Override
    public String toString() {
        return "Planes{" + "PlaneId=" + PlaneId + ", PlaneName=" + PlaneName + ", PlaneCate=" + PlaneCate + ", PlaneBrand=" + PlaneBrand + ", PlaneRole=" + PlaneRole + ", ServiceId=" + ServiceId + ", AirportId=" + AirportId + '}';
    }
    
}
