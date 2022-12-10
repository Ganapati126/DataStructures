package DSA.List.LinkedList;



public class LinkedListImplementation {
    private Object nextAddress;
    private Object payLoad;
    private Object head;

    public LinkedListImplementation(Object nextAddress, Object payLoad, Object head) {
        this.nextAddress = nextAddress;
        this.payLoad = payLoad;
        this.head = head;
    }

    public Object getNextAddress() {
        return nextAddress;
    }

    public void setNextAddress(Object nextAddress) {
        this.nextAddress = nextAddress;
    }

    public Object getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(Object payLoad) {
        this.payLoad = payLoad;
    }

    public Object getHead() {
        return head;
    }

    public void setHead(Object head) {
        this.head = head;
    }

    public void add(Object obj)
    {
        if (head == null)
        {
            this.head = obj;
        }
        else
        {
            LinkedListImplementation llst = (LinkedListImplementation) obj;
            llst.nextAddress = head;
            head = llst;
        }
    }

    public void add(Object obj, int pos)
    {
        if (head == null)
        {
            this.head = obj;
        }
        else
        {
            int i = 0;
            Object objSearching = head;

        }
    }
}
