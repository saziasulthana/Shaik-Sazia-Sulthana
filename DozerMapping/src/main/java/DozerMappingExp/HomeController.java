package DozerMappingExp;





import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.catalina.mapper.Mapper;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
 public static final Logger logger= LoggerFactory.getLogger(HomeController.class); 
   
 @RequestMapping(value ="/",method=RequestMethod.GET)
  public String home(Locale locale,Model model) {
	 
	logger.info("welcome Home ! the client locale is {}.", locale);
	//Date date= new Date();
	//DateFormat dateFormat=  DateFormat.getDateInstance(DateFormat.LONG,locale);
	//String FormattedDate = dateFormat.format(date);
	Empolyee employee= new Empolyee();
	employee.setId(1);
	employee.setName("sazia");
	employee.setSalary(10000);
	DozerBeanMapper mapper= new DozerBeanMapper();
	EmployeeDTO employeeDTO= mapper.map(employee,EmployeeDTO.class);
	model.addAttribute("employeeDetails","Id:"+employeeDTO.getId()+ ",Name: "+employeeDTO.getName()+" ,Salary:" +employeeDTO.getSalary());
	
	
	
	
	return "home";
	  
  
 
 
 
}
}