package SecurityForSpringBoot.repositories;


import SecurityForSpringBoot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> { //Dit wordt in mijn project Long voor ID
}
