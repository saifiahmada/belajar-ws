package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@Autowired
	private InstallDao installDao;
	
	@RequestMapping(value={"","/"})
	public @ResponseBody String index(){
		return "Selamat Datang di Spring Boot";
	}
	
	@RequestMapping("/list")
	public @ResponseBody List<Install> getListInstall(){
		return installDao.findAll();
	}

}
