public class trappedRainWater {

    public static void trapped_water(int[] height){
        // calc max left boundary array
        int l= height.length;
        int[] left_max= new int[l];
        left_max[0] = height[0];
        for(int i=1; i< l; i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        // calc max right boundary array
        int[] right_max = new int[l];
        right_max[l-1]=height[l-1];
        for(int i= l-2; i>=0; i--){
            right_max[i]=Math.max(right_max[i+1] , height[i]);
        }

        int trappedWater=0;
        for(int i=0; i<l; i++){
            int waterlevel=Math.min(right_max[i], left_max[i]);
            trappedWater+=waterlevel-height[i];
        }
        System.out.println("Total trapped water = "+trappedWater);

    }


    public static void main(String[] arg){
        int[] height={4,2,0,6,3,2,5};
        trapped_water(height);
    }
}
