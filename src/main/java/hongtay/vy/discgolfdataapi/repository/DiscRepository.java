package hongtay.vy.discgolfdataapi.repository;

import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscRepository extends JpaRepository<DiscEntity, Integer> {
    DiscEntity findByCompany(String company);
}
