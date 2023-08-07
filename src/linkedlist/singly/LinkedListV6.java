package linkedlist.singly;

/**
 * <p> #1. Linked List: Constructor </p>
 * <p> Write a Java class called LinkedList that represents a singly linked list. </p>
 * <p>
 * <p> The class should have the following properties and methods: </p>
 * <p> 1. A private Node object called head that points to the first node in the linked list. </p>
 * <p> 2. A private Node object called tail that points to the last node in the linked list. </p>
 * <p> 3. A private integer attribute called length that represents the number of nodes in the linked list. </p>
 * <p> 4. A nested Node class with the following attributes: </p>
 * <p> 4.1 An integer attribute called value that stores the value of the node.</p>
 * <p> 4.2 A Node object called next that points to the next node in the linked list. </p>
 * <p> 4.3 A constructor that accepts an integer value as an argument and initializes the value attribute. </p>
 * <p> 5. A constructor for the LinkedList class that accepts an integer value as an argument and performs the following tasks: </p>
 * <p> 5.1 Create a new Node object called newNode with the given value. </p>
 * <p> 5.2 Set both the head and tail pointers of the list to the newNode. </p>
 * <p> 5.3 Set the length attribute of the list to 1. </p>
 * </p>
 * <p>
 * <p> #2. Linked List: Append </p>
 * <p> Implement the append method that appends a new node to the end of the linked list. </p>
 * <p> Return type: void </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. Accept an integer value as an argument, which will be the value of the new node. </p>
 * <p> 2. Create a new Node object called newNode with the given value. </p>
 * <p> 3. If the length of the linked list is 0, set both the head and tail pointers of the list to the newNode. </p>
 * <p> 4. If the length of the linked list is greater than 0, perform the following tasks: </p>
 * <p> 4.1 Set the next attribute of the current tail node to the newNode. </p>
 * <p> 4.2 Update the tail pointer of the list to point to the newNode. </p>
 * <p> 5. Increment the length attribute of the list by 1. </p>
 * </p>
 * <p>
 * <p> #3. LL: Remove Last </p>
 * <p> Implement a method called removeLast that removes the last node from the linked list. </p>
 * <p> Return type: Node (we are returning the Node that is being removed) </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. If the length of the linked list is 0, return null. </p>
 * <p> 2. Create two variables that can point to a Node , temp and pre, both initially pointing to the head of the linked list. </p>
 * <p> 3. Traverse the linked list until temp.next is null, performing the following tasks during traversal: </p>
 * <p> 3.1 Update pre to point to the current temp node. </p>
 * <p> 3.2 Update temp to point to the next node in the linked list. </p>
 * <p> 4. After traversal, set the tail pointer to pre. </p>
 * <p> 5. Set the next attribute of the tail node to null. </p>
 * <p> 6. Decrement the length attribute of the list by 1. </p>
 * <p> 7. If the length of the linked list becomes 0 after removing the last node, set both the head and tail pointers to null. </p>
 * <p> 8. Return the removed node (pointed to by temp). </p>
 * </p>
 * <p>
 * <p> #4. LL: Prepend </p>
 * <p> Implement a method called prepend that adds a new node at the beginning of the linked list. </p>
 * <p> Return type: void </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. Accept an integer value as an argument, which will be the value of the new node. </p>
 * <p> 2. Create a new Node object called newNode with the given value. </p>
 * <p> 3. If the length of the linked list is 0, set both the head and tail pointers of the list to the newNode. </p>
 * <p> 4. If the length of the linked list is greater than 0, perform the following tasks: </p>
 * <p> 4.1 Set the next attribute of newNode to the current head node. </p>
 * <p> 4.2 Update the head pointer of the list to point to the newNode. </p>
 * <p> 5. Increment the length attribute of the list by 1. </p>
 * </p>
 * <p>
 * <p> #5. LL: Remove First </p>
 * <p> Implement a method called removeFirst that removes the first node from the linked list and returns it. </p>
 * <p> Return type: Node (the node that is removed) </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. If the length of the linked list is 0, return null. </p>
 * <p> 2. Create a temporary Node object called temp and set it to the current head node. </p>
 * <p> 3. Update the head pointer of the list to point to the next node in the list. </p>
 * <p> 4. Set the next attribute of temp to null. </p>
 * <p> 5. Decrement the length attribute of the list by 1. </p>
 * <p> 6. If the length of the list becomes 0 after removing the first node, set the tail pointer to null. </p>
 * <p> 7. Return the removed temp node.</p>
 * </p>
 * <p>
 * <p> #6. LL: Get </p>
 * <p> Implement a method called get that retrieves a node from the linked list by its index. </p>
 * <p> Return type: Node </p>
 * <p>
 * <p> The method should perform the following tasks:  </p>
 * <p> 1. Accept an integer index as an argument, which will be the index of the node to be retrieved. </p>
 * <p> 2. If the index is less than 0 or greater than or equal to the length of the linked list, return null. </p>
 * <p> 3. Create a temporary Node object called temp and set it to the current head node. </p>
 * <p> 4. Iterate through the linked list by updating temp to its next node until the desired index is reached. </p>
 * <p> 5. Return the node located at the specified index. </p>
 * </p>
 * <p>
 * <p> #7. LL: Set </p>
 * <p> Implement a method called set that updates the value of a node in the linked list by its index. </p>
 * <p> Return type: boolean </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. Accept an integer index as an argument, representing the index of the node to be updated. </p>
 * <p> 2. Accept an integer value as an argument, representing the new value to set for the node at the specified index. </p>
 * <p> 3. Call the get method with the provided index to obtain a pointer to the node at the specified index. </p>
 * <p> 4. If the node exists (i.e., the get method returns a non-null value), update the node's value with the provided value and return true. </p>
 * <p> 5. If the node does not exist (i.e., the get method returns null), return false. </p>
 * </p>
 * <p>
 * <p> #8. LL: Insert </p>
 * <p> Implement a method called insert that inserts a new node at a specified index in the linked list. </p>
 * <p> Return type: boolean </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. Accept an integer index as an argument, representing the index at which the new node should be inserted. </p>
 * <p> 2. Accept an integer value as an argument, representing the value of the new node. </p>
 * <p> 3. If the index is less than 0 or greater than the length of the list, return false. </p>
 * <p> 4. If the index is 0, call the prepend method with the provided value and return true. </p>
 * <p> 5. If the index is equal to the length of the list, call the append method with the provided value and return true. </p>
 * <p> 6. Create a new Node object called newNode with the provided value. </p>
 * <p> 7. Call the get method with the index minus 1 to obtain the node before the specified index. </p>
 * <p> 8. Update the next attribute of the newNode to point to the next attribute of the node before the specified index. </p>
 * <p> 9. Update the next attribute of the node before the specified index to point to the newNode. </p>
 * <p> 10. Increment the length attribute of the list by 1. </p>
 * </p>
 * <p>
 * <p> #9. LL: Remove </p>
 * <p> Implement a method called remove that removes a node at a specified index in the linked list. </p>
 * <p> Return type: Node (the node that has been removed) </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. Accept an integer index as an argument, representing the index of the node to be removed. </p>
 * <p> 2. If the index is less than 0 or greater than or equal to the length of the list, return null. </p>
 * <p> 3. If the index is 0, call the removeFirst method and return its result. </p>
 * <p> 4. If the index is equal to the length of the list minus 1, call the removeLast method and return its result. </p>
 * <p> 5. Call the get method with the index minus 1 to obtain the node before the specified index. </p>
 * <p> 6. Create a temporary Node object called temp and set it to the next attribute of the node before the specified index. </p>
 * <p> 7. Update the next attribute of the node before the specified index to point to the next attribute of the temporary Node object. </p>
 * <p> 8. Set the next attribute of the temporary Node object to null. </p>
 * <p> 9. Decrement the length attribute of the list by 1 and return temp node. </p>
 * </p>
 * <p>
 * <p> #10. LL: Reverse </p>
 * <p> Implement a method called reverse that reverses the order of the nodes in the linked list. </p>
 * <p> When solving the reverse() method, students are not allowed to create a new list or use any additional data structures besides the linked list itself. </p>
 * <p> They must reverse the nodes in the existing linked list by manipulating the pointers between them. </p>
 * <p> Return type: void </p>
 * <p>
 * <p> The method should perform the following tasks: </p>
 * <p> 1. Create a temporary Node object called temp and set it to the head attribute of the list. </p>
 * <p> 2. Set the head attribute of the list to the current tail attribute. </p>
 * <p> 3. Set the tail attribute of the list to the temporary Node object. </p>
 * <p> 4. Create a Node object called after and set it to the next attribute of the temporary Node object. </p>
 * <p> 5. Create a Node object called before and initialize it to null. </p>
 * <p> 6. Loop through the linked list using a for loop with a counter variable i, starting from 0 and ending at the length attribute of the list. </p>
 * <p>    a. Set the after attribute to the next attribute of the temporary Node object. </p>
 * <p>    b. Set the next attribute of the temporary Node object to the before attribute. </p>
 * <p>    c. Set the before attribute to the temporary Node object. </p>
 * <p>    d. Set the temporary Node object to the after attribute. </p>
 * <p> 7. The method has no return value. </p>
 * </p>
 */

