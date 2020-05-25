public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        HashMap<String, ArrayList<Integer>>map = new HashMap<>();
        
        for(int i=0; i<A.size(); i++) {
            char[] letters = A.get(i).toCharArray();
            Arrays.sort(letters);
            String word = String.valueOf(letters);
            if(map.get(word) == null) {
                ArrayList<Integer>count = new ArrayList<>();
                count.add(i+1);
                map.put(word, count);
            } else {
                map.get(word).add(i+1);
            }
        }
        return new ArrayList<>(map.values());
    }
}