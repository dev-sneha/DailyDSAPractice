class FriendsParing{


    public static int friendsParing(int n){
        if(n==1||n==2){
            return n;
        }

        //choice single
        int fnm1 = friendsParing(n-1);
        //pair

        int fnm2 = friendsParing(n-2);
        int pair =(n-1) * fnm2;

        int totalWays = fnm1 + pair;
        return totalWays;
    }


    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }


}