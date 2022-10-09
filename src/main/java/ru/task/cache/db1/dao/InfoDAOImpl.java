package ru.task.cache.db1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.task.cache.db1.entity.Info;

import java.util.List;


@Repository
public class InfoDAOImpl implements InfoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Info> getAllInfo() {

        Session session = sessionFactory.getCurrentSession();
        List<Info> allInfo = session.createQuery("from Info",
                Info.class).getResultList();

        return allInfo;
    }

    @Override
    public void saveInfo(Info info) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(info);
    }

    @Override
    public Info getInfo(long id) {

        Session session = sessionFactory.getCurrentSession();
        Info info= session.get(Info.class, id);

        return info;
    }

    @Override
    public void deleteInfo(long id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Info> query = session.createQuery("delete from Info where id =:infosId");
        query.setParameter("infosId", id);
        query.executeUpdate();

//        Query<Info> query = session.createQuery("delete from Info where id = :infoId");
//        query.setParameter("infoId", id);
//        query.executeUpdate();

    }


}
