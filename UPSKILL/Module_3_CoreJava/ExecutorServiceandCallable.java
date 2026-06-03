import java.util.concurrent.*;
class ExecutorServiceandCallable{
    public static void main(String[] args)throws Exception{
        ExecutorService executor=Executors.newFixedThreadPool(2);
        Callable<Integer> t1=()->10+20;
        Callable<Integer> t2=() ->30+40;
        Future<Integer> r1=executor.submit(t1);
        Future<Integer> r2=executor.submit(t2);
        System.out.println("Result 1 = "+r1.get());
        System.out.println("Result 2 = "+r2.get());
        executor.shutdown();
    }
}