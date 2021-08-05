public class mystery { 
      public static void main(String[] args) {
        int list[] = {7, 3, 2, 0, 5};

        for (int i = 1; i < list.length; i++)
          list[i] = list[i] + list[i - 1];

        for (int i = 0; i < list.length; i++)
          System.out.print(list[i] + " ");
      }
    }