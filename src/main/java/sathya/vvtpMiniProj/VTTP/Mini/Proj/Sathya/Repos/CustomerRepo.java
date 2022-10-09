package sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    
}

