package DSA;
import java.util.List;
import java.util.ArrayList;

class Node {
    int key;
    int value;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class hashTable {
    private int size;
    private List <List <Node> > table;

    hashTable(int size)
    {
        this.size=size;
        this.table=new ArrayList<> (size);
        for (int i=0;i<size;i++)
        {
            table.add(new ArrayList<> ());
        }
    }


    public int hashFunction(int key){
        return key%size;
    }

    public void insert(int key, int value){
        int index = hashFunction(key);
        List <Node> list = table.get(index);

        Node n = new Node(key, value);
        list.add(n);

        list.add(new Node(key, value));
    }

    int search(int key){
        int index = hashFunction(key);
        List <Node> list = table.get(index);

        for(Node node : list){
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
}

public class hashSearch {
    public static void main(String[] args) {
        int tableSize = 5;
        
        hashTable ht = new hashTable(tableSize);

        ht.insert(1, 100);
        ht.insert(2, 400);
        ht.insert(3, 500);

        System.out.println(ht.search(1));

    }
}

