public class TrappingRain {
    public static void main(String[] args) {
        int []heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(findRainDrop(heights));
    }

    private static int findRainDrop(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        int result = 0;
        int level = 0;
        int leftIndex = 0;
        int rightIndex = heights.length-1;
        while(leftIndex < rightIndex){
            //finding the min between max left and max right wall
            int lower = heights[heights[leftIndex]<heights[rightIndex]?leftIndex++:rightIndex--];
            level = Math.max(level,lower);
            result+= level-lower;
        }

        return result;
    }
}
//lower = heights[1]=1 level 1
//lower = heights[2]=0 level 1
//lower = heights[9]=1 level 2 drop 1
//lower = heights[4]=1 level 2 drop 1
//lower = heights[8]=2 level 2
//lower = heights[5]=0 level 2 drop 2
//lower = heights[6]=1 level 2 drop 1
//lower = heights[7]=3 level 3 drop 0
//lower = heights[7]=2 level 3 drop 1