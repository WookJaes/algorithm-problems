import java.util.LinkedHashMap;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        LinkedHashMap<String, Boolean> cache = 
            new LinkedHashMap<>(cacheSize, 0.75f, true);
        
        for (String city : cities) {
            city = city.toUpperCase();
            
            if (cache.get(city) != null) {
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    String oldest = cache.keySet().iterator().next();
                    cache.remove(oldest);
                }
                
                cache.put(city, true);
                answer += 5;
            }
        }
        
        return answer;
    }
}