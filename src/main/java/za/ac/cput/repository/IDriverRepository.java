/**
 * IDriverRepository.java
 * Interface for the IDriverRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Driver;

import java.util.List;

public interface IDriverRepository extends JpaRepository<Driver,String> {
    public List<Driver> getAll();
}
