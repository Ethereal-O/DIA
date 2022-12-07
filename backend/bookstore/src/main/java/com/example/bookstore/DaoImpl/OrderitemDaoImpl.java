package com.example.bookstore.DaoImpl;

import com.example.bookstore.Dao.OrderitemDao;
import com.example.bookstore.Entity.OrderEntity;
import com.example.bookstore.Entity.OrderitemEntity;
import com.example.bookstore.Repository.OrderitemRepository;
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
public class OrderitemDaoImpl implements OrderitemDao {

    @Autowired
    private OrderitemRepository orderitemrepository;

    @Override
    public boolean addOrderitem(OrderitemEntity orderitem) {
        orderitemrepository.save(orderitem);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.save(orderitem);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public boolean updateOrderitem(OrderitemEntity orderitem) {
        orderitemrepository.save(orderitem);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.update(orderitem);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public boolean deleteOrderitem(OrderitemEntity orderitem) {
        orderitemrepository.delete(orderitem);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.delete(orderitem);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public OrderitemEntity findOrderitemById(Integer id) {
        return orderitemrepository.findOrderitemById(id);
    }

    @Override
    public List<OrderitemEntity> findOrderitemsByBookId(Integer bookid) {
        return orderitemrepository.findOrderitemsByBookId(bookid);
    }

    @Override
    public List<OrderitemEntity> findOrderitemByExample(OrderitemEntity orderitem) {
        try {
            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Criteria criteria = session.createCriteria(OrderitemEntity.class);
            criteria.add(Example.create(orderitem));
            List<OrderitemEntity> orderitemdata = criteria.list();
            session.getTransaction().commit();
            return orderitemdata;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<OrderitemEntity> findallOrderitem() {
        return orderitemrepository.findallOrderitem();
    }
}
