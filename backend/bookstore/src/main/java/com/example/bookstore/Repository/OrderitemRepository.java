package com.example.bookstore.Repository;

import com.example.bookstore.Entity.OrderitemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderitemRepository extends JpaRepository<OrderitemEntity,Integer> {

    @Query(value = "from OrderitemEntity where id=:id")
    public OrderitemEntity findOrderitemById(Integer id);
    @Query(value = "from OrderitemEntity")
    public List<OrderitemEntity> findallOrderitem();
    @Query(value = "from OrderitemEntity where book.id=:bookid")
    public List<OrderitemEntity> findOrderitemsByBookId(Integer bookid);
}
