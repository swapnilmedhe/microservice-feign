package com.amdocs.userservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    @Column(unique=true)
    private Long userNum;
    @Size(max =40)
    private String name;
    @Size(max =100)
    private String email;
    @Size(max =10)
    private String mobileNumber;
    @Size(max =10)
    private String secondaryMobile;
    @JsonIgnore
    private String dob;
    private String gender;

    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "usr",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Account> accounts;


}
