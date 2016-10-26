public class ThreadPriority {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans = 0;		
		long half = 10000000L / 2;			
		ThreadAdd threadA = new ThreadAdd(half + 1, (half + half));				
		threadA.setName("Thread A");				
		threadA.setPriority(Thread.MIN_PRIORITY);				
		threadA.start();				
		ThreadAdd threadB = new ThreadAdd(half + 1, (half + half));				
		threadB.setName("Thread B");			
		threadB.setPriority(Thread.NORM_PRIORITY);			
		threadB.start();				
		ThreadAdd threadC = new ThreadAdd(half + 1, (half + half));				
		threadC.setName("Thread C");				
		threadC.setPriority(Thread.MAX_PRIORITY);				
		threadC.start();				
		long startTime = System.currentTimeMillis();				
		for (long i = 1; i <= half; i++) {					
		ans += i;			
		}			
		long endTime = System.currentTimeMillis();			
		System.out.println("Time taken from main Thread: "+ (endTime - startTime) + "\nSum from main thread: " + ans);			
	}
}
