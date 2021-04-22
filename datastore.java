
import java.util.*;
import java.time.LocalTime;
public class datastore


{
    
    
    Date date = new Date();
      
      
    HashMap<String,TreeMap<Long,Integer>> hm=new HashMap<>();// Stores data in HashMap
   
    void create(String key, int value,long time)
    {
       
       
        if(hm.containsKey(key))
        {
            System.out.println("Error , Key already exists");
        }
        else{
            if(key.matches("^[a-zA-Z]*$") && key.length()<=32)//check key is alphabetical
            {
                if(hm.size()<1024*1024*1024 && value<=16*1024*1024)
                {
                    hm.put(key, new TreeMap());
                    
                 
                    hm.get(key).put(date.getTime()+time, value);
                    
                }
                else{
                    System.out.println("Memory error");
                }
            }
            else{
                System.out.println("Key is invalid");
            }
        }
    }
    
    void read(String key)
    {
        
        
        
if(!hm.containsKey(key)){
            System.out.println("Error key not present");
        }
        
        
        
else
    {
        String str="Hello fucker";
    TreeMap<Long,Integer> tm=hm.get(key);
    long curr_time= date.getTime();
    
    
    if(tm.firstKey()!=0 && date.getTime()<tm.firstKey())
    {
        str=key+":"+tm.get(tm.firstKey());
        System.out.println(str);
    }
    else{
        System.out.println("time to leave expired");
    }
    
    }
     
    }
    
   
   
   void delete(String key)
    {
        
        
        
if(!hm.containsKey(key)){
            System.out.println("Error key not present");
        }
        
        
        
else
    {
        String str="Hello fucker";
    TreeMap<Long,Integer> tm=hm.get(key);
    
    /*
    long curr_time= date.getTime();
    
    
    if(tm.firstKey()!=0 && date.getTime()<tm.firstKey())
    {
        hm.remove(key);
    }
    else{
        System.out.println("time to leave expired");
    }
    
    */
    hm.remove(key);
    System.out.println("Successfully deleted given key "+key);
    
    }
     
    }
    
    
    
    
    
    
}
