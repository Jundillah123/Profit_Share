package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.MSaving;

@Repository
public interface MSavingRepository extends JpaRepository<MSaving, String> {
}
