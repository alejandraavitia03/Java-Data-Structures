
          package trees;

          /**
           *
           * @author pita
           */
          class Tree<T extends Comparable> {

              TreeNode<T> root;

              public void add(T data)
              {
                  if(root == null)
                  {
                      root = new TreeNode();
                      root.data = data;
                  }
                  else
                  {
                      root.add(data);
                  }
              }
              //searching
              public TreeNode search(TreeNode n, T termToSearch)
              {
                  //if node is null return null
                  if(n==null)
                  {
                      return null;
                  }
                  //if term to search is in n , return n
                  else if(n.data == termToSearch)
                  {
                      return n;
                  }              
                  //if termtosearch is less than alue at n, search left
                  else if(n.data > termToSearch)
                  {
                      return search(n.left, termToSearch);
                  }
                  //if termtosearch is greater than value at n search right
                  return search(n.right, termToSearch);
              }
              //print all the nodes of the ree using in-order traversal
              public void printInOrder(TreeNode n)
              {        
                  if(n == null)
                  {
                      return;
                  }
                  //GO down to the left until you hit the end and print
                 printInOrder(n.left);
                 //output yourself
                  System.out.println(n.data);
                  //Go down the right until you get the end and print
                  printInOrder(n.right);
              }

          }
          =========================
          /*
           * To change this license header, choose License Headers in Project Properties.
           * To change this template file, choose Tools | Templates
           * and open the template in the editor.
           */
          package trees;

          /**
           *
           * @author pita
           * @param <T>
           */
          public class TreeNode<T extends Comparable> {
              TreeNode<T> left;
              TreeNode<T> right;
              TreeNode<T> parent;

              T data; 
              public void add(T data)
              {
                  if(data.compareTo(this.data) < 0)
                  {
                      //check left
                      if(left == null)
                      {
                          //add a new tree node to the left
                          left = new TreeNode();

                          //add the data to that new tree node
                          left.data = data;
                          left.parent = this;
                      }
                      else
                      {
                          left.add(data);
                      }
                      //check left
                  } else
                  {
                      //check right
                      if(right == null)
                      {
                          //add a new tree node to the right
                          right = new TreeNode();
                          // add the data to that new tree node
                          right.data = data;
                          //Who's your daddy?
                          right.parent = this;

                      }
                      else
                      {
                          right.add(data);
                      }

                  }
              }
              @Override
              public String toString()
              {
                  return data.toString();
              }


          }
          ==========================
          /*
           * To change this license header, choose License Headers in Project Properties.
           * To change this template file, choose Tools | Templates
           * and open the template in the editor.
           */
          package trees;

          /**
           *
           * @author pita
           */
          public class Trees {

              /**
               * @param args the command line arguments
               */
              public static void main(String[] args) {
                  // TODO code application logic here
                  Tree<String> myTree = new Tree();
                  myTree.add("Hello");
                  myTree.add("There");
                  myTree.add("We");
                  myTree.add("Meet");
                  myTree.add("At");
                  myTree.add("Last");
                  myTree.add("General");
                  myTree.add("Kenobi");

                  myTree.printInOrder(myTree.root);
              }

          }
