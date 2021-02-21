class TimeMap {
    
    Map<String,List<Data>> map;

    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<Data>());
        map.get(key).add(new Data(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) {
            return "";
        } else {
            return binarySearch(map.get(key),timestamp);
        }
    }
    
    
    public String binarySearch(List<Data> list, int timestamp) {
        int low = 0;
        int high = list.size()-1;
        
        while(low<high) {
            
            int mid = (low + high + 1) >> 1;
            if(list.get(mid).timestamp<=timestamp) {
                low  = mid;
            } else {
                high = mid - 1;
            }
            
        }
        
        
        return list.get(low).timestamp <= timestamp?list.get(low).value:"";
        
        
    }
}


class Data {
    String value;
    int  timestamp;
    
    public Data(String value, int timestamp) {
        
        this.value = value;
        this.timestamp = timestamp;
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */