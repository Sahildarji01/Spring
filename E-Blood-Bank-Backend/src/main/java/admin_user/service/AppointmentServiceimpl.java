package admin_user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin_user.dto.AppointmentDto;
import admin_user.model.Appointment;
import admin_user.repositories.AppointmentRepository;
//import admin_user.repositories.UserRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;



@Service
public class AppointmentServiceimpl implements AppointmentService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Appointment save(AppointmentDto appointmentDto) {
		Appointment appointment = new Appointment();
		appointment.setbName(appointmentDto.getbName());
		appointment.setbEmail(appointmentDto.getbEmail());
		appointment.setbAddress(appointmentDto.getbAddress());
		appointment.setbContact(appointmentDto.getbContact());
		appointment.setbPassword(passwordEncoder.encode(appointmentDto.getbPassword()));
		appointment.setArea(appointmentDto.getArea());

		return appointmentRepository.save(appointment);
	}
}
