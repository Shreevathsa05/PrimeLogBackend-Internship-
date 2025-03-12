package com.PrimeLog.IMS.objects;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vehicles")
public class Vehicles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String registrationNumber;
    private String makeModel;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    @OneToMany(mappedBy = "vehicle")
    private List<Users> assignedUsers = new ArrayList<>();

    @OneToMany(mappedBy = "vehicle")
    private List<Tasks> tasks = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "odometer_readings", joinColumns = @JoinColumn(name = "vehicle_id"))
    private List<OdometerReading> odometerReadings = new ArrayList<>();

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public List<Users> getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(List<Users> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public List<OdometerReading> getOdometerReadings() {
        return odometerReadings;
    }

    public void setOdometerReadings(List<OdometerReading> odometerReadings) {
        this.odometerReadings = odometerReadings;
    }
}

@Embeddable
class OdometerReading {
    private Double reading;
    private java.time.LocalDateTime timestamp;

    // Getters and setters
    public Double getReading() {
        return reading;
    }

    public void setReading(Double reading) {
        this.reading = reading;
    }

    public java.time.LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.time.LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

enum VehicleStatus {
    AVAILABLE,
    ASSIGNED,
    IN_MAINTENANCE
}