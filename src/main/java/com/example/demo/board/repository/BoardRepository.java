package com.example.demo.board.repository;

import com.example.demo.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
