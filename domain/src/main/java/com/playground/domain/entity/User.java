package com.playground.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {

  private String userid;
  private String username;
  private String email;
  private String password;
  private String role;
}
