package com.PrimeLog.IMS.repository;

import com.PrimeLog.IMS.objects.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicles")
public interface VehicleRepository extends JpaRepository<Vehicles, Long> {
    // Custom query methods can be added here
    // Example: Find vehicles by status
    // List<Vehicle> findByStatus(VehicleStatus status);
}