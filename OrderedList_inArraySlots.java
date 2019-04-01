public class OrderedList_inArraySlots{
    // ==================================================
    // FIELDS
    private List_inArraySlots list; 
    
    
    

    // ==================================================
    // CONSTRUCTORS
    public OrderedList_inArraySlots(){
        list = new List_inArraySlots(); // instantiate empty list 
    }




    // ==================================================
    // METHODS
    
    /**
      @return the number of elements in this list     
     */
    public int size(){
        return list.size();
    }

    /**
      @return string representation of ordered list
      
      format: [ element0, element1, element2]
            
    */
    public String toString(){
        return list.toString();
    }
    
    /** 
      Appends @value in the right spot
    */ 
    public void add( int value){
        // if empty list, just add
        if (size() == 0) list.add(value);
        
        else{ int index;
              for( index = 0 ; index < size() ; index++ ){ 
                // add once at appropriate index
                if (value <= list.get(index)) { 
                    list.add( index, value);
                    return; // to exit forloop
                    }                    
                }
              
              // reached end of the list? add at end 
              list.add( index, value);
        }
        
    }
    
    
    /**
     @return value corresponding to the given index
     */
    public int get(int index){
        return list.get(index);
    }
        
    /** 
      Removes value at given @index
      
      @return value removed, by convention
    */
    public int remove( int index){
        return list.remove(index);
    }
    
        
}