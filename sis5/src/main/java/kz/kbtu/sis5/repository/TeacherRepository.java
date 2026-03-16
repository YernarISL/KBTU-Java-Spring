package kz.kbtu.sis5.repository;

import kz.kbtu.sis5.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}
