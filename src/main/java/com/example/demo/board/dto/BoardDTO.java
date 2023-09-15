package com.example.demo.board.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class BoardDTO {
    private Long code;
    private String name;
    private String title;
    private String pwd;
    private String email;
    private String Content;

}
