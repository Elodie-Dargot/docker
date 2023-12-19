package fr.wcs.dockerdemo.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.wcs.dockerdemo.persistence.entities.DemoEntity;

@Repository
public interface DemoEntityRepository extends JpaRepository<DemoEntity, Long> {

    // We will use inherited Repository methods, nothing to create here.

}