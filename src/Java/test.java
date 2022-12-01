package Java;

import java.util.ArrayList;

class test {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>() ;
      list.add( "Ant" );
      list.add( "Bat" );
      list.add( "Car" );
      list.add( "Door" );
      list.add( "Euro" );

      list.set(2,"Bus");
      for(int i=0; i<list.size(); i++) {
         System.out.print(list.get(i));
      }
   }
}