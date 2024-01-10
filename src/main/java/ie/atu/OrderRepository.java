package ie.atu;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Configuration
public interface OrderRepository extends JpaRepository<Order, Long> {


}