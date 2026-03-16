package kz.kbtu.sis4.repository;

import kz.kbtu.sis4.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
