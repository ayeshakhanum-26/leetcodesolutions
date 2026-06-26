//import java.util.*;

public class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 1);

        int prefix = 0;
        int result = 0;

        for (int num : nums) {
            prefix += (num == target) ? 1 : -1;

            for (int count : map.headMap(prefix).values()) {
                result += count;
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return result;
    }
}