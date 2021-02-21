class RandomizedSet {

    List<Integer> list;
    HashMap<Integer,Integer> map;
    Random rand = new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val,list.size());
            list.add(val);
             return true;
        }
        return false;
       
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        
        int index = map.get(val);
        map.remove(val);
        
        int size = list.size()-1;
        
        if(size!=index) {
            list.set(index, list.get(size));
            map.put(list.get(size),index);
            
        }
        list.remove(size);
           
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
       int index = rand.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */