class node{
    String song;
    node next;
    node(String song){
        this.song=song;
        this.next=null;
    }
}
class playlist{
    node head;
    void add(String song){
        node newnod=new node(song);
        if(head==null){
            head=newnod;
        }
        else {
            node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnod;
        }
    }
    void  display(){
        node temp=head;
        while (temp!=null){
            System.out.println(temp.song);
            temp=temp.next;
        }
    }
}
public class t1 {
    public static void main(String[] args) {
           playlist pl=new playlist();
            pl.add("tu mara koi na  ho ka bhi kuch lagahy");
            pl.add("andhara tara main na la liya ");
            pl.add("channa maria ");
            pl.add("tu itni khaubsurat hai ");
            pl.display();
    }
}
