package com.PrimeLog.IMS.repository;


import com.PrimeLog.IMS.objects.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRepository extends JpaRepository<Tasks, Long> {
    // Custom query methods can be added here
    // Example: Find tasks by status
    // List<Task> findByStatus(TaskStatus status);
}