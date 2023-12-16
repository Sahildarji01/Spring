package admin_user.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import admin_user.dto.AppointmentDto;
//import admin_user.model.Appointment;
//import admin_user.repositories.AppointmentRepository;
import admin_user.model.Appointment;

@Service
public interface AppointmentService {

	Appointment save (AppointmentDto appointmentDto);
}
