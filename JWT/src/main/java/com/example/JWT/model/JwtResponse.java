package com.example.JWT.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse{
    private String JwtToken;
    private String userName;
}
