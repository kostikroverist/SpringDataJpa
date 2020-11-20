package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ua.lviv.lgs.domain.Univercity;

import java.util.List;

public interface UnivercityRepository extends JpaRepository<Univercity,Long> {

    List<Univercity> findByName(String name);
    List<Univercity> findByUniversityAddress(String universityAddress);

}
