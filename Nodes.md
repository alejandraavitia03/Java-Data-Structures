                /**
                 *
                 * @author pita
                 */
                public class CircularNode 
                {
                    Integer data = null;
                    CircularNode next = null; //Link to another node
                    CircularNode prev = null;

                    public CircularNode(Integer data)
                    {
                        this.data = data;
                    }

                    public CircularNode retrieve(Integer index,CircularNode head)
                    {
                        if(index != 0)
                        {
                           return this.next.retrieve(--index, head);
                        }
                        else 
                        {
                            return this;
                        }
                    }

                    public void add(CircularNode nodeToAdd, CircularNode head)
                    {
                        if (this.next == head)
                        {
                            this.next = nodeToAdd;
                            nodeToAdd.next = head;
                        }
                        else
                        {
                            this.next.add(nodeToAdd, head);
                        }
                    }

                    public void remove(CircularNode head) 
                    {

                        if(this.next.next == head)
                        {
                            //We have found the tail 
                            this.next = head;
                        }
                        else
                        {
                            this.next.remove(head);
                        }
                    }
                    public CircularNode search(Integer intToFind, CircularNode head)
                    {
                        if(this.data == intToFind)
                        {
                            return this;
                        }
                        else if (this.next == null)
                        {
                            return null;
                        }
                        else
                        {
                            return this.next.search(intToFind, head);
                        }
                    }
                }
                ===========================================================

                import java.util.LinkedList;

                /*
                    1.Collections
                        a. Unordered
                            -order doesnt matter
                            -no sorting
                        b.Ordered
                            -Order matters
                            -sorting
                            -examples
                                -arrays
                                -array list
                                -list
                                -linked list
                                    -Circularly linked
                                    -double linked 
                    2. O(n) = linear time
                    3. O(1) = constant time
                    4. 4 operations:
                        a. Retrieving 
                            -an item from an array = O(1)
                            -an item from a linked list = O(n)
                        b. Adding 
                            - an item from an array = O(n)
                            - an item from a linked list = O(1)
                        c. Removing 
                            - an item from an array = O(n)
                            - an item from a linked list = O(1)
                        d. search 
                            - an item from an array = O(n)
                            - an item from a linked list = O(n)

                 */
                public class HighScoreList
                {
                    public static void main(String[] args)
                    {
                        Node head = new Node(5);
                        head.add(new Node(10));
                        head.add(new Node(15));
                        head.add(new Node(20));
                        head.add(new Node(25));
                        System.out.println(head.retrieve(2).data);
                        System.out.println(head.search(20));
                        head.remove();
                        System.out.println(head.search(25));
                        head.remove();

                        LinkedList<Integer> l1 = new LinkedList();
                        l1.add(5);
                        l1.add(10);
                        l1.add(15);
                        System.out.println(l1.get(2));
                        LinkedList<Integer> l2 = new LinkedList();
                        l2.add(5);
                        l2.add(10);
                        l2.add(15);


                        System.out.println(l1 == l2);

                    }
                }
                ===================
                /**
                 *
                 * @author pita
                 */
                public class Node 
                {
                    Integer data = null;
                    Node next = null; //Link to another node

                    public Node(Integer data)
                    {
                        this.data = data;
                    }

                    public Node retrieve(Integer index)
                    {
                        if(index != 0)
                        {
                           return this.next.retrieve(--index);
                        }
                        else 
                        {
                            return this;
                        }
                    }

                    public void add(Node nodeToAdd)
                    {
                        if (this.next == null)
                        {
                            this.next = nodeToAdd;
                        }
                        else
                        {
                            this.next.add(nodeToAdd);
                        }
                    }

                    public void remove() 
                    {
                        if(this.next == null)
                        {
                            //Im in a single node liked list delete me
                            System.out.println("Nope");
                        }
                        else if(this.next.next == null)
                        {
                            //We know the next one is the tail cut it off 
                            this.next=null;
                        }
                        else
                        {
                            this.next.remove();
                        }
                    }
                    public Node search(Integer intToFind)
                    {
                        if(this.data.equals(intToFind))
                        {
                            return this;
                        }
                        else if (this.next == null)
                        {
                            return null;
                        }
                        else
                        {
                            return this.next.search(intToFind);
                        }
                    }
                }
                ==========================================================
