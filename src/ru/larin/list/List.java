package ru.larin.list;

/**
 * Created by mrden on 09.11.2016.
 */
public class List<E> implements IList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public List() {
        first = null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(E data) {
        Node<E> node = new Node<>(data);
        node.setNextElementLink(first);
        first = node;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void print() {
        if (isEmpty())
            return;
        Node<?> node = first;
        while (node != null) {
            System.out.println(node.getData().toString());
            node = node.getNextElementLink();
        }
    }

    @Override
    public void reserve() {
        last = first;
        while (last.getNextElementLink() != null){
           Node node = last.getNextElementLink();
           last.setNextElementLink(node.getNextElementLink());
           node.setNextElementLink(first);
           first = node;
        }
    }
}
