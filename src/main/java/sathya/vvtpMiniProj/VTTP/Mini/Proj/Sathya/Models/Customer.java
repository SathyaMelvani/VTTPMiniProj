package sathya.vvtpMiniProj.VTTP.Mini.Proj.Sathya.Models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "custtab")
public class Customer
 {

    @Id
    @Column(name = "cid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custId;
    
    @Column(name = "cfname")
    private String custFirstName;

    @Column(name = "clname")
    private String custLastName;

    @Column(name = "cgen")
    private String custGen;

    @Column(name = "race")
    private String Race;

    @Column(name = "email")
    private String email;

    @DateTimeFormat(iso = ISO.DATE)
    @Temporal(TemporalType.DATE)
    @Column(name = "Dob")
    private Date custDob;
}
