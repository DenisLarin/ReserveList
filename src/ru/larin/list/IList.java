package ru.larin.list;

/**
 * Created by mrden on 09.11.2016.
 */
public interface IList<E>{
    public int getSize();
    public void add(E data);
    public boolean isEmpty();
    public void print();
    public void reserve();
}
