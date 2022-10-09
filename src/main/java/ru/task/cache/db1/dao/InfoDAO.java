package ru.task.cache.db1.dao;

import ru.task.cache.db1.entity.Info;

import java.util.List;

public interface InfoDAO  {

    public List<Info> getAllInfo();

    public void saveInfo(Info info);

    public Info getInfo(long id);

    public void deleteInfo(long id);
}
