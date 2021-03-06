package com.baizhi.dao;

public interface IDao<T> {
    void save(T t);
    T queryItem(T t);
    void delById(String id);
    void delById(T t);
}
