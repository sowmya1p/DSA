class MyCircularQueue {
    int que[];
    int count=0;
    int first=-1;
    int last=-1;
    int size;
    public MyCircularQueue(int k) {
        que=new int[k];
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(first==-1&&last==-1){
            first=last=0;
          //  st[last]=value;
        }
      //  if(count<=size){
        que[last]=value;
        last=(last+1)%size;
        count++;
       // last=(last+1)%size;
      //  }
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
       // if(count>0){
        first=(first+1)%size;
        count--;
       // }
       // first=(first+1)%size;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return que[first];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return que[(last-1+size)%size];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */