import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorDemo {
	 public static void otherTask(String name)
	 {
	        System.out.println("I'm other task! "+name);
	    }



public static void main(String args[]) 
{
	ExecutorService executor = Executors.newFixedThreadPool(5);
	
	executor.submit(() -> System.out.println("I'm Runnable task."));

	 Future<Integer> future = executor.submit(() -> {
         System.out.println("I'm Callable task.");
         return 1 + 1;
	 });
	 
	 try {

         otherTask("Before Future Result");
         Integer result = future.get(5, TimeUnit.SECONDS);

         System.out.println("Get future result : " + result);

         otherTask("After Future Result");


     } catch (InterruptedException e) {
         e.printStackTrace();
     } catch (ExecutionException e) {
         e.printStackTrace();
     } catch (TimeoutException e) {
         e.printStackTrace();
     } finally {

         executor.shutdown();

     }
	
	
}
}