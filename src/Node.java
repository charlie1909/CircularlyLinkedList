public class Node <E>{

     //we've given a generic type, which is known as E. And that is
     //basically just a placeholder. Meaning that whatever type we pass into node is
     //going to be in the place of wherever we type in just E.
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> n){
        element = e;
        next = n;
    }

    public E getElement(){
        return element;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setNext(Node<E> n){
        next = n;
    }
}
