package sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Services;


import java.util.List;

import sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Models.Customer;


public interface CustomerService {
    

   void saveCustomer(Customer cust);
   List<Customer> getAllCustomer();
  
}

