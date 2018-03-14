package cargaip.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@CrossOrigin(origins= {"http://127.0.0.1:4200"})
@RequestMapping("/mostrar")
public class ConsultarIpController {
	
	
	@GetMapping("/ip")
	public String getip() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		System.out.println(request.getLocalAddr());
		return ip;
	}

}
