package com.example.bookstore.DaoImpl;

import com.example.bookstore.Dao.BookDao;
import com.example.bookstore.Entity.BookEntity;
import com.example.bookstore.Repository.BookRepository;
import com.example.bookstore.Utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private BookRepository bookrepository;

    @Override
    public boolean addBook(BookEntity book) {
        bookrepository.save(book);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.save(book);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public boolean updateBook(BookEntity book) {
        bookrepository.save(book);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.update(book);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public boolean deleteBook(BookEntity book) {
        bookrepository.delete(book);
        return true;
//        try {
//            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//            session.beginTransaction();
//            session.delete(book);
//            session.getTransaction().commit();
//            return true;
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            return false;
//        }
    }

    @Override
    public BookEntity findBookById(Integer id) {
        return bookrepository.findBookById(id);
    }

    @Override
    public BookEntity findBookByName(String name) {
        return bookrepository.findBookByName(name);
    }

    @Override
    public List<BookEntity> findBookByExample(BookEntity book) {
        try {
            Session session= HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Criteria criteria = session.createCriteria(BookEntity.class);
            criteria.add(Example.create(book));
            List<BookEntity> bookdata = criteria.list();
            session.getTransaction().commit();
            return bookdata;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<BookEntity> findallBook() {
        return bookrepository.findallBook();
    }
}
