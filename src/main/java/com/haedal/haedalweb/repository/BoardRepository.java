package com.haedal.haedalweb.repository;

import com.haedal.haedalweb.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    boolean existsByActivityId(Long activityId);

    //@Query("select distinct b from Board b join fetch b.participants p join fetch p.user where b.activity.id = :activityId")
    Page<Board> findBoardsByActivityId(Long activityId, Pageable pageable);
}
