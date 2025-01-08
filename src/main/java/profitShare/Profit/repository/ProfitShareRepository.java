package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.ProfitShare;

@Repository
public interface ProfitShareRepository extends JpaRepository<ProfitShare, String> {
}
