      R-2.2 
      One software application in which adaptability can mean the difference between a prolonged lifetime and bankruptcy would 
      be all the Online Banking programs. With this type of application a customer of said bank can complete their transaction
      from their home computers or their cell phones. It have a prolonged lifetime since technology keeps advancing and soon 
      robots with this similar program use can replace the bank workers.

      R-2.3 Describe a component from a text-editor GUI and the methods that it encapsulates
      GUI is graphical user interface and with its component the user interacts with them. Interactions mean 
      from scrolling, clicking, entering input. The ability for Buttons has a lot of function so like Show(), 
      Resize(int,int), Move(int,int).

      R-2.4.
      One problem occurs when you try to get the penalty since the when you call charge() method you’re 
      recursively calling the PredatoryCreditCard.charge() function. This leads to an infinite recursion.

      R-2.5 
      With this code we want to get the penalty of 5 dollars but this might not go through with calling the 
      function of super.charge(5) since they could have already went over. 

      R-2.6
      public static void main(String[] args)
      {
          FibonacciProgression fibProg = new FibonacciProgression(2,2);
          for(int i = 0 ; i < 8; i++)
          {
              fibProg.nextValue();
          }
          System.out.pringln(fibProg.nextValue();
      }


      R-2.7.
      Our text says that a long integer can is 2^(63)-1. If we were to increment the value to 
      128 it would call the function nextValue 2^(56)  times and ending on 2^(63) causing the integer to overflow.

      R-2.8.
      Yes it is possible. Interfaces have abstract methods that a class can implement. A class can’t 
      inherit an interface but interfaces can inherit other interfaces. So let’s say we have a parent 
      interface called shape and has the function length() and width(). We can have a child interface
      called triangle that inherited shape and that has methods height() and area(). That class would 
      have to have implement all 4 functions. Let's say we have another child interface called rectangle 
      that inherits from interface shape and has method perimeter() and area(). So, in this example we see 
      how we can mutually extend on interface to another interface

      R-2.9.
      One big disadvantage is the deep hole of constructors you would find yourself in. Once you get to like 
      class “M” you have to call ALL the methods. Also it isn’t time efficient for the compilers since it lags 
      to organize and decide on methods being overriden.

      R-2.10.
      With this shallow type of inheritance, when you are reusing code you can miss alike functions in other classes. And one of 
      the biggest reasons for inheritance is reusability. So by doing this shallow one you don’t use inheritance to its full potential
      and it’s messy.

      R-1.11.
      The output would be :
      Ship it.
      Buy it.
      Read it.
