package edu.miu.courseRegistration.Repository;

import CourseRegistration.project.domain.RegistrationEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationEventRepository extends JpaRepository<RegistrationEvent,Integer> {
}
