            /*
             * To change this license header, choose License Headers in Project Properties.
             * To change this template file, choose Tools | Templates
             * and open the template in the editor.
             */
            package stacksandqueues;
            import java.util.ArrayList;
            /**
             *
             * @author pita
             */
            public class ArrayStack implements IStack
            {
                ArrayList<Integer> myData;


                public ArrayStack()
                {
                    myData = new ArrayList<Integer>();

                }
                @Override
                public void push(Integer itemToPush) 
                {
                    myData.add(itemToPush);
                }

                @Override
                public Integer pop() 
                {
                    return myData.remove(myData.size() - 1);
                }

                @Override
                public Integer size() 
                {
                    return myData.size();

            }
            }
            ==========================
            /*
             * To change this license header, choose License Headers in Project Properties.
             * To change this template file, choose Tools | Templates
             * and open the template in the editor.
             */
            package stacksandqueues;

            /**
             *
             * @author pita
             */
            public interface IStack 
            {
                public void push(Integer itemToPush);
                public Integer pop();   
                public Integer size();

            }
            ================================
            /*
             * To change this license header, choose License Headers in Project Properties.
             * To change this template file, choose Tools | Templates
             * and open the template in the editor.
             */
            package stacksandqueues;

            /**
             *
             * @author pita
             */
            public class StacksAndQueues {

                /**
                 * @param args the command line arguments
                 */
                public static void main(String[] args) {
                    // TODO code application logic here
                    ArrayStack as = new ArrayStack();
                    as.push(1);
                    as.push(10);
                    as.push(100);
                    System.out.println(as.size());
                    System.out.println(as.pop());
                    System.out.println(as.pop());
                    System.out.println(as.pop());
                    System.out.println(as.size());
                }

            }
            =======================
