//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      Map<String,Integer> map = new HashMap<>();
      for(int i=0;i<N;i++)
      {
         map.put(in.nextLine().trim(), in.nextInt());
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          System.out.println(map.containsKey(s) ? s + "=" + map.get(s) : "Not found");
      }
   }
}

