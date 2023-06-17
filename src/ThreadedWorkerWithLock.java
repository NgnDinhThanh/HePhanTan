public class ThreadedWorkerWithLock extends Thread{
    private final ResourcesExploiterWithLock rExp;

    public ThreadedWorkerWithLock(ResourcesExploiterWithLock rExp) {
        this.rExp = rExp;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 1000; i++) {
            rExp.exploit();
            System.out.println(name + ": " + rExp.getRsc());
        }
    }
}
