public class Like9 {
    public class Kata {

        public static long divisibleCount(long x, long y, long k) {
            long count = 0;
            while(x%k != 0){
                x++;
            }
            while(y%k != 0){
                y--;
            }
            return (y-x)/k+1;
        }

    }
}
