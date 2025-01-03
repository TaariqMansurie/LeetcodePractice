package arrays.hard;

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //calculate left max boundary - array helper
        int leftMax[] = new int [n];
        leftMax[0] = height[ 0]; // since nothing else is there on the left side
        for(int i=1; i<n; i++){ // since i=0 is already been calculated. 
            leftMax[i] = Math.max(height[i], leftMax[i-1]); // sincw we are calculating left amximum therefore, we will always look towards the left boundary of the current number.
        }

        // calculate right max boundary - array helper
        int rightMax[] = new int [height.length];
        rightMax[n-1] = height[n-1]; // since nothing else is there on the left side
        for(int i=n-2; i>=0 ; i--){ // since i=0 is already been calculated. 
            rightMax[i] = Math.max(height[i], rightMax[i+1]);   // sincw we are calculating right amximum therefore, we will always look towards the right boundary of the current number
        }
    
        int trappedWater = 0;   // initializaiton of trapped water, later we keep updating it with the correct value
        //loop
        for(int i = 0; i<n; i++){
            //calculating water level every time
            //waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = water level - height[i]
            trappedWater += waterlevel - height[i];
        }
        
        
        return trappedWater;
    }

    public static void main(String args[]){
        // int height[]= {4,2,0,6,3,2,5};
        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution soln = new Solution();
        int height[] = {4,2,0,3,2,5};
        System.out.println("Hence the trapped rainwater between the mountains is: " +soln.trap(height));
    }
}