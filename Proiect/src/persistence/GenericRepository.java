package persistence;

import service.*;

import java.util.ArrayList;

public interface GenericRepository<T> {
    DBConnection dbConnection = DBConnection.getInstance();
    Audit audit = Audit.getInstance();
    public void add(T entity);

    public T get(int id);

    public ArrayList<T> getAll();

    public void update(T entity);

    public void delete(T entity);
}