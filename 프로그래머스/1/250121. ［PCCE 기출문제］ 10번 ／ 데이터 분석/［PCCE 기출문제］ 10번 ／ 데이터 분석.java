import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        int extIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);
        
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                list.add(row);
            }
        }
        
        list.sort((a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        
        return list.toArray(new int[0][]);
    }
    
    private int getIndex(String str) {
        switch (str) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
        }
        
        return -1;
    }
}