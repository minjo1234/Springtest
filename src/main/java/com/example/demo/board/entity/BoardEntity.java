package com.example.demo.board.entity;


import com.example.demo.board.dto.BoardDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.apache.bcel.classfile.Code;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "board")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long Code;

    @Column(length =  20 , nullable = false)
    private String name;

    @Column
    private String title;

    @Column
    private String pwd;

    @Column
    private String email;

    @Column(length = 500 , nullable = false)
    private String Content;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setCode(boardDTO.getCode());
        boardEntity.setName(boardDTO.getName());
        boardEntity.setTitle(boardDTO.getTitle());
        boardEntity.setPwd(boardDTO.getPwd());
        boardEntity.setEmail(boardDTO.getEmail());
        boardEntity.setContent(boardDTO.getContent());
        return boardEntity;

    }
}
