package br.com.wellingtonpn.listaLigada;
public class ListaLigada {

    private Node first;
    private Node last;
    private Integer size;

    public ListaLigada() {
        this.size = 0;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void toAdd(String value)
    {
        Node node = new Node(value);
        if(this.first == null && this.last == null)
        {
            this.first = node;
            this.last = node;
        }else
        {
            this.last.setNext(node);
            this.last = node;
        }
        this.size++;
    }

    public void remove(String value)
    {
        Node previous = null;
        Node actualNode = this.first;
        for (int i = 0 ; i < this.size ; i++)
        {
            if(actualNode.getValue().equalsIgnoreCase(value))
            {
                previous.setNext(actualNode.getNext());
                actualNode = null;
                this.size--;
                break;
            }
            previous = actualNode;
            actualNode = actualNode.getNext();
        }
    }

    public Node get(Integer position)
    {
        Node node = this.first;
        for (int i = 0 ; i < position ; i++)
        {
            if(node.getNext() != null)
                node = node.getNext();
        }
        return node;
    }
}
