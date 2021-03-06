package ru.rsreu.serov.tariffs.service;

import java.util.List;

public interface EntityService<E> {
    E findById(long id);
    List<E> findAll();
    void deleteById(long id);
    E update(E e);
    E add(E e);
}
