package org.sid.web;


import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
	@Autowired
	AccountService accountService;
	
	@PostMapping("/register")
	public AppUser regiter(@RequestBody RegisterForm registerForm) {
		if(!registerForm.getPassword().equals(registerForm.getRepassword()))
			throw new RuntimeException("vous devez confirmer votre mot de passe ");
		AppUser user=accountService.findUserByUsername(registerForm.getUsername());
		if(user!=null)
			throw new RuntimeException("cet email existe deja");
		AppUser appUser=new AppUser(registerForm.getUsername(),registerForm.getPassword(),null);
		accountService.saveUser(appUser);
		accountService.addRoleToUser(registerForm.getUsername(), "USER");
		return appUser;
	}
}