public class LinkedListV6 {

    private NodeV6 head;
    private NodeV6 tail;
    private int length;

    public LinkedListV6(int value) {
        NodeV6 newNode = new NodeV6(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        NodeV6 temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }

        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");

        if (length == 0)
            System.out.println("empty");
        else
            printList();

    }

    public NodeV6 getHead() {
        if (head == null)
            System.out.println("Head: null");
        else
            System.out.println("Head: " + head.value);

        return head;
    }

    public NodeV6 getTail() {
        if (head == null)
            System.out.println("Tail: null");
        else
            System.out.println("Tail: " + tail.value);

        return tail;
    }

    public int getLength() {
        System.out.println("Length: " + length);
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        NodeV6 newNode = new NodeV6(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public NodeV6 removeLast() {
        if (length == 0) return null;

        NodeV6 temp = head;
        NodeV6 pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        NodeV6 newNode = new NodeV6(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public NodeV6 removeFirst() {
        if (length == 0) return null;

        NodeV6 temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0)
            tail = null;

        return temp;
    }

    public NodeV6 get(int index) {
        if (index < 0 || index >= length)
            return null;

        NodeV6 temp = head;

        for (int i = 0; i < index; i++)
            temp = temp.next;

        return temp;
    }

    public boolean set(int index, int value) {
        NodeV6 temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        NodeV6 newNode = new NodeV6(value);
        NodeV6 temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public NodeV6 remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0) return removeFirst();

        if (index == length - 1) return removeLast();

        NodeV6 prev = get(index - 1);
        NodeV6 temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        NodeV6 temp = head;
        head = tail;
        tail = temp;
        NodeV6 after = temp.next;
        NodeV6 before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}