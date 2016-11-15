package ru.larin.list;

/**
 * Created by mrden on 09.11.2016.
 */
public class Node<E>{
    private Node<E> nextElementLink;
    private E data;

    public Node(E data){
        this.data = data;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }

    public void setNextElementLink(Node nextElementLink) {
        this.nextElementLink = nextElementLink;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}

