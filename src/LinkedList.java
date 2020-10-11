public class LinkedList<E> {

    private Node<E> tail = null;
    private int size = 0;

    public LinkedList(){

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public E first(){
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    }

    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    //whatever is stored at the end of the list,
    //get the thing that then stores at the front of the list and rotate them around
    //essentially, so that the front becomes the back, the back becomes the front,
    //or head-tail, tail-head
    public void rotate(){
        if(tail !=null){
            tail = tail.getNext();
        }
    }

    // this is the first thing in the list, the next is currently null. There's nothing to
    //actually point to as the next object in the list
    // In this case, we've added it to the first
    public void addFirst(E e){
        if(isEmpty()){
            tail = new Node<>(e, null);
            // the current tail is then going to set next to being
            //the tail itself. the front and the end of the linked list are always connected to each other
            // because there's only one element in the list, it means right now it has to connect back to itself
            tail.setNext(tail);
        }else{
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }size++;
    }

    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        }else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
}
