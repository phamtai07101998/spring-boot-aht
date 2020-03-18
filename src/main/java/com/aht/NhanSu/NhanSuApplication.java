package com.aht.NhanSu;

import com.aht.NhanSu.dao.UserDAO;
import com.aht.NhanSu.model.*;
import com.aht.NhanSu.service.UserRoleService;
import com.aht.NhanSu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class NhanSuApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NhanSuApplication.class, args);
	}

	@Autowired
	private UserRoleService userRoleService;

	@Autowired
	private UserService userService;

	@Autowired
	private UserDAO userDAO;

	@Override
	public void run(String... args) throws Exception {
//		Aht_User u1 = new Aht_User();
//		u1.setUserName("NguyenVanA");
//		u1.setUserPass("123");
//		u1.setUserMail("vana123@gmail.com");
//
//		userService.createUser(u1);
//
//		Aht_Role r1 = new Aht_Role();
//		r1.setRoleId(5);
//
//		Aht_User_Role u1r1 = new Aht_User_Role();
//
//		u1r1.setUser(u1);
//		u1r1.setRole(r1);
//
//		userRoleService.createRole(u1r1)



	}
}
