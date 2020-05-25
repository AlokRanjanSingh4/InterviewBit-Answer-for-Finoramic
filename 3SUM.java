public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int closest = 0, min = Integer.MAX_VALUE;
        for(int i=0; i<A.size()-2; i++) {
            int l = i+1, r = A.size()-1;
            while(l < r) {
                int sum = A.get(i) + A.get(l) + A.get(r);
                int diff = Math.abs(sum - B);
                if(diff == 0) {
                    return B;
                } else if(diff < min) {
                    min = diff;
                    closest = sum;
                } else if(sum <= B) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return closest;
    }
}