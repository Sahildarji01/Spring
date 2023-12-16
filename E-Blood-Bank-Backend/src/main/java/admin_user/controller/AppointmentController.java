package admin_user.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import admin_user.dto.AppointmentDto;
import admin_user.model.Appointment;
import admin_user.repositories.AppointmentRepository;
import admin_user.service.AppointmentService;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class AppointmentController{
	
	private AppointmentService appointmentService1;

	@Autowired
	 AppointmentRepository appointmentRepository;
	@Autowired
	AppointmentService appointmentService;
	
	public AppointmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService1 = appointmentService;
	}
	@ModelAttribute("user")
	public AppointmentDto appointmentDto() {
		return new AppointmentDto();
	}
	
	@GetMapping("/reg")
	public List<Appointment> showRegistrationForm() {
		return appointmentRepository.findAll();
	}
	@PostMapping("/reg")
	public Appointment registerUserAccount(@RequestBody AppointmentDto appointmentDto){ 
		Appointment appointment = (Appointment) appointmentService.save(appointmentDto);
		return appointment;
		
	}
}
