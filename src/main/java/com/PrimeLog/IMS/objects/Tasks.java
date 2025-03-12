package com.PrimeLog.IMS.objects;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicles vehicle;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Users driver;

    private LocalDateTime reportingTime;
    private LocalDateTime deliveryTime;
    private LocalDateTime returnToHubTime;
    private LocalDateTime releaseFromHubTime;

    private Double startLatitude;
    private Double startLongitude;
    private Double endLatitude;
    private Double endLongitude;

    private Double startOdometerReading;
    private Double endOdometerReading;
    private Double deliveryOdometerReading;

    private LocalDateTime checkOutTime;
    private LocalDateTime checkInTime;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column(length = 1000)
    private String notes;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public Users getDriver() {
        return driver;
    }

    public void setDriver(Users driver) {
        this.driver = driver;
    }

    public LocalDateTime getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(LocalDateTime reportingTime) {
        this.reportingTime = reportingTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public LocalDateTime getReturnToHubTime() {
        return returnToHubTime;
    }

    public void setReturnToHubTime(LocalDateTime returnToHubTime) {
        this.returnToHubTime = returnToHubTime;
    }

    public LocalDateTime getReleaseFromHubTime() {
        return releaseFromHubTime;
    }

    public void setReleaseFromHubTime(LocalDateTime releaseFromHubTime) {
        this.releaseFromHubTime = releaseFromHubTime;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getStartOdometerReading() {
        return startOdometerReading;
    }

    public void setStartOdometerReading(Double startOdometerReading) {
        this.startOdometerReading = startOdometerReading;
    }

    public Double getEndOdometerReading() {
        return endOdometerReading;
    }

    public void setEndOdometerReading(Double endOdometerReading) {
        this.endOdometerReading = endOdometerReading;
    }

    public Double getDeliveryOdometerReading() {
        return deliveryOdometerReading;
    }

    public void setDeliveryOdometerReading(Double deliveryOdometerReading) {
        this.deliveryOdometerReading = deliveryOdometerReading;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

enum TaskStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}