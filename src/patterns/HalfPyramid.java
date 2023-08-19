package patterns;

public class HalfPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("9");

            }
            System.out.println();

        }

    }
}

      /* output
        9
        99
        999
        9999  */

/*
Output:
*
**
***
****
*****
*/


