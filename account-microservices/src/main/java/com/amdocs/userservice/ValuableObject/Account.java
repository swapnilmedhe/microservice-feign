package com.amdocs.userservice.ValuableObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private int accountId;
    private String accoutType;
  /*  @ManyToOne
    private User user;*/
}
