package ru.task.cache.db1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.task.cache.db1.dao.InfoDAO;
import ru.task.cache.db1.entity.Info;

import java.util.List;


@Service
public class InfoServiceImpl implements InfoService{

    @Autowired
    private InfoDAO infoDAO;

    @Override
    @Transactional
    public List<Info> getAllInfo() {

        return infoDAO.getAllInfo();

    }

    @Override
    @Transactional
    public void saveInfo(Info info) {

        infoDAO.saveInfo(info);
    }

    @Override
    @Transactional
    public Info getInfo(long id) {

        return infoDAO.getInfo(id);
    }

    @Override
    @Transactional
    public void deleteInfo(long id) {

        infoDAO.deleteInfo(id);

    }
}
