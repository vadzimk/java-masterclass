package AbstractClasses;

public class MyLinkedList implements NodeList{

    private ListItem root = null;
    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot(ListItem item) {
        return null;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){
            //list was empty
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparison = currentItem.compareTo(item);
            if(comparison<0){
                //new item is greater, move right if possible
                if(currentItem.next()!=null){
                    currentItem= currentItem.next();

                } else{
                    //there is no next - inserting at the end of the list
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison>0){
                //new item is less - inserting before
                if(currentItem.previous()!=null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }else{
                    //node with a previous is a root
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;

            } else{
                //equal
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
