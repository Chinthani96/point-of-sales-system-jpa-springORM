package lk.ijse.dep.pos.dao;

import lk.ijse.dep.pos.entity.SuperEntity;

import java.io.Serializable;
import java.lang.Exception;
import java.util.List;

public interface CrudDAO<T extends SuperEntity,ID extends Serializable> extends SuperDAO{
    List<T> findAll() throws Exception;

    T find(ID pk) throws Exception;

    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(ID pk) throws Exception;
}
