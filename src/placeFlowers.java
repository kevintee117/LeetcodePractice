public class placeFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i ++) {
            if(flowerbed[i] == 0) {
                //check to see if left plot is open
                if((i == 0 || flowerbed[i-1] == 0)
                        //check to see if right plot is open
                        && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                    //if its open, plant the flower
                    flowerbed[i] = 1;
                    //increment counter
                    count ++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        //if the count is greater than or equal to n, that means all the flowers have been planted
        return count >= n;
    }
}
