package com.example.bookstore.DaoImpl;

import com.example.bookstore.Dao.OrderDao;
import com.example.bookstore.Entity.CartEntity;
import com.example.bookstore.Entity.OrderEntity;
import com.example.bookstore.Repository.OrderRepository;
import com.example.bookstore.Utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private OrderRepository orderrepository;
    @Override
    public boolean addOrder(OrderEntity order) {
        orderrepository.save(order);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.save(order);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public boolean updateOrder(OrderEntity order) {
        orderrepository.save(order);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.update(order);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public boolean deleteOrder(OrderEntity order) {
        orderrepository.delete(order);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.delete(order);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public OrderEntity findOrderById(Integer id) {
        return orderrepository.findOrderById(id);
    }


    @Override
    public List<OrderEntity> findOrderByExample(OrderEntity order) {
        try {
            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Criteria criteria = session.createCriteria(OrderEntity.class);
            criteria.add(Example.create(order));
            List<OrderEntity> orderdata = criteria.list();
            session.getTransaction().commit();
            return orderdata;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<OrderEntity> findallOrder() {
        return orderrepository.findallOrder();
    }
}
