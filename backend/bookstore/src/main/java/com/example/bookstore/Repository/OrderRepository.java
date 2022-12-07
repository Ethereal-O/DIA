package com.example.bookstore.Repository;

import com.example.bookstore.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
    @Query(value = "from OrderEntity where id=:id")
    public OrderEntity findOrderById(Integer id);
    @Query(value = "from OrderEntity")
    public List<OrderEntity> findallOrder();
}
