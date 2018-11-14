package com.baizhi.service;

public interface IService<T> {
    void add(T t);
    T findItem(T t);
}
