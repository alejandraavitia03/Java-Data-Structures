
                package tester_2;
                //Author: Alejandra Avitia

                import java.util.LinkedList;
                import java.util.Queue;
                import java.util.HashMap;
                import java.util.Map;

                public class Books
                {
                    /*
                    * Data Structure to represent a book
                    * Properties: Author, Title, ISBN, available quantitiy
                    */
                   private class Book
                    {
                  // Properties of a book
                  private int quantity;
                  private String title;
                        private String isbn;
                        private String author;
                        private String checkedOutBy;
                  private Queue<String> waitingList;

                        //Constructor
                  public Book(int quantity, String title, String isbn, String author)
                        {
                            this.quantity = quantity;
                            this.title = title;
                            this.isbn = isbn;
                            this.author = author;
                            checkedOutBy = null;
                            waitingList = new LinkedList<String>();
                  }

                        // Getters
                        public int getQuantity()
                        {
                            return quantity; 
                        }
                  public String getTitle()
                        { 
                            return title; 
                        }
                  public String getISBN() 
                        { 
                            return isbn; 
                        }
                        public String getAuthor() 
                        {
                            return author; 
                        }
                  public String getLastRenter() 
                        {
                            return checkedOutBy; 
                        }
                  public Queue<String> getWaitingList() 
                        {
                            return waitingList;
                        }

                  // Setters
                        public void setQuantity(int quantity)
                        { 
                            this.quantity = quantity;
                        }
                        public void setTitle(String title) 
                        { 
                           this.title = title; 
                        }
                        public void setISBN(String isbn) 
                        { 
                            this.isbn = isbn; 
                        }
                        public void setAuthor(String author) 
                        { 
                            this.author = author;
                        }
                        public void setRenter(String checkedOutBy)
                        { 
                            this.checkedOutBy = checkedOutBy; 
                        }
                        public void adjustWaitingList(Queue<String> updatedWaitingList)
                        { 
                            waitingList = updatedWaitingList;
                        }
                    }

                    // HashMap, mapping a book to it's title
                    private HashMap<String, Book> books;

                    public Books() 
                    { 
                        books = new HashMap<String, Book>(); 
                    }

                    // Populate the HashMap
                    public String addBook(int quantity, String title, String isbn, String author)
                    {
                        Book newBook = new Book(quantity, title, isbn, author);
                  if(books.containsKey(title))
                        {
                            return "Book is already contained.";
                  }
                        else
                        {
                            books.put(title, newBook);
                        }
                        return "Book was succesfully added!";
                    }

                    /*
                        * Check out steps:
                        * 1. Check if the book exists
                  * 2. Check if there are any books left by book.quantity > 0
                  * 	2.a If not, add user to queue
                  * 3. Rent out the book
                    */
                    public String checkoutBook(String title, String studentName)
                    {
                  Book book = books.get(title);

                  // Check if book exists
                  if(book == null)
                        { 
                            return "Book does not exist."; 
                        }

                  // Check if we have any left or if there any people waiting in the queue
                  if(book.getQuantity() < 1 || book.getWaitingList().size() > 0) 
                        {
                            // get book, add person to queue and notify user
                            Queue<String> waitingList = book.getWaitingList();
                            waitingList.add(studentName);
                            book.adjustWaitingList(waitingList);

                            // add book back to our HashMap
                            books.put(title, book);
                            return "There are no more books left but you have been added to the waiting list with number: " + waitingList.size() + ".";
                  }

                        // If there are available books, update information and add back to HashMap.
                  book.setRenter(studentName);
                  book.setQuantity(book.getQuantity()-1);
                  books.put(title, book);
                  return "The book is yours!";
                    }

                    // Return book, adjust quantity and display the next person
                    // in queue to check out, if there's any
                    public String returnBook(String title)
                    {
                      Book book = books.get(title);
                        Queue<String> waitingList;
                  String ans = "";

                  // Check if book exists
                  if(book == null)
                        { 
                            return "This is not our book."; 
                        }

                        // Check if there's a waiting list and give book to next person
                  // If there isn't then adjust the quantity acoordingly.
                            waitingList = book.getWaitingList();
                            if(waitingList.size() > 0)
                            {
                    book.setRenter(waitingList.poll());
                    ans += "New person to rent book is " + book.getLastRenter() + ".\n";
                            }
                            else 
                            {
                    book.setRenter("None");
                    book.setQuantity(book.getQuantity()+1);
                            }

                        book.adjustWaitingList(waitingList);
                        books.put(title, book);
                        ans += "You succesfully returend the book.";
                  return ans;
                    }

                    // Iterate throught 'Books' HashMap and display the contents
                    // If a book has a waiting list, then dispaly the waiting list as well.
                    public String displayBooks()
                    {
                        String ans = "List of available Books:\n";
                        //For-each loop 
                        //for every entre e in entre set
                  for(Map.Entry e : books.entrySet())
                        {
                            ans += e.getKey() + ". " + "Number of available copies: " + 
                            books.get(e.getKey()).getQuantity() + ". ";

                            //If there is a waiting list, then display waiting list
                            if(books.get(e.getKey()).getWaitingList().size() > 0)
                            {
                    ans+= "The waiting list is: ";
                                //for-each
                                // for every name in waiting list, display
                    for(String name : books.get(e.getKey()).getWaitingList())
                                {
                                    ans+=name + ", ";
                                }
                            }
                            else
                            {
                    ans+="There is no waiting list on the book.";
                            }
                            ans+="\n";
                  }
                  ans+="\n";
                  return ans;
                    }
                }
                ==========================================
                /*
                 * To change this license header, choose License Headers in Project Properties.
                 * To change this template file, choose Tools | Templates
                 * and open the template in the editor.
                 */
                package tester_2;

                import java.util.ArrayList;

                public class Users
                {
                    private class User
                    {
                  private String name;
                  private int id;
                  private ArrayList<String> books;

                  public User(String name, int id)
                        {
                            this.name = name;
                            this.id = id;
                            books = new ArrayList<>();
                  }

                        //Getters    
                  public int getId() 
                        {
                            return id;
                        }
                  public String getName() 
                        {
                            return name;
                        }
                  public ArrayList<String> getCheckedOutBooks() 
                        {
                            return books;
                        }
                    }
                    private ArrayList<User> users;

                    //Constructor for Users public class
                    public Users() 
                    {
                        users = new ArrayList<User>();
                    }

                    public String addUser(String name, int id) 
                    {
                  try
                        {
                            User tmp = new User(name, id);
                            users.add(tmp);
                            return "User added!";
                  } 
                        catch(Exception e) 
                        {
                            return "Error adding user: " + e;
                  }
                    }

                    // Show users
                    public String displayUsers() 
                    {
                  String ans = "";
                  for(User u : users) 
                        {
                            ans += u.getName() + ", id: " + u.getId() + ".\n";
                  }
                  return ans;
                    }

                    // calls binary search, and decides what to return depending on return value
                    public String searchById(int id)
                    {
                  String ans = binarySearch(0, users.size()-1, id);
                  if(ans == null)
                        {
                            return "User not found!";
                        }
                  else
                        {
                            return ans;
                        }
                    }

                    // binary search performed on the already sorted users arrayList.
                    private String binarySearch(int start, int end, int target)
                    {
                  if(start > end)
                        {
                            return null;
                  }
                  int mid = start + (end-start)/2;
                  //System.out.println("start: " + start + ", mid: " + mid +", end: " + end);
                  if(users.get(mid).getId() == target) 
                        {
                            return users.get(mid).getName();
                        }
                  if(target > users.get(mid).getId())
                        {
                            return binarySearch(mid+1, end, target);
                        }
                  else return binarySearch(start, mid-1, target);
                    }


                    // Sort users by id, call quickSort
                    public void sortUsers()
                    {
                  quickSort(0, users.size()-1);
                    }

                    // quicksort
                    private void quickSort(int lo, int hi)
                    {
                  // if the the part of the array has already been sorted
                  if(lo >= hi)
                        {
                            return;
                        }
                  int p = partition(lo, hi);
                  quickSort(lo, p-1);
                  quickSort(p+1, hi);
                    }

                    /* 
                    * To find out where the index of partition will be.
                    * For simplicity purposes we will always choose pivot to be the last element,
                    * but the effiency could be improved by choosing a random pivot.
                    */
                    private int partition(int lo, int hi)
                    {
                  int i = lo;
                  for(int j = i; j < hi; j++)
                        {
                            if(users.get(j).getId() < users.get(hi).getId())
                            {
                    swap(i, j);
                    i++;
                            }
                  }
                  swap(i, hi);
                  return i;
                    }

                    // to swap elements in the users array list
                    private void swap(int i, int j)
                    {
                        User tmp = users.get(i);
                  users.set(i, users.get(j));
                  users.set(j, tmp);
                    }
                }
                =============================================
                package tester_2;

                /**
                 *
                 * @author pita
                 */
                public class Tester_2
                {
                    public static void main(String[] args)
                    {
                  Books books = new Books();
                  System.out.println(books.addBook(1, "The Alchemist", "189-hn3-038n", "Paulo Cohelo"));
                  System.out.println(books.addBook(2, "Mary Had a Little Lamb", "37h-193a-9jj", "Mozart"));
                  System.out.println(books.addBook(3, "Calculus 1", "777-777-7777", "Newton"));

                  System.out.println(books.displayBooks());

                  // Test the Queue system with the Alchemist.		
                  System.out.println("Juan checks out 'The Alchemist'.");
                  System.out.println(books.checkoutBook("The Alchemist", "Juan"));
                  System.out.println(books.displayBooks());

                  System.out.println("Pablo checks out 'The Alchemist'.");
                  System.out.println(books.checkoutBook("The Alchemist", "Pablo"));
                  System.out.println(books.displayBooks());

                  System.out.println("Manda checks out 'The Alchemist'.");
                  System.out.println(books.checkoutBook("The Alchemist", "Manda"));
                  System.out.println(books.displayBooks());

                  System.out.println("Juan returns 'The Alchemist'.");
                  System.out.println(books.returnBook("The Alchemist"));
                  System.out.println(books.displayBooks());

                  System.out.println("Pita checks out 'The Alchemist'.");
                  System.out.println(books.checkoutBook("The Alchemist", "Pita"));
                  System.out.println(books.displayBooks());

                  // Test the class User wich implements quicksort and binary search
                  Users users = new Users();
                  System.out.println(users.addUser("Pita", 852));
                  System.out.println(users.addUser("Beto", 658));
                  System.out.println(users.addUser("Juan", 966));
                  System.out.println(users.addUser("Manda", 10));
                  System.out.println(users.addUser("Pablo", 527));
                  System.out.println();

                  System.out.println("Displaying Users.");
                  System.out.println(users.displayUsers());
                  System.out.println("Displaying users after sorting.");

                        users.sortUsers();
                        System.out.println(users.displayUsers());

                  System.out.println("Searching for user with id: 527");
                  System.out.println("User is : " + users.searchById(527));
                  System.out.println("Searching for user with id: 3000");
                  System.out.println("User is : " + users.searchById(3000));
                  }
                }
