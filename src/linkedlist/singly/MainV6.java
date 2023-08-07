package linkedlist.singly;

public class MainV6 {

    public static void main(String[] args) {

        // #1. Linked List Constructor
        System.out.println("Create Linked List for first time: ");
        System.out.println("----------------------------------");
        LinkedListV6 ll = new LinkedListV6(1);
        ll.makeEmpty();
        ll.append(1);
        ll.append(2);

        ll.getHead();
        ll.getTail();
        ll.getLength();

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        ll.printList();

        // #2. Append operation
        System.out.println("\nLinked List for append operation: ");
        System.out.println("---------------------------------");
        LinkedListV6 appendLL = new LinkedListV6(1);
        appendLL.makeEmpty();
        appendLL.append(1);
        appendLL.append(2);

        appendLL.getHead();
        appendLL.getTail();
        appendLL.getLength();

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        appendLL.printList();

        // #3. Remove Last operation
        System.out.println("\nLinked List before remove last operation: ");
        System.out.println("-----------------------------------------");
        LinkedListV6 removeLastLL = new LinkedListV6(1);
        removeLastLL.append(2);

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        appendLL.printList();

        System.out.println("\nLinked List after remove last operation: ");
        System.out.println("----------------------------------------");
        // (2) Items - Returns 2 Node
        System.out.println(removeLastLL.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(removeLastLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(removeLastLL.removeLast());

        // #4. Prepend operation
        LinkedListV6 prependLL = new LinkedListV6(2);
        prependLL.append(3);

        System.out.println("\nLinked List before prepend operation: ");
        System.out.println("-------------------------------------");
        prependLL.getHead();
        prependLL.getTail();
        prependLL.getLength();

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        prependLL.printList();

        prependLL.prepend(1);

        System.out.println("\nLinked List after prepend operation: ");
        System.out.println("------------------------------------");
        prependLL.getHead();
        prependLL.getTail();
        prependLL.getLength();

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        prependLL.printList();

        // #5. Remove First operation
        System.out.println("\nLinked List before remove first operation: ");
        System.out.println("------------------------------------------");
        LinkedListV6 removeFirstLL = new LinkedListV6(2);
        removeFirstLL.append(1);

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        removeFirstLL.printList();

        System.out.println("\nLinked List after remove first operation: ");
        System.out.println("-----------------------------------------");
        // (2) Items - Returns 2 Node
        System.out.println(removeFirstLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(removeFirstLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(removeFirstLL.removeFirst());

        // #6. Get operation
        System.out.println("\nLinked List before get(int index) operation: ");
        System.out.println("--------------------------------------------");
        LinkedListV6 getLL = new LinkedListV6(0);
        getLL.append(1);
        getLL.append(2);
        getLL.append(3);

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        getLL.printList();

        System.out.println("\nGet Linked List at get(2): ");
        System.out.println("--------------------------");
        System.out.println(getLL.get(2).value);
        getLL.makeEmpty();

        // #7. Set operation
        LinkedListV6 setLL = new LinkedListV6(0);
        setLL.append(1);
        setLL.append(2);
        setLL.append(3);

        System.out.println("\nLinked List before set() operation: ");
        System.out.println("-----------------------------------");

        System.out.println("\nPrint Linked List: ");
        System.out.println("------------------");
        setLL.printList();

        setLL.set(2, 99);

        System.out.println("\nLinked List after set() operation: ");
        System.out.println("----------------------------------");
        setLL.printList();

        // #8 Insert operation
        LinkedListV6 insertLL = new LinkedListV6(1);
        insertLL.append(3);

        System.out.println("\nLinked List before insert() operation: ");
        System.out.println("--------------------------------------");
        insertLL.printList();

        insertLL.insert(1, 2);
        System.out.println("\nLinked List after insert(2) in middle: ");
        System.out.println("--------------------------------------");
        insertLL.printList();

        insertLL.insert(0, 0);
        System.out.println("\nLinked List after insert(0) at beginning: ");
        System.out.println("-----------------------------------------");
        insertLL.printList();

        insertLL.insert(4, 4);
        System.out.println("\nLinked List after insert(4) at end: ");
        System.out.println("-----------------------------------");
        insertLL.printList();

        // #9 Remove operation
        LinkedListV6 removeLL = new LinkedListV6(1);
        removeLL.append(2);
        removeLL.append(3);
        removeLL.append(4);
        removeLL.append(5);

        System.out.println("\nLinked List before remove() operation: ");
        System.out.println("--------------------------------------");
        removeLL.printList();

        System.out.println("\nRemoved node: ");
        System.out.println("-------------");
        System.out.println(removeLL.remove(2).value);
        System.out.println("\nLinked List after remove() in middle: ");
        System.out.println("-------------------------------------");
        removeLL.printList();

        System.out.println("\nRemoved node: ");
        System.out.println("-------------");
        System.out.println(removeLL.remove(0).value);
        System.out.println("\nLinked List after remove() of first node: ");
        System.out.println("-----------------------------------------");
        removeLL.printList();

        System.out.println("\nRemoved node: ");
        System.out.println("-------------");
        System.out.println(removeLL.remove(2).value);
        System.out.println("\nLinked List after remove() of last node: ");
        System.out.println("----------------------------------------");
        removeLL.printList();

        // #10 Reverse operation
        LinkedListV6 reverseLL = new LinkedListV6(1);
        reverseLL.append(2);
        reverseLL.append(3);
        reverseLL.append(4);

        System.out.println("\nLinked List before reverse() operation: ");
        System.out.println("---------------------------------------");
        reverseLL.printList();

        reverseLL.reverse();
        System.out.println("\nLinked List after reverse() operation: ");
        System.out.println("--------------------------------------");
        reverseLL.printList();
    }
}
