package admin_user.repositories;

//import com.example.demo.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import E_Blood_Bank.model.BankUser;
import admin_user.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	Appointment findBybEmail(String bEmail);
}
