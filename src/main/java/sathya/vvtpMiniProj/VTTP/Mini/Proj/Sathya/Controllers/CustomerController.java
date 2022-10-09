package sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Customer;
import sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.CustomerService;

public class CustomerController;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/show")
    public String show() {
      
        return "CustomerRegister";
    }
        @PostMapping("/register")
        public String saveCustomer(@ModelAttribute Customer cust) {
            service.saveCustomer(cust);
            return "redirect:all";

        }

        @GetMapping("/all")
        public String showCustomer(Model model) {
            List<Customer> list = service.getAllCustomer();
            model.addAllAttributes(list);
            return "CustomerData";

        }

    }
    
    

