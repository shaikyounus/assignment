import java.util.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;
public class Main extends Thread
{
    
    
    
	public static void main(String[] args) throws InterruptedException {
		datastore obj=new datastore();
		
		
		obj.create("src",70,1);
		obj.create("you",65,2);
		obj.create("vsh",67,1);
		
		obj.read("src");
			obj.read("you");
				obj.read("vsh");
				obj.read("qwerty");
		
	   
	    obj.create("src",23,4);
	    
	    obj.delete("src");
	    obj.delete("erty");
	    obj.delete("you");
	    obj.delete("vsh");
	    obj.create("abcgdgagdgsdsagydgsygdsyugdysugfydsggdsgffdyusgauds",60,1);
	    obj.create("!#@#%^@^&^&",45,10);
	    
		
	}
}

