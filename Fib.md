
              public class FibonacciProgression extends Progression
              {
                  protected long prev;

                  public FibonacciProgression()
                  {
                      this(0,1);
                  }
                  public FibonacciProgression(long first, long second)
                  {
                      super(first);
                      prev = second - first;
                  }
                  protected void advance()
                  {
                      long temp = prev;
                      prev = current;
                      current += temp;
                  }
              }
              ===========================
              /*
               * To change this license header, choose License Headers in Project Properties.
               * To change this template file, choose Tools | Templates
               * and open the template in the editor.
               */

              /**
               *
               * @author pita
               */
              public class Progression 
              {
                  public static void main(String[] args)
                  {
                      FibonacciProgression fibProg = new FibonacciProgression(2,2);
                      for (int i = 0; i < 8; i++)
                      {
                          fibProg.nextValue(); 
                      }
                      System.out.println(fibProg.nextValue());
                  }
                  protected long current;
                  public Progression()
                  {
                      this(0);
                  }
                  public Progression(long start)
                  {
                      current = start;
                  }
                  public long nextValue()
                  {
                      long answer = current;
                      advance();
                      return answer;
                  }
                  protected void advance()
                  {
                      current ++;
                  }
                  public void printProgression(int n)
                  {
                      System.out.print(nextValue());
                      for(int i = 1; i < n; i++)
                      {
                          System.out.print(" " + nextValue());
                          System.out.println();
                      }
                  }
              }
