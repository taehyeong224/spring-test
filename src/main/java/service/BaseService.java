package service;

public interface BaseService<T> {
    public T findOneById(Integer id);
}
