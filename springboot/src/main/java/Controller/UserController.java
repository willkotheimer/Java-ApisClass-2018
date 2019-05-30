package Controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	
	@RequestMapping(value="user/", method= RequestMethod.GET)
	public void getUsers() {
		return this.userService.getUsers();
	}
	
	
	
/*
 * 
 * @Component
@Controller
@Service
@Repository

*/

}
