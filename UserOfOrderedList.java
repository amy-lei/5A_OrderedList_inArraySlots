public class UserOfOrderedList{
    public static void main(String[] arg){
        OrderedList_inArraySlots list = new OrderedList_inArraySlots();
        
        // test toString and size
        System.out.println( "Testing toString() and size()");
        System.out.println( "numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            + System.lineSeparator()
                            );
       
       // test add
        System.out.println( "Testing add(val)");
        list.add( 23); // add to empty list
        System.out.println( "numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );
        list.add( 4); // add to beginning
        System.out.println( "numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );
        list.add( 10); // add to middle
        System.out.println( "numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );
        list.add( 19); // add to middle
        System.out.println( "numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );
        list.add( 100); // add to end
        System.out.println( "numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );
        System.out.println( System.lineSeparator());
        
        // test get
        System.out.println( "Testing get(index)");
        System.out.println( list);
        System.out.println( "element number 0: " 
                            + list.get(0)
                            );
        System.out.println( "element number 2: " 
                            + list.get(2)
                            );
        System.out.println( "last element: " 
                            + list.get( list.size() -1)
                            );
        System.out.println( System.lineSeparator());

        
       // test remove
        System.out.println( "Testing remove(index)");
        list.remove( 0); // remove from beginning
        System.out.println( "After removing element0, numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );       
        list.remove( 2); // remove from middle
        System.out.println( "After removing element2, numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );       
        list.remove( list.size() - 1); // remove from end
        System.out.println( "After removing last element, numer of elements: " 
                            + list.size() 
                            + " list: "
                            + list
                            );       
        
    }
}