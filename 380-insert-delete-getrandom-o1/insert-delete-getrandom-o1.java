class AllInOne<T> {
    Map<T, Integer> map = new HashMap<T, Integer>();
    ArrayList<T> list = new ArrayList<T>();
    Random rand = new Random();

    boolean add(T val) {
        if (val == null || map.get(val) != null)
            return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    boolean remove(T val) {
        if (val == null || map.get(val) == null)
            return false;
        int indexInList = map.get(val);
        int lastValidIndex = list.size() - 1;
        T lastValidIndexEle = list.get(lastValidIndex);
        map.put(lastValidIndexEle, indexInList);
        list.set(indexInList, lastValidIndexEle);
        swap(indexInList, lastValidIndex);
        map.remove(val);
        list.remove(list.size() - 1); //remove the last element in O(1) time
        return true;
    }

    T removeRandomElement() {
        int randIndex = rand.nextInt(list.size());
        T target = list.get(randIndex);
        // if(remove(target)) {
        //   return target;
        // }
        return target;
    }

    void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}

class RandomizedSet {
    AllInOne<Integer> allInOne = new AllInOne<Integer>();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        return allInOne.add(val);
    }

    public boolean remove(int val) {
        return allInOne.remove(val);
    }

    public int getRandom() {
        return allInOne.removeRandomElement();
    }
}