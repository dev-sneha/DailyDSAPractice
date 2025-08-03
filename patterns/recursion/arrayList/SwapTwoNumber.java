
import java.util.ArrayList;

class SwapTwoNumber{

    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
         list.add(5);
          list.add(9);
           list.add(6);
            list.add(8);

            int indx1 =1 , indx2=3;

            swap(list, indx1, indx2);
            System.out.println(list);
    }
}